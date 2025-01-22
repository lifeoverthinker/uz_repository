package lab5_p;

public class Samochod {
    // Dane
    private int rokProdukcji;
    private String marka;
    private String model;
    private double pojemnoscSilnika;
    private String typNadwozia;
    private String typSilnika;
    private String dataPierwszejRejestracji;
    private double cena;

    // Konstruktor
    public Samochod() {
        final String tekst = "Nieznane";

        this.marka = tekst;
        this.model = tekst;
        this.pojemnoscSilnika = 0.0;
        this.typNadwozia = tekst;
        this.typSilnika = tekst;
        this.rokProdukcji = 0;
        this.dataPierwszejRejestracji = tekst;
        this.cena = 0.0;
    }

    // Metody
    public String getMarka() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPojemnoscSilnika() {
        return this.pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public String getTypNadwozia() {
        return this.typNadwozia;
    }

    public void setTypNadwozia(String typNadwozia) {
        this.typNadwozia = typNadwozia;
    }

    public String getTypSilnika() {
        return this.typSilnika;
    }

    public void setTypSilnika(String typSilnika) {
        this.typSilnika = typSilnika;
    }

    public int getRokProdukcji() {
        return this.rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji){
        this.rokProdukcji = rokProdukcji;
    }

    public String getDataPierwszejRejestracji() {
        return this.dataPierwszejRejestracji;
    }

    public void setDataPierwszejRejestracji(String dataPierwszejRejestracji) {
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
    }

    public double getCena() {
        return this.cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    // Zad2
    public boolean getGwarancja() {
        int biezacyRok = 2024;
        int rokPierwszejRejestracji = Integer.parseInt(this.dataPierwszejRejestracji.substring(0, 4));
        int wiek = biezacyRok - rokPierwszejRejestracji;

        return wiek <= 2;
    }

    public void wypiszWszystkieDane() {
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Pojemność silnika: " + this.pojemnoscSilnika);
        System.out.println("Typ nadwozia: " + this.typNadwozia);
        System.out.println("Typ silnika: " + this.typSilnika);
        System.out.println("Rok produkcji: " + this.rokProdukcji);
        System.out.println("Data pierwszej rejestracji: " + this.dataPierwszejRejestracji);
        System.out.println("Cena: " + this.cena);
    }
}
