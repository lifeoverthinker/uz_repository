package lab11_p;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.io.Console;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Console cons = System.console();
        Scanner sc = new Scanner(System.in);

        if (cons == null) {
            System.out.println("Brak dostępu do konsoli. Spróbuj uruchomić program z terminala.");
            return;
        }

        System.out.print("Podaj login (nr indeksu): ");
        String login = sc.nextLine();

        char[] hasloTablica = cons.readPassword("Podaj haslo: ");
        String haslo = new String(hasloTablica);

        Properties pr = new Properties();
        pr.put("mail.smtp.host", "poczta.stud.uz.zgora.pl");
        pr.put("mail.smtp.port", "465");
        pr.put("mail.smtp.auth", "true");
        pr.put("mail.smtp.socketFactory.port", "465");
        pr.put("mail.smtp.ssl.checkserveridentity", true);
        pr.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        pr.put("mail.smtp.socketFactory.fallback", "false");

        Session sesja = Session.getInstance(pr, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(login + "@stud.uz.zgora.pl", haslo);
            }
        });

        try {
            System.out.print("Podaj adres odbiorcy: ");
            String odbiorca = sc.nextLine();
            System.out.print("Podaj temat wiadomosci: ");
            String temat = sc.nextLine();
            System.out.print("Podaj tresc wiadomosci: ");
            String tresc = sc.nextLine();

            Message wiadomosc = new MimeMessage(sesja);
            wiadomosc.setFrom(new InternetAddress(login + "@stud.uz.zgora.pl"));
            wiadomosc.setRecipients(Message.RecipientType.TO, InternetAddress.parse(odbiorca));
            wiadomosc.setSubject(temat);
            wiadomosc.setText(tresc);

            Transport.send(wiadomosc);
            System.out.println("Wiadomosc zostala wyslana pomyslnie!");

        } catch (MessagingException e) {
            System.err.println("Wystąpil blad podczas wysylania wiadomosci: " + e.getMessage());
            e.printStackTrace();
        }
    }
}