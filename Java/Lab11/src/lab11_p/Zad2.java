package lab11_p;

public class Zad2 {
    public static void main(String[] args) {
        try {
            checkValue(-1); // Przykład wywołania wyjątku
        } catch (MyCustomException e) {
            System.out.println("Wystąpił wyjątek: " + e.getMessage());
        }
    }

    public static void checkValue(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("Wartość nie może być ujemna!");
        }
    }
}
