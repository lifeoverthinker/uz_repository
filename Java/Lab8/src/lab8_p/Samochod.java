package lab8_p;

class Samochod {
    String marka;
    String model;
    double pojemnoscSilnika;
    String typNadwozia;
    String typSilnika;
    int rokProdukcji;
    String dataPierwszejRejestracji;
    double cena;

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setTypNadwozia(String typNadwozia) {
        this.typNadwozia = typNadwozia;
    }

    public void setTypSilnika(String typSilnika) {
        this.typSilnika = typSilnika;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public void setDataPierwszejRejestracji(String dataPierwszejRejestracji) {
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
    }

    public void setCena(double cena) {
        this.cena = cena;
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
        System.out.println();
    }

    public boolean getGwarancja() {
        // Gwarancja wygasa po 5 latach od produkcji
        int currentYear = java.time.LocalDate.now().getYear();
        return (currentYear - this.rokProdukcji) <= 5;
    }
}
