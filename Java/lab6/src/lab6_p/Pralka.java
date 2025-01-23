package lab6_p;

import lab6_p.komponenty.*;
import lab6_p.elementyWykonawcze.*;

public class Pralka {
    private Grzalka grzalka;
    private Beben beben;
    private Filtr filtr;
    private PojemnikNaDetergenty pojemnik;
    private Pompa pompa;
    private Czujnik czujnik;
    private Elektrozawor elektrozawor;
    private SilnikInwerterowy silnik;
    private Sterownik sterownik;
    private Panel panel;

    public Pralka(Grzalka grzalka, Beben beben, Filtr filtr, PojemnikNaDetergenty pojemnik,
                  Pompa pompa, Czujnik czujnik, Elektrozawor elektrozawor,
                  SilnikInwerterowy silnik, Sterownik sterownik, Panel panel) {
        this.grzalka = grzalka;
        this.beben = beben;
        this.filtr = filtr;
        this.pojemnik = pojemnik;
        this.pompa = pompa;
        this.czujnik = czujnik;
        this.elektrozawor = elektrozawor;
        this.silnik = silnik;
        this.sterownik = sterownik;
        this.panel = panel;
    }

    public void uruchomProgram(String program, int wagaUbran, int temperatura, int czasPraniaWstepnego, int czasPraniaZasadniczego, boolean dodatkowePlukanie, int predkoscWirowania) {
        if (!panel.jestWlaczona()) {
            System.out.println("Pralka jest wyłączona. Proszę włączyć pralkę.");
            return;
        }

        panel.wyswietlStatus("Uruchamianie programu: " + program);

        // Dodaj detergenty i płyn do płukania
        pojemnik.dodajDetergent();
        pojemnik.dodajPlynDoPlukania();

        System.out.println("\n--- Rozpoczęcie działania komponentów ---");
        grzalka.podgrzewaj();
        beben.obracaj();
        filtr.sprawdzDroznosc();

        System.out.println("\n--- Rozpoczęcie działania czujników ---");
        czujnik.zmierzCisnienie();
        czujnik.zmierzTemperature();
        czujnik.zmierzPoziomWody();
        czujnik.sprawdzSzcelnosc();
        if (czujnik.sprawdzWage(wagaUbran)) {
            System.out.println("Waga w porządku.");
        } else {
            System.out.println("Przekroczono maksymalną wagę!");
        }
        czujnik.sprawdzDroznoscFiltra();

        System.out.println("\nUstawienia programu:");
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("Czas prania wstępnego: " + czasPraniaWstepnego + " minut");
        System.out.println("Czas prania zasadniczego: " + czasPraniaZasadniczego + " minut");
        System.out.println("Dodatkowe płukanie: " + (dodatkowePlukanie ? "tak" : "nie"));
        System.out.println("Prędkość wirowania: " + predkoscWirowania + " obr/min");

        System.out.println("\nProgram " + program + " zakończony!");
    }
}