package lab6_p.elementyWykonawcze;

import java.util.Scanner;

public class Panel {
    private boolean wlaczona = false;

    public void wlacz() {
        wlaczona = true;
        System.out.println("Pralka włączona.");
    }

    public void wylacz() {
        wlaczona = false;
        System.out.println("Pralka wyłączona.");
    }

    public boolean jestWlaczona() {
        return wlaczona;
    }

    public void wyswietlStatus(String status) {
        System.out.println("Status: " + status);
    }

    public void zakonczProgram(Scanner sc) {
        wylacz();
        System.out.println("Zamykam program.");
        sc.close();
    }
}