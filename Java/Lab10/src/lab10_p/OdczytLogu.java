package lab10_p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class OdczytLogu implements Runnable {
    private int numerWatku;

    public OdczytLogu(int numerWatku) {
        this.numerWatku = numerWatku;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("logi.txt"));
            String linia;
            int licznik = 0;
            int start = (numerWatku - 1) * 10;

            synchronized (System.out) {
                while ((linia = reader.readLine()) != null) {
                    if (licznik >= start && licznik < start + 10) {
                        System.out.println("Wątek " + numerWatku + ": " + linia);
                    }
                    licznik++;
                }
                System.out.println();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
