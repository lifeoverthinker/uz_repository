package lab2_p;

import java.util.Scanner;
import java.lang.Math;

public class zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wartosc a:");
        double a = scan.nextDouble();

        System.out.println("Podaj wartosc b:");
        double b = scan.nextDouble();

        System.out.println("Podaj wartosc c:");
        double c = scan.nextDouble();

        System.out.println("Twoje rownanie: " + a + "x^2 + " + b + "x + " + c + "= 0");

        double delta = Math.pow(b,2) - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Rownanie ma dwa rozwiazania: x1 = " + x1 + " i x2 = " + x2);
        }
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Rownanie ma jedno rozwiazanie: x = " + x);
        }
        else {
            System.out.println("Rownanie nie ma rozwiazan");
        }
        scan.close();
    }
}
