package lab8_p;

public class zad4 {
    public static void main(String[] args) {
        System.out.print("Podaj adres e-mail: ");
        String email = System.console().readLine();
        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) { // uproszczony regex
            System.out.println("Adres jest poprawny.");
        } else {
            System.out.println("Adres jest niepoprawny.");
        }
    }
}