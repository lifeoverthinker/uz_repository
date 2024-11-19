package lab2_p;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklaracja zmiennych dla prędkości w milach i kilometrach
        double km;
        double ml;

        // Pobranie prędkości w milach od użytkownika
        System.out.print("Podaj Predkosc samochodu w milach: ");
        ml = scanner.nextDouble(); // Odczyt wartości w milach i zapis do zmiennej `ml`

        // Konwersja prędkości z mil na kilometry
        km = ml * 1.6093440; // 1 mila = 1.609344 kilometra

        // Wyświetlenie wyniku konwersji
        System.out.println(ml + " mil to " + km + " Kilometrow");

        scanner.close();
    }
}
