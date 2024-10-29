package lab2_p;

import java.util.Scanner;

public class Zad6 {

    private static double obliczOprocentowanie(int miesiace) {
        if (1 < miesiace && miesiace <= 24) return 0.02;
        if (24 < miesiace && miesiace <= 48) return 0.03;
        if (48 < miesiace && miesiace <= 60) return 0.04;
        if (60 < miesiace && miesiace <= 72) return 0.05;
        if (72 < miesiace && miesiace <= 96) return 0.06;
        throw new IllegalArgumentException("Liczba miesięcy poza nie miesci sie w zakresie (1 - 96).");
    }

    private static double obliczMiesiecznaRate(double calkowitaCena, double wkladWlasny, int miesiace) {
        return ((calkowitaCena - wkladWlasny) * (1 + obliczOprocentowanie(miesiace))) / miesiace;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj kwotę całkowitą (PLN): ");
        double cena = scanner.nextDouble();

        if (cena > 300000) {
            System.out.println("Kwota całkowita przekracza maksymalną wartość 300000 PLN.");
            return;
        }

        System.out.print("Podaj kwotę wkładu własnego (PLN): ");
        double wkladWlasny = scanner.nextDouble();
        System.out.print("Podaj liczbę miesięcy spłaty (max 96): ");
        int miesiace = scanner.nextInt();

        double miesiecznaRata = obliczMiesiecznaRate(cena, wkladWlasny, miesiace);


        System.out.printf("Miesięczna rata leasingowa wynosi: "+ miesiecznaRata);
    }
}