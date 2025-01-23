package lab11_p.zad3;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 56783)) {
            System.out.println("Klient: Połączono z serwerem.");

            BufferedReader wejscie = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter wyjscie = new PrintWriter(socket.getOutputStream(), true);

            String komunikat = wejscie.readLine();
            System.out.println("Klient: Otrzymano komunikat od serwera: " + komunikat);

            if ("Wysłano komunikat do klienta".equals(komunikat)) {
                wyjscie.println("Nawiązano komunikację i wysłano odpowiedź");
                System.out.println("Klient: Wysłano poprawną odpowiedź do serwera.");
            }

            Thread.sleep(120000);
            wyjscie.println("Kończę pracę");
            System.out.println("Klient: Wysłano komunikat końcowy i zakończono pracę.");
        } catch (IOException | InterruptedException e) {
            System.err.println("Klient: Wystąpił błąd - " + e.getMessage());
        }
    }
}
