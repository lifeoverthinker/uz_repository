package lab9_p;

public class StudentInstytut extends StudentUZ {
    private String instytut;

    public StudentInstytut() {
        super();
    }

    public void ustawInstytut(String instytut) {
        this.instytut = instytut;
    }

    public String getInstytut() {
        return instytut;
    }

    @Override
    public void wyswietlDane() {
        super.wyswietlDane();

        System.out.println("Instytut: " + instytut);
    }
}
