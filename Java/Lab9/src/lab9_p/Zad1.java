package lab9_p;

public class Zad1 {
    public static void main(String[] args) {
        StudentInstytut studentInstytut = new StudentInstytut();

        studentInstytut.ustawImie("Anna");
        studentInstytut.ustawNazwisko("Kowalska");
        studentInstytut.ustawIndeks(123456);

        studentInstytut.ustawWydzial("Matematyka");

        studentInstytut.ustawInstytut("Instytut Matematyki i Informatyki");

        studentInstytut.wyswietlDane();

        System.out.println("Nazwa instytutu: " + studentInstytut.getInstytut());
    }
}
