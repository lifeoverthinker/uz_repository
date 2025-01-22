package lab7_p;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wybór danych przez użytkownika
        System.out.println("Chcesz wprowadzić własne dane? (tak/nie)");
        boolean wlasneDane = "tak".equalsIgnoreCase(scanner.nextLine());

        List<String> daneTekstowe;
        List<String[]> daneCSV;

        if (wlasneDane) {
            daneTekstowe = wprowadzDaneTekstowe(scanner);
            daneCSV = wprowadzDaneCSV(scanner);
        } else {
            // Domyślne dane
            daneTekstowe = List.of("Linia 1", "Linia 2", "Linia 3");
            daneCSV = List.of(
                    new String[]{"Imię", "Nazwisko", "Wiek"},
                    new String[]{"Jan", "Kowalski", "30"},
                    new String[]{"Anna", "Nowak", "25"}
            );
        }

        String tekstowyPlik = "plik.txt";
        String csvPlik = "plik.csv";

        // Zapis i odczyt pliku tekstowego
        zapiszDoPlikuTekstowego(tekstowyPlik, daneTekstowe);
        odczytajPlikTekstowy(tekstowyPlik);

        // Zapis i odczyt pliku CSV
        zapiszDoPlikuCSV(csvPlik, daneCSV);
        odczytajPlikCSV(csvPlik);

        scanner.close();
    }

    // Funkcja do wprowadzania danych tekstowych przez użytkownika
    private static List<String> wprowadzDaneTekstowe(Scanner scanner) {
        List<String> dane = new ArrayList<>();
        System.out.println("Podaj dane tekstowe (wpisz 'stop', aby zakończyć):");
        while (true) {
            String linia = scanner.nextLine();
            if ("stop".equalsIgnoreCase(linia)) break;
            dane.add(linia);
        }
        return dane;
    }

    // Funkcja do wprowadzania danych CSV przez użytkownika
    private static List<String[]> wprowadzDaneCSV(Scanner scanner) {
        List<String[]> dane = new ArrayList<>();
        System.out.println("Podaj dane CSV w formacie 'Imię,Nazwisko,Wiek' (wpisz 'stop', aby zakończyć):");
        dane.add(new String[]{"Imię", "Nazwisko", "Wiek"}); // Nagłówki
        while (true) {
            String linia = scanner.nextLine();
            if ("stop".equalsIgnoreCase(linia)) break;
            dane.add(linia.split(","));
        }
        return dane;
    }

    // Zapis do pliku tekstowego
    public static void zapiszDoPlikuTekstowego(String nazwaPliku, List<String> dane) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nazwaPliku))) {
            for (String linia : dane) {
                writer.write(linia);
                writer.newLine();
            }
            System.out.println("Dane zapisano do pliku: " + nazwaPliku);
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku tekstowego: " + e.getMessage());
        }
    }

    // Odczyt z pliku tekstowego
    public static void odczytajPlikTekstowy(String nazwaPliku) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            System.out.println("Zawartość pliku tekstowego:");
            String linia;
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu z pliku tekstowego: " + e.getMessage());
        }
    }

    // Zapis do pliku CSV
    public static void zapiszDoPlikuCSV(String nazwaPliku, List<String[]> dane) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nazwaPliku))) {
            for (String[] wiersz : dane) {
                writer.write(String.join(",", wiersz));
                writer.newLine();
            }
            System.out.println("Dane zapisano do pliku CSV: " + nazwaPliku);
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku CSV: " + e.getMessage());
        }
    }

    // Odczyt z pliku CSV
    public static void odczytajPlikCSV(String nazwaPliku) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            System.out.println("Zawartość pliku CSV:");
            String linia;
            while ((linia = reader.readLine()) != null) {
                String[] kolumny = linia.split(",");
                System.out.println(String.join(" | ", kolumny));
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu z pliku CSV: " + e.getMessage());
        }
    }
}
