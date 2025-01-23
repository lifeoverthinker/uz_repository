package lab6_p;

import lab6_p.komponenty.*;
import lab6_p.elementyWykonawcze.*;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Grzalka grzalka = new Grzalka();
        Beben beben = new Beben();
        Filtr filtr = new Filtr();
        PojemnikNaDetergenty pojemnik = new PojemnikNaDetergenty();
        Pompa pompa = new Pompa();
        Czujnik czujnik = new Czujnik();
        Elektrozawor elektrozawor = new Elektrozawor();
        SilnikInwerterowy silnik = new SilnikInwerterowy();
        Sterownik sterownik = new Sterownik();
        Panel panel = new Panel();

        Pralka pralka = new Pralka(grzalka, beben, filtr, pojemnik, pompa, czujnik, elektrozawor, silnik, sterownik, panel);

        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj w symulatorze pralki!");

        System.out.print("Aby włączyć pralkę, wpisz 'on': ");
        String choice = sc.nextLine();

        if (choice.equals("on")) {
            panel.wlacz();

            System.out.println("\nWybierz program prania:");
            System.out.println("1. Bawełna");
            System.out.println("2. Syntetyki");
            System.out.println("3. Wełna");
            System.out.println("4. Delikatne");
            System.out.println("5. Szybkie");
            System.out.println("6. Tryb własny");

            System.out.print("\nWybrano: ");
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    uruchomProgram(pralka, panel, sc, "Bawełna", 40, 10, 30, false, 1200);
                    break;
                case "2":
                    uruchomProgram(pralka, panel, sc, "Syntetyki", 30, 5, 20, true, 800);
                    break;
                case "3":
                    uruchomProgram(pralka, panel, sc, "Wełna", 30, 5, 15, false, 600);
                    break;
                case "4":
                    uruchomProgram(pralka, panel, sc, "Delikatne", 20, 3, 10, true, 400);
                    break;
                case "5":
                    uruchomProgram(pralka, panel, sc, "Szybkie", 30, 0, 15, false, 1000);
                    break;
                case "6":
                    uruchomTrybWlasny(pralka, panel, sc);
                    break;
                default:
                    System.out.println("Nieznany wybór. Zamykam program.");
                    sc.close();
                    return;
            }

            panel.zakonczProgram(sc);
        } else if (choice.equals("off")) {
            panel.zakonczProgram(sc);
        } else {
            System.out.println("Nieznany wybór. Zamykam program.");
            sc.close();
        }
    }

    private static void uruchomProgram(Pralka pralka, Panel panel, Scanner sc, String program, int temperatura, int czasWstepny, int czasZasadniczy, boolean dodatkowePlukanie, int predkoscWirowania) {
        while (true) {
            System.out.print("Podaj wagę ubrań (w kg, maksymalnie 10 kg): ");
            int wagaUbran = sc.nextInt();
            sc.nextLine();

            Czujnik czujnik = new Czujnik();
            if (czujnik.sprawdzWage(wagaUbran)) {
                pralka.uruchomProgram(program, wagaUbran, temperatura, czasWstepny, czasZasadniczy, dodatkowePlukanie, predkoscWirowania);
                break;
            } else {
                System.out.println("Nie można uruchomić programu. Waga przekracza maksymalną dopuszczalną wartość (10 kg).");
                System.out.println("Spróbuj ponownie.\n");
            }
        }
    }

    private static void uruchomTrybWlasny(Pralka pralka, Panel panel, Scanner sc) {
        System.out.println("\n--- Tryb własny ---");

        int temperatura = wprowadzTemperature(sc);
        int czasWstepny = wprowadzCzas(sc, "Podaj czas prania wstępnego (w minutach, 0-30): ", 0, 30);
        int czasZasadniczy = wprowadzCzas(sc, "Podaj czas prania zasadniczego (w minutach, 10-60): ", 10, 60);
        boolean dodatkowePlukanie = wprowadzPlukanie(sc);
        int predkoscWirowania = wprowadzPredkosc(sc);

        wyswietlUstawienia("Tryb własny", temperatura, czasWstepny, czasZasadniczy, dodatkowePlukanie, predkoscWirowania);
        uruchomProgram(pralka, panel, sc, "Tryb własny", temperatura, czasWstepny, czasZasadniczy, dodatkowePlukanie, predkoscWirowania);
    }

    private static int wprowadzTemperature(Scanner sc) {
        while (true) {
            System.out.print("Podaj temperaturę wody (w °C, 20-90): ");
            int temperatura = sc.nextInt();
            sc.nextLine();
            if (temperatura >= 20 && temperatura <= 90) {
                return temperatura;
            } else {
                System.out.println("Nieprawidłowa temperatura. Wprowadź wartość między 20 a 90 °C.");
            }
        }
    }

    private static int wprowadzCzas(Scanner sc, String komunikat, int min, int max) {
        while (true) {
            System.out.print(komunikat);
            int czas = sc.nextInt();
            sc.nextLine();
            if (czas >= min && czas <= max) {
                return czas;
            } else {
                System.out.println("Nieprawidłowy czas. Wprowadź wartość między " + min + " a " + max + " minut.");
            }
        }
    }

    private static boolean wprowadzPlukanie(Scanner sc) {
        while (true) {
            System.out.print("Czy chcesz dodatkowe płukanie? (tak/nie): ");
            String odpowiedz = sc.nextLine();
            if (odpowiedz.equalsIgnoreCase("tak") || odpowiedz.equalsIgnoreCase("nie")) {
                return odpowiedz.equalsIgnoreCase("tak");
            } else {
                System.out.println("Nieprawidłowa odpowiedź. Wpisz 'tak' lub 'nie'.");
            }
        }
    }

    private static int wprowadzPredkosc(Scanner sc) {
        while (true) {
            System.out.print("Podaj prędkość wirowania (w obr/min, 400-1600): ");
            int predkosc = sc.nextInt();
            sc.nextLine();
            if (predkosc >= 400 && predkosc <= 1600) {
                return predkosc;
            } else {
                System.out.println("Nieprawidłowa prędkość. Wprowadź wartość między 400 a 1600 obr/min.");
            }
        }
    }

    private static void wyswietlUstawienia(String program, int temperatura, int czasWstepny, int czasZasadniczy, boolean dodatkowePlukanie, int predkoscWirowania) {
        System.out.println("\nZatwierdzone ustawienia dla programu '" + program + "':");
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("Czas prania wstępnego: " + czasWstepny + " minut");
        System.out.println("Czas prania zasadniczego: " + czasZasadniczy + " minut");
        System.out.println("Dodatkowe płukanie: " + (dodatkowePlukanie ? "tak" : "nie"));
        System.out.println("Prędkość wirowania: " + predkoscWirowania + " obr/min");
        System.out.println("----------------------------------------");
    }
}