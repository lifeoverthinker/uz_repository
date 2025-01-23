package lab11_p.zad3;

public class Zad3 {
    public static void main(String[] args) {
        Thread serwerWatek = new Thread(() -> {
            try {
                Server.main(null);
            } catch (Exception e) {
                System.err.println("Błąd w serwerze: " + e.getMessage());
            }
        });

        Thread klientWatek = new Thread(() -> {
            try {
                Client.main(null);
            } catch (Exception e) {
                System.err.println("Błąd w kliencie: " + e.getMessage());
            }
        });

        serwerWatek.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Błąd podczas opóźnienia: " + e.getMessage());
        }
        klientWatek.start();

        try {
            serwerWatek.join();
            klientWatek.join();
        } catch (InterruptedException e) {
            System.err.println("Błąd podczas oczekiwania na zakończenie wątków: " + e.getMessage());
        }
    }
}