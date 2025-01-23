package lab11_p;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj licznik: ");
            int licznik = scanner.nextInt();

            System.out.print("Podaj mianownik: ");
            int mianownik = scanner.nextInt();

            int wynik = licznik / mianownik; // Wyjątek ArithmeticException
            System.out.println("Wynik: " + wynik);
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero");
        } finally {
            System.out.println("Program zakończony.");
            scanner.close();
        }
    }
}
