package lab10_p;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zad1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            Thread watek = new Thread(new Watek(i));
            watek.start();
        }
    }
}

class Watek implements Runnable {
    private int numerWatku;

    public Watek(int numerWatku) {
        this.numerWatku = numerWatku;
    }

    @Override
    public void run() {
        try {
            String data = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            System.out.println("ID watku: " + Thread.currentThread().getId() + ", watek: " + numerWatku + ", data: " + data);

            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
