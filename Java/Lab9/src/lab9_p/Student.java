package lab9_p;

public class Student {
    private String imie;
    private String nazwisko;
    private int indeks;

    // Konstruktor domyślny
    public Student() {
    }

    public void ustawImie(String imie) {
        this.imie = imie;
    }

    public void ustawNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void ustawIndeks(int indeks) {
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getIndeks() {
        return indeks;
    }

    public void wyswietlDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Indeks: " + indeks);
    }
}
