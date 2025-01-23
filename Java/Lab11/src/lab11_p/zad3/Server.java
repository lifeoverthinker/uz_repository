package lab11_p.zad3;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(56783)) {
            System.out.println("Serwer: Oczekiwanie na połączenie...");

            Socket klient = serverSocket.accept();
            System.out.println("Serwer: Połączono z klientem.");

            BufferedReader wejscie = new BufferedReader(new InputStreamReader(klient.getInputStream()));
            PrintWriter wyjscie = new PrintWriter(klient.getOutputStream(), true);

            wyjscie.println("Wysłano komunikat do klienta");

            String odpowiedz = wejscie.readLine();
            System.out.println("Serwer: Otrzymano odpowiedź od klienta: " + odpowiedz);

            if ("Nawiązano komunikację i wysłano odpowiedź".equals(odpowiedz)) {
                System.out.println("Serwer: Poprawna odpowiedź, zatwierdzanie połączenia...");
                Thread.sleep(5000);
                wyjscie.println("Połączenie zatwierdzone");
            } else {
                System.out.println("Serwer: Zła odpowiedź, zamykanie połączenia.");
            }

            klient.close();
            System.out.println("Serwer: Połączenie zakończone.");
        } catch (IOException | InterruptedException e) {
            System.err.println("Serwer: Wystąpił błąd - " + e.getMessage());
        }
    }
}