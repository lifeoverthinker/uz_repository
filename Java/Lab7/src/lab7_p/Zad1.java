package lab7_p;

import java.util.Random;

public class Zad1 {
    public static void main(String[] args) {
        // Generowanie 7 losowych liczb
        Random generator = new Random(888);
        double[] liczbyLosowe = new double[7];
        for (int i = 0; i < liczbyLosowe.length; i++) {
            liczbyLosowe[i] = generator.nextDouble(10) + 1;
        }

        // Przykład użycia klasy Kalkulator
        Kalkulator kalk1 = new Kalkulator(liczbyLosowe[0]);
        System.out.println("Wynik dodawania: " + kalk1.oblicz("+"));

        Kalkulator kalk2 = new Kalkulator(liczbyLosowe[0], liczbyLosowe[1], liczbyLosowe[2], liczbyLosowe[3]);
        System.out.println("Wynik odejmowania: " + kalk2.oblicz("-"));

        Kalkulator kalk3 = new Kalkulator(liczbyLosowe[0], liczbyLosowe[1], liczbyLosowe[2], liczbyLosowe[3], liczbyLosowe[4], liczbyLosowe[5], liczbyLosowe[6]);
        System.out.println("Wynik mnożenia: " + kalk3.oblicz("*"));

        Kalkulator kalk4 = new Kalkulator(kalk3);
        System.out.println("Wynik dzielenia: " + kalk4.oblicz("/"));
    }
}

class Kalkulator {
    private double[] liczby;

    // Konstruktor 1-argumentowy
    public Kalkulator(double liczba) {
        liczby = new double[1];
        liczby[0] = liczba;
    }

    // Konstruktor 4-argumentowy
    public Kalkulator(double liczba1, double liczba2, double liczba3, double liczba4) {
        liczby = new double[4];
        liczby[0] = liczba1;
        liczby[1] = liczba2;
        liczby[2] = liczba3;
        liczby[3] = liczba4;
    }

    // Konstruktor 7-argumentowy
    public Kalkulator(double liczba1, double liczba2, double liczba3, double liczba4, double liczba5, double liczba6, double liczba7) {
        liczby = new double[7];
        liczby[0] = liczba1;
        liczby[1] = liczba2;
        liczby[2] = liczba3;
        liczby[3] = liczba4;
        liczby[4] = liczba5;
        liczby[5] = liczba6;
        liczby[6] = liczba7;
    }

    // Konstruktor kopiujący
    public Kalkulator(Kalkulator inny) {
        liczby = new double[inny.liczby.length];
        System.arraycopy(inny.liczby, 0, liczby, 0, inny.liczby.length);
    }

    // Metoda do obliczeń
    public double oblicz(String operator) {
        double wynik = 0;

        switch (operator) {
            case "+":
                for (double liczba : liczby) {
                    wynik += liczba;
                }
                break;
            case "-":
                wynik = liczby[0];
                for (int i = 1; i < liczby.length; i++) {
                    wynik -= liczby[i];
                }
                break;
            case "*":
                wynik = 1;
                for (double liczba : liczby) {
                    wynik *= liczba;
                }
                break;
            case "/":
                wynik = liczby[0];
                for (int i = 1; i < liczby.length; i++) {
                    if (liczby[i] != 0) {
                        wynik /= liczby[i];
                    } else {
                        System.out.println("Dzielenie przez zero jest zabronione.");
                        return 0;
                    }
                }
                break;
            default:
                System.out.println("Nieznany operator: ");
                return 0;
        }
        return wynik;
    }
}
