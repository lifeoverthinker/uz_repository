package lab11_p;

public class Zad1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Operacja, która wywoła ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero!");
        } finally {
            System.out.println("Program zakończony.");
        }
    }
}
