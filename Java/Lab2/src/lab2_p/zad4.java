package lab2_p;

import java.lang.Math;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicjalizacja zmiennych
        int x; // Przechowuje aktualnie wprowadzoną liczbę
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0; // Liczba wprowadzonych liczb

        System.out.println("Wcisnij 'Enter' aby zakonczyc");

        // Pętla do wprowadzania liczb
        while (true) {
            System.out.print("Podaj liczbę: ");
            String input = scanner.nextLine();

            // Jeśli użytkownik wciśnie Enter bez podania liczby, zakończ wprowadzanie
            if (input.equalsIgnoreCase("")) {
                break;
            }

            x = Integer.parseInt(input); // Zamiana wprowadzonego tekstu na liczbę całkowitą

            count++; // Zwiększenie liczby wprowadzonych liczb
            sum += x; // Dodanie liczby do sumy

            // Aktualizacja najmniejszej liczby
            if (min > x) {
                min = x;
            }

            // Aktualizacja największej liczby
            if (max < x) {
                max = x;
            }
        }

        // Obliczenie średniej
        double srednia = count > 0 ? (double) sum / count : 0; // Zapobieganie dzieleniu przez 0

        // Wyświetlenie wyników
        System.out.println("Suma liczb to: " + sum);
        System.out.println("Ilośc liczb to: " + count);
        System.out.println("Średnia liczb to: " + srednia);
        System.out.println("Najmniejsza liczba to: " + min);
        System.out.println("Największa liczba to: " + max);

        scanner.close();
    }
}
