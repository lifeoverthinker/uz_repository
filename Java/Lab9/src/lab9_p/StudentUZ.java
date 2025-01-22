package lab9_p;

public class StudentUZ extends Student {
    private String wydzial;

    // Konstruktor domyślny
    public StudentUZ() {
        super();  // Wywołanie konstruktora klasy bazowej (Student)
    }

    public void ustawWydzial(String wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public void wyswietlDane() {

        super.wyswietlDane();

        System.out.println("Wydział: " + wydzial);
    }
}
