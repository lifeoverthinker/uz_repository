package lab3_p;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        
        int liczba = scanner.nextInt();
        int dzielnik = 1;
        
        System.out.println("Dzielniki liczby " + liczba + " to:");
        while (dzielnik <= liczba) {
            if (liczba % dzielnik == 0) {
                System.out.println(dzielnik + " jest dzielnikiem liczby " + liczba);
            }
            dzielnik++;
        }
    }
}
