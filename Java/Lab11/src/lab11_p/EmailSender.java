package lab11_p;

// Jakarta Mail (1.6.7) & Activation (1.2.2)
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.Console;
import java.util.Properties;

public class EmailSender {

    public static void main(String[] args) {
        // Pobranie konsoli (do bezpiecznego wprowadzania danych)
        Console console = System.console();

        if (console == null) {
            System.err.println("Uruchom aplikację w terminalu/wierszu poleceń, aby użyć konsoli.");
            return;
        }

        // Pobranie danych logowania do konta studenckiego
        String emailLogin = console.readLine("Podaj nazwę użytkownika (numer indeksu): ");
        char[] passwordArray = console.readPassword("Podaj hasło do konta: ");
        String emailPassword = new String(passwordArray);

        // Konfiguracja serwera SMTP (UZ)
        Properties mailProperties = new Properties();
        mailProperties.put("mail.smtp.host", "poczta.stud.uz.zgora.pl");
        mailProperties.put("mail.smtp.port", "465");
        mailProperties.put("mail.smtp.auth", "true");
        mailProperties.put("mail.smtp.socketFactory.port", "465");
        mailProperties.put("mail.smtp.ssl.enable", "true");
        mailProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        // Tworzenie sesji z uwierzytelnieniem
        Session session = Session.getInstance(mailProperties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailLogin + "@stud.uz.zgora.pl", emailPassword);
            }
        });

        try {
            // Pobranie informacji o odbiorcy i treści wiadomości
            String recipientEmail = console.readLine("Podaj adres e-mail odbiorcy: ");
            String messageSubject = console.readLine("Podaj temat wiadomości: ");
            System.out.println("Wprowadź treść wiadomości (zatwierdź klawiszem Enter):");
            String messageContent = console.readLine();

            // Dodanie stopki informacyjnej do wiadomości
            messageContent += "\n---\nWiadomość wysłana przy użyciu aplikacji Java.";

            // Tworzenie wiadomości e-mail
            Message emailMessage = new MimeMessage(session);
            emailMessage.setFrom(new InternetAddress(emailLogin + "@stud.uz.zgora.pl"));
            emailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            emailMessage.setSubject(messageSubject);
            emailMessage.setText(messageContent);

            // Wysłanie wiadomości
            Transport.send(emailMessage);
            System.out.println("E-mail został wysłany pomyślnie!");

        } catch (MessagingException e) {
            System.err.println("Wystąpił błąd podczas wysyłania e-maila: " + e.getMessage());
        }
    }
}