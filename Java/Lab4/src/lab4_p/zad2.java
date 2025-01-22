package lab4_p;
import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] macierz = new int[7][7];
        int[][] minMax = new int[2][7];
        int[][] odwroconaMacierz = new int[7][7];

        // Wypełnienie macierzy losowymi liczbami
        for (int wiersz = 0; wiersz < 7; wiersz++) {
            for (int kolumna = 0; kolumna < 7; kolumna++) {
                macierz[wiersz][kolumna] = r.nextInt(100)+1; // Losowanie liczb od 1 do 99
            }
        }

        // Obliczanie minimum i maksimum dla każdej kolumny
        for (int kolumna = 0; kolumna < 7; kolumna++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int wiersz = 0; wiersz < 7; wiersz++) {
                if (macierz[wiersz][kolumna] < min) {
                    min = macierz[wiersz][kolumna];
                }
                if (macierz[wiersz][kolumna] > max) {
                    max = macierz[wiersz][kolumna];
                }
            }
            minMax[0][kolumna] = min;
            minMax[1][kolumna] = max;
        }

        // Obliczanie średniej arytmetycznej
        double suma = 0;
        int liczbaElementow = 0;
        for (int wiersz = 0; wiersz < 7; wiersz++) {
            for (int kolumna = 0; kolumna < 7; kolumna++) {
                suma += macierz[wiersz][kolumna];
                liczbaElementow++;
            }
        }
        double srednia = suma / liczbaElementow;

        // Liczenie elementów mniejszych i większych od średniej
        int liczbaMniejszych = 0;
        int liczbaWiekszych = 0;
        for (int wiersz = 0; wiersz < 7; wiersz++) {
            for (int kolumna = 0; kolumna < 7; kolumna++) {
                if (macierz[wiersz][kolumna] < srednia) {
                    liczbaMniejszych++;
                }
                if (macierz[wiersz][kolumna] > srednia) {
                    liczbaWiekszych++;
                }
            }
        }

        // Kopiowanie macierzy w odwrotnej kolejności
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                odwroconaMacierz[6 - i][6 - j] = macierz[i][j];
            }
        }

        // Wyświetlanie wyników
        System.out.println("Macierz:");
        for (int wiersz = 0; wiersz < 7; wiersz++) {
            for (int kolumna = 0; kolumna < 7; kolumna++) {
                System.out.print(macierz[wiersz][kolumna] + " \t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Minimum i maksimum dla każdej kolumny:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(minMax[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Odwrotna macierz:");
        for (int wiersz = 0; wiersz < 7; wiersz++) {
            for (int kolumna = 0; kolumna < 7; kolumna++) {
                System.out.print(odwroconaMacierz[wiersz][kolumna] + " \t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Średnia arytmetyczna: " + srednia);
        System.out.println("Liczba elementów mniejszych od średniej: " + liczbaMniejszych);
        System.out.println("Liczba elementów większych od średniej: " + liczbaWiekszych);
    }
}
