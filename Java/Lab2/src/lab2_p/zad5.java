package lab2_p;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double a = sc.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double b = sc.nextDouble();

        System.out.println("Wybierz operację (+, -, /, *):");
        char znak = sc.next().charAt(0);

        double wynik = 0;
        boolean poprawna_operacja = true;

        switch (znak) {
            case '+':
                wynik = a + b;
                break;

            case '-':
                wynik = a - b;
                break;

            case '*':
                wynik = a * b;
                break;

            case '/':
                if (b != 0){
                    wynik = (double) a / b;
                }else {
                    System.out.println("Niepoprawna operacja");
                    poprawna_operacja = false;
                }
                break;

            default:
                System.out.println("Niepoprawna operacja");
                poprawna_operacja = false;
        }
        if(poprawna_operacja){
            System.out.println("Wynik: " + wynik);
        }
    }
}
