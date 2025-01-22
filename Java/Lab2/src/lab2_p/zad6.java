package lab2_p;

import java.util.Scanner;

public class zad6 {

    private static double obliczOprocentowanie(int miesiace) {
        if (1 < miesiace && miesiace <= 24) return 0.02; // Oprocentowanie 2% dla okresu 1-24 miesięcy
        if (24 < miesiace && miesiace <= 48) return 0.03; // Oprocentowanie 3% dla okresu 25-48 miesięcy
        if (48 < miesiace && miesiace <= 60) return 0.04; // Oprocentowanie 4% dla okresu 49-60 miesięcy
        if (60 < miesiace && miesiace <= 72) return 0.05; // Oprocentowanie 5% dla okresu 61-72 miesięcy
        if (72 < miesiace && miesiace <= 96) return 0.06; // Oprocentowanie 6% dla okresu 73-96 miesięcy
        throw new IllegalArgumentException("Liczba miesięcy poza zakresem (1 - 96).");
    }

    private static double obliczMiesiecznaRate(double calkowitaCena, double wkladWlasny, int miesiace) {
        return ((calkowitaCena - wkladWlasny) * (1 + obliczOprocentowanie(miesiace))) / miesiace;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wprowadzenie całkowitej kwoty leasingu
        System.out.print("Podaj kwotę całkowitą (PLN): ");
        double cena = scanner.nextDouble();

        // Sprawdzenie, czy kwota nie przekracza maksymalnej wartości
        if (cena > 300000) {
            System.out.println("Kwota całkowita przekracza maksymalną wartość 300000 PLN.");
            return;
        }

        // Wprowadzenie kwoty wkładu własnego
        System.out.print("Podaj kwotę wkładu własnego (PLN): ");
        double wkladWlasny = scanner.nextDouble();

        // Wprowadzenie liczby miesięcy spłaty
        System.out.print("Podaj liczbę miesięcy spłaty (max 96): ");
        int miesiace = scanner.nextInt();

        // Obliczenie miesięcznej raty leasingowej
        double miesiecznaRata = obliczMiesiecznaRate(cena, wkladWlasny, miesiace);

        // Wyświetlenie wyniku
        System.out.println("Miesięczna rata leasingowa wynosi: "+ miesiecznaRata + " PLN");
    }
}
