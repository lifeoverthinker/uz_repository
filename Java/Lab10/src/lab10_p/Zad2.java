package lab10_p;

public class Zad2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            ZapisLoguThread watekZapisThread = new ZapisLoguThread(i);
            watekZapisThread.start();
        }

        for (int i = 1; i <= 5; i++) {
            Thread watekZapisRunnable = new Thread(new ZapisLoguRunnable(i));
            watekZapisRunnable.start();
        }

        for (int i = 1; i <= 2; i++) {
            Thread watekOdczyt = new Thread(new OdczytLogu(i));
            watekOdczyt.start();
        }
    }
}
