package lab5_p;

public class Zad2 {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod();

        samochod2.setMarka("Ford");
        samochod2.setModel("Mustang 1969");
        samochod2.setPojemnoscSilnika(4.7); // Pojemność silnika w litrach
        samochod2.setTypNadwozia("Fastback");
        samochod2.setTypSilnika("Benzynowy");
        samochod2.setRokProdukcji(1969);
        samochod2.setDataPierwszejRejestracji("1969-04-01");
        samochod2.setCena(200000.0);

        // Wyświetlenie danych samochodów
        System.out.println("Samochód 1:");
        samochod1.wypiszWszystkieDane();

        System.out.println("\nSamochód 2:");
        samochod2.wypiszWszystkieDane();

        // Sprawdzenie gwarancji
        String gwarancja = samochod2.getGwarancja() ? "Ważna" : "Wygasła";
        System.out.println("\nGwarancja samochodu 2: " + gwarancja);
    }
}

