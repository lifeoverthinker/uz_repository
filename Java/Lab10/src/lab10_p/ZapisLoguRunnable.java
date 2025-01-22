package lab10_p;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class ZapisLoguRunnable implements Runnable {
    private int numerWatku;

    public ZapisLoguRunnable(int numerWatku) {
        this.numerWatku = numerWatku;
    }

    @Override
    public void run() {
        try {
            FileWriter writer = new FileWriter("logi.txt", true);  // 'true' pozwala na dopisywanie
            for (int i = 0; i < 10; i++) {
                writer.write(generujLog());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String generujLog() {
        Random r = new Random();
        int idFilmu = r.nextInt(1000);
        int idUzytkownika = r.nextInt(100);
        int ocena = r.nextInt(6);  // Ocena w zakresie 0-5
        String dataGlosowania = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        return "id_filmu: " + idFilmu + ", id_uzytkownika: " + idUzytkownika + ", ocena: " + ocena + ", data_glosowania: " + dataGlosowania + "\n";
    }
}
