package lab5_p;

class AutoKomis {
    private final Samochod[] cars;

    public AutoKomis() {
        this.cars = new Samochod[10];

        // Tworzenie 10 samochodów
        this.cars[0] = new Samochod();
        this.cars[0].setMarka("Ford");
        this.cars[0].setModel("Mustang");
        this.cars[0].setPojemnoscSilnika(5.0);
        this.cars[0].setTypNadwozia("Fastback");
        this.cars[0].setTypSilnika("V8");
        this.cars[0].setRokProdukcji(1969);
        this.cars[0].setDataPierwszejRejestracji("1969-05-01");
        this.cars[0].setCena(35000.0);

        this.cars[1] = new Samochod();
        this.cars[1].setMarka("Chevrolet");
        this.cars[1].setModel("Camaro");
        this.cars[1].setPojemnoscSilnika(4.8);
        this.cars[1].setTypNadwozia("Coupe");
        this.cars[1].setTypSilnika("V8");
        this.cars[1].setRokProdukcji(1969);
        this.cars[1].setDataPierwszejRejestracji("1970-01-01");
        this.cars[1].setCena(28000.0);

        this.cars[2] = new Samochod();
        this.cars[2].setMarka("Ford");
        this.cars[2].setModel("Mustang");
        this.cars[2].setPojemnoscSilnika(4.7);
        this.cars[2].setTypNadwozia("Fastback");
        this.cars[2].setTypSilnika("V8");
        this.cars[2].setRokProdukcji(1968);
        this.cars[2].setDataPierwszejRejestracji("1968-04-10");
        this.cars[2].setCena(34000.0);

        this.cars[3] = new Samochod();
        this.cars[3].setMarka("Chevrolet");
        this.cars[3].setModel("Impala");
        this.cars[3].setPojemnoscSilnika(4.9);
        this.cars[3].setTypNadwozia("Sedan");
        this.cars[3].setTypSilnika("V8");
        this.cars[3].setRokProdukcji(1971);
        this.cars[3].setDataPierwszejRejestracji("1971-06-15");
        this.cars[3].setCena(23000.0);

        this.cars[4] = new Samochod();
        this.cars[4].setMarka("Ford");
        this.cars[4].setModel("Mustang");
        this.cars[4].setPojemnoscSilnika(5.0);
        this.cars[4].setTypNadwozia("Convertible");
        this.cars[4].setTypSilnika("V8");
        this.cars[4].setRokProdukcji(1970);
        this.cars[4].setDataPierwszejRejestracji("1970-03-01");
        this.cars[4].setCena(36000.0);

        this.cars[5] = new Samochod();
        this.cars[5].setMarka("Chevrolet");
        this.cars[5].setModel("Corvette");
        this.cars[5].setPojemnoscSilnika(5.7);
        this.cars[5].setTypNadwozia("Coupe");
        this.cars[5].setTypSilnika("V8");
        this.cars[5].setRokProdukcji(1969);
        this.cars[5].setDataPierwszejRejestracji("1970-02-20");
        this.cars[5].setCena(40000.0);

        this.cars[6] = new Samochod();
        this.cars[6].setMarka("Dodge");
        this.cars[6].setModel("Charger");
        this.cars[6].setPojemnoscSilnika(7.0);
        this.cars[6].setTypNadwozia("Fastback");
        this.cars[6].setTypSilnika("V8");
        this.cars[6].setRokProdukcji(1970);
        this.cars[6].setDataPierwszejRejestracji("1970-11-01");
        this.cars[6].setCena(45000.0);

        this.cars[7] = new Samochod();
        this.cars[7].setMarka("Pontiac");
        this.cars[7].setModel("GTO");
        this.cars[7].setPojemnoscSilnika(6.6);
        this.cars[7].setTypNadwozia("Coupe");
        this.cars[7].setTypSilnika("V8");
        this.cars[7].setRokProdukcji(1970);
        this.cars[7].setDataPierwszejRejestracji("1970-08-15");
        this.cars[7].setCena(27000.0);

        this.cars[8] = new Samochod();
        this.cars[8].setMarka("Chevrolet");
        this.cars[8].setModel("Chevelle");
        this.cars[8].setPojemnoscSilnika(5.4);
        this.cars[8].setTypNadwozia("Sedan");
        this.cars[8].setTypSilnika("V8");
        this.cars[8].setRokProdukcji(1970);
        this.cars[8].setDataPierwszejRejestracji("1971-01-01");
        this.cars[8].setCena(25000.0);

        this.cars[9] = new Samochod();
        this.cars[9].setMarka("Dodge");
        this.cars[9].setModel("Challenger");
        this.cars[9].setPojemnoscSilnika(6.4);
        this.cars[9].setTypNadwozia("Coupe");
        this.cars[9].setTypSilnika("V8");
        this.cars[9].setRokProdukcji(1970);
        this.cars[9].setDataPierwszejRejestracji("1970-05-10");
        this.cars[9].setCena(38000.0);
    }

    public void printAllData() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Samochód " + (i + 1) + ":");
            this.cars[i].wypiszWszystkieDane();
            System.out.println();
        }
    }
}

public class Zad3 {
    public static void main(String[] args) {
        AutoKomis autoKomis = new AutoKomis();
        autoKomis.printAllData();
    }
}
