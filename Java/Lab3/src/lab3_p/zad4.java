package lab3_p;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wciśnij '5' aby zakończyć");

        int liczba;
        int wynik = 1;

        while (true) {
            System.out.print("Podaj liczbę: ");
            liczba = sc.nextInt();

            if (liczba == 5) {
                break;
            }
            wynik *= liczba;
        }
        System.out.println("Iloczyn liczb: " + wynik);
    }
}
