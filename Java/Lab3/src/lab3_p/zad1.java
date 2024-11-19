package lab3_p;

import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> parzyste = new ArrayList<>();
        ArrayList<Integer> nieparzyste = new ArrayList<>();
        int sum_p = 0;
        int sum_n = 0;
        double srednia_p = 0;
        double srednia_n = 0;
        int licznik_p = 0;
        int licznik_n = 0;

        System.out.println("Wciśnij 'Enter' aby zakończyć");

        while (true) {
            System.out.print("Podaj liczbę: ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("")) {
                break;
            }
            int liczba = Integer.parseInt(input);
            if (liczba % 2 == 0) {
                parzyste.add(liczba);
                sum_p += liczba;
                licznik_p++;
            } else {
                nieparzyste.add(liczba);
                sum_n += liczba;
                licznik_n++;
            }
        }

        System.out.println("\nLiczby parzyste: " + parzyste + "\nSuma parzystych: " + sum_p + "\nLicznik parzystych: " + licznik_p);
        System.out.println("\nLiczby nieparzyste: " + nieparzyste + "\nSuma nieparzystych: " + sum_n + "\nLicznik nieparzystych: " + licznik_n);

        // Obliczanie średnich
        if (licznik_p != 0) {
            srednia_p = (double) sum_p / licznik_p;
            System.out.println("\nŚrednia dla liczb parzystych: " + srednia_p);
        }

        if (licznik_n != 0) {
            srednia_n = (double) sum_n / licznik_n;
            System.out.println("Średnia dla liczb nieparzystych: " + srednia_n);
        }

        // Obliczenie i wyświetlenie stosunku srednich
        if (srednia_p != 0) {
            double ulamek = srednia_n / srednia_p;
            System.out.println("\nStosunek średniej arytmetycznej nieparzystych do parzystych: " + ulamek);

            // Sprawdzanie, czy stosunek jest liczbą całkowitą
            if (ulamek == (int) ulamek) {  // Sprawdzamy, czy ulamek jest całkowity
                int ulamekInt = (int) ulamek;
                if (czyLiczbaPierwsza(ulamekInt)) {
                    System.out.println("Ułamek (po zaokrągleniu) jest liczbą pierwszą");
                } else {
                    System.out.println("Ułamek (po zaokrągleniu) nie jest liczbą pierwszą");
                }
            } else {
                System.out.println("Ułamek nie jest liczbą całkowitą, nie można sprawdzić pierwszości");
            }
        } else {
            System.out.println("Brak parzystych cyfr, nie można obliczyć stosunku średnich.");
        }
    }

    public static boolean czyLiczbaPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }
}
