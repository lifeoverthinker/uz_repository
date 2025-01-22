package lab5_p;

class AutoKomis {
    private Samochod[] cars;

    public AutoKomis() {
        this.cars = new Samochod[10];
        // Tworzenie samochodów (przykład tylko dla kilku)
        for (int i = 0; i < 10; i++) {
            this.cars[i] = new Samochod();
            this.cars[i].setMarka("Marka" + (i+1));
            this.cars[i].setModel("Model" + (i+1));
            this.cars[i].setPojemnoscSilnika(3.0 + i);
            this.cars[i].setTypNadwozia("Typ" + (i+1));
            this.cars[i].setTypSilnika("Benzynowy");
            this.cars[i].setRokProdukcji(2000 + i);
            this.cars[i].setDataPierwszejRejestracji("01-01-200" + i);
            this.cars[i].setCena(20000 + (i * 1000));
        }
    }

    public void wypiszWszystkieDane() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Samochód " + (i + 1) + ":");
            this.cars[i].wypiszWszystkieDane();
            System.out.println();
        }
    }
}
