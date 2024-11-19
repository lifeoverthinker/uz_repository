package lab2_p;

import java.util.Scanner;
import java.lang.Math;

public class zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Inicjalizacja obiektu Scanner do wczytywania danych

        // Pobieranie współczynników równania kwadratowego od użytkownika
        System.out.println("Podaj wartosc a:");
        double a = scan.nextDouble();

        System.out.println("Podaj wartosc b:");
        double b = scan.nextDouble();

        System.out.println("Podaj wartosc c:");
        double c = scan.nextDouble();

        // Wyświetlenie wprowadzonego równania kwadratowego
        System.out.println("Twoje rownanie: " + a + "x^2 + " + b + "x + " + c + " = 0");

        // Obliczanie delty (Δ = b^2 - 4ac)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Sprawdzanie liczby rozwiązań równania na podstawie delty
        if (delta > 0) {
            // Dwa rozwiązania dla Δ > 0
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Rownanie ma dwa rozwiazania: \nx1 = " + x1 + "\nx2 = " + x2);
        } else if (delta == 0) {
            // Jedno rozwiązanie dla Δ = 0
            double x = -b / (2 * a);
            System.out.println("Rownanie ma jedno rozwiazanie: x = " + x);
        } else {
            // Brak rozwiązań dla Δ < 0
            System.out.println("Rownanie nie ma rozwiazan");
        }

        scan.close(); // Zamknięcie obiektu Scanner
    }
}
