package zad;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Suv suv = new Suv();

        System.out.println("Ustawianie wartości dla obiektu klasy Suv:");

        System.out.print("Podaj markę: ");
        suv.ustawMarke(scanner.nextLine());

        System.out.print("Podaj model: ");
        suv.ustawModel(scanner.nextLine());

        System.out.print("Podaj pojemność silnika (w litrach): ");
        suv.ustawPojemnosc(scanner.nextDouble());

        System.out.print("Podaj wysokość zawieszenia (w cm): ");
        suv.ustawWysokoscZawieszenia(scanner.nextDouble());

        scanner.nextLine(); // Odczyt pustej linii po liczbie

        System.out.print("Podaj typ silnika: ");
        suv.ustawTypSilnika(scanner.nextLine());

        // Wyświetlanie informacji za pomocą metody wyswietlInformacje()
        System.out.println("Typ silnika: ");
        System.out.println(suv.getTypSilnika());
    }
}
