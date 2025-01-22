package lab11_p;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 578923)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String serverMessage = in.readLine();
            System.out.println("Komunikat od serwera: " + serverMessage);

            if ("Wysłano komunikat do klienta".equals(serverMessage)) {
                out.println("Nawiązano komunikację i wysłano odpowiedź");
            }

            Thread.sleep(120000); // Oczekiwanie przez 120 sekund
            out.println("Kończę pracę");
            System.out.println("Klient zakończył działanie.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
