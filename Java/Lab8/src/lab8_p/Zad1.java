package lab8_p;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod();

        // Ustawienie danych samochodu 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane samochodu 2:");
        System.out.print("Marka: ");
        samochod2.setMarka(scanner.nextLine());
        System.out.print("Model: ");
        samochod2.setModel(scanner.nextLine());
        System.out.print("Pojemność silnika: ");
        samochod2.setPojemnoscSilnika(Double.parseDouble(scanner.nextLine()));
        System.out.print("Typ nadwozia: ");
        samochod2.setTypNadwozia(scanner.nextLine());
        System.out.print("Typ silnika: ");
        samochod2.setTypSilnika(scanner.nextLine());
        System.out.print("Rok produkcji: ");
        samochod2.setRokProdukcji(Integer.parseInt(scanner.nextLine()));
        System.out.print("Data pierwszej rejestracji: ");
        samochod2.setDataPierwszejRejestracji(scanner.nextLine());
        System.out.print("Cena: ");
        samochod2.setCena(Double.parseDouble(scanner.nextLine()));

        // Wyświetlenie danych samochodów
        System.out.println("Samochód 1:");
        samochod1.wypiszWszystkieDane();

        System.out.println("\nSamochód 2:");
        samochod2.wypiszWszystkieDane();

        // Sprawdzenie gwarancji
        String gwarancja = samochod2.getGwarancja() ? "Ważna" : "Wygasła";
        System.out.println("\nGwarancja samochodu 2: " + gwarancja);

        AutoKomis autoKomis = new AutoKomis();
        autoKomis.wypiszWszystkieDane();
    }
}
