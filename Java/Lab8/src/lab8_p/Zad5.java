package lab8_p;

import java.util.ArrayList;
import java.util.List;

public class Zad5 {
    public static void main(String[] args) {
        // Tworzymy listę samochodów
        List<Samochod> listaSamochodow = new ArrayList<>();

        // Dodajemy samochody
        Samochod samochod1 = new Samochod();
        samochod1.setMarka("Toyota");
        samochod1.setModel("Corolla");
        samochod1.setPojemnoscSilnika(1.6);
        samochod1.setRokProdukcji(2018);
        samochod1.setDataPierwszejRejestracji("2019-05-12");

        Samochod samochod2 = new Samochod();
        samochod2.setMarka("Honda");
        samochod2.setModel("Civic");
        samochod2.setPojemnoscSilnika(2.0);
        samochod2.setRokProdukcji(2020);
        samochod2.setDataPierwszejRejestracji("2020-08-10");

        Samochod samochod3 = new Samochod();
        samochod3.setMarka("Ford");
        samochod3.setModel("Fiesta");
        samochod3.setPojemnoscSilnika(1.2);
        samochod3.setRokProdukcji(2017);
        samochod3.setDataPierwszejRejestracji("2018-03-15");

        listaSamochodow.add(samochod1);
        listaSamochodow.add(samochod2);
        listaSamochodow.add(samochod3);

        System.out.println("Lista samochodów:");
        listaSamochodow.forEach(Samochod::wypiszWszystkieDane);

        // Wyodrębniamy pojemności silników, sortujemy je i wyświetlamy
        System.out.println("\nPosortowane pojemności silnika (rosnąco):");
        listaSamochodow.stream()
                .map(Samochod::getPojemnoscSilnika)  // Wyodrębnianie pojemności silnika
                .sorted()                            // Sortowanie rosnąco
                .forEach(System.out::println);       // Wyświetlanie pojemności
    }
}
