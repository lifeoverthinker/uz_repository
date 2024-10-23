package lab2_p;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b;
        char operation;

        System.out.print("Podaj a: ");
        a = scanner.nextDouble();

        System.out.print("Podaj operację (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        System.out.print("Podaj b: ");
        b = scanner.nextDouble();

        double result=0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Nie można dzielić przez 0");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Nieznana operacja");
                return;
        }
        System.out.println(a + " " + operation + " " + b + " = " + result);
    }
}