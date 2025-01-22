package lab11_p;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(578923)) {
            System.out.println("Serwer oczekuje na połączenie...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Połączono z klientem.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            out.println("Wysłano komunikat do klienta");
            String response = in.readLine();
            System.out.println("Odpowiedź klienta: " + response);

            if ("Nawiązano komunikację i wysłano odpowiedź".equals(response)) {
                Thread.sleep(5000);
                out.println("Połączenie zatwierdzone");
            } else {
                System.out.println("Błędna odpowiedź. Serwer wyłącza się.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
