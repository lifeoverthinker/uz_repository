package lab6_p;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        int temperaturaWody;
        int czasPraniaWstepnego;
        int czasPraniaZasadniczego;
        int dodatkowePlukanie;
        int predkoscObrotowaWirowania;

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz program (numer): ");
        System.out.println("1. Bawełna");
        System.out.println("2. Delikatne tkaniny");
        System.out.println("3. Szybkie pranie");
        System.out.println("4. Intensywne pranie");
        System.out.println("5. Inne");

        int program = sc.nextInt();

        switch (program) {
            case 1:
                temperaturaWody = 40;
                czasPraniaWstepnego = 0;
                czasPraniaZasadniczego = 60;
                dodatkowePlukanie = 1;
                predkoscObrotowaWirowania = 800;

                System.out.println("Wprowadzone ustawienia prania: ");
                System.out.println("Temperatura wody: " + temperaturaWody + "\nCzas prania wstepnego: " + czasPraniaWstepnego + "\nCzas prania zasadniczego: " + czasPraniaZasadniczego + "\nDodatkowe plukanie (cykle): " + dodatkowePlukanie + "\nPredkosc obrotowa wirowania: " + predkoscObrotowaWirowania + "obr./min.");
                break;

            case 2:
                temperaturaWody = 30;
                czasPraniaWstepnego = 45;
                czasPraniaZasadniczego = 2;
                dodatkowePlukanie = 2;
                predkoscObrotowaWirowania = 400;

                System.out.println("Wprowadzone ustawienia prania: ");
                System.out.println("Temperatura wody: " + temperaturaWody + "\nCzas prania wstepnego: " + czasPraniaWstepnego + "\nCzas prania zasadniczego: " + czasPraniaZasadniczego + "\nDodatkowe plukanie (cykle): " + dodatkowePlukanie + "\nPredkosc obrotowa wirowania: " + predkoscObrotowaWirowania + "obr./min.");
                break;

            case 3:
                temperaturaWody = 30;
                czasPraniaWstepnego = 0;
                czasPraniaZasadniczego = 15;
                dodatkowePlukanie = 1;
                predkoscObrotowaWirowania = 1000;

                System.out.println("Wprowadzone ustawienia prania: ");
                System.out.println("Temperatura wody: " + temperaturaWody + "\nCzas prania wstepnego: " + czasPraniaWstepnego + "\nCzas prania zasadniczego: " + czasPraniaZasadniczego + "\nDodatkowe plukanie (cykle): " + dodatkowePlukanie + "\nPredkosc obrotowa wirowania: " + predkoscObrotowaWirowania + "obr./min.");
                break;

            case 4:
                temperaturaWody = 60;
                czasPraniaWstepnego = 20;
                czasPraniaZasadniczego = 90;
                dodatkowePlukanie = 1;
                predkoscObrotowaWirowania = 1200;

                System.out.println("Wprowadzone ustawienia prania: ");
                System.out.println("Temperatura wody: " + temperaturaWody + "\nCzas prania wstepnego: " + czasPraniaWstepnego + "\nCzas prania zasadniczego: " + czasPraniaZasadniczego + "\nDodatkowe plukanie (cykle): " + dodatkowePlukanie + "\nPredkosc obrotowa wirowania: " + predkoscObrotowaWirowania + "obr./min.");
                break;

            case 5:
                System.out.println("Podaj temperature wody: ");
                temperaturaWody = sc.nextInt();

                System.out.println("Podaj czas prania wirowania: ");
                czasPraniaWstepnego = sc.nextInt();

                System.out.println("Podaj czas prania zasadniczego: ");
                czasPraniaZasadniczego = sc.nextInt();

                System.out.println("Podaj ilosc cykli dodatkowego plukania: ");
                dodatkowePlukanie = sc.nextInt();

                System.out.println("Podaj predkosc obrotowa wirowania [liczba]obr./min.: ");
                predkoscObrotowaWirowania = sc.nextInt();

                System.out.println("Wprowadzone ustawienia prania: ");
                System.out.println("Temperatura wody: " + temperaturaWody + "\nCzas prania wstepnego: " + czasPraniaWstepnego + "\nCzas prania zasadniczego: " + czasPraniaZasadniczego + "\nDodatkowe plukanie (cykle): " + dodatkowePlukanie + "\nPredkosc obrotowa wirowania: " + predkoscObrotowaWirowania + "obr./min.");
                break;

            default:
                System.out.println("Nie wybrano programu prania");
                break;
        }

    }
}
