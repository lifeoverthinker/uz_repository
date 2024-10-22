package lab2_p;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki:");
        int wysokosc = scan.nextInt();

        //wysokosc choinki
        for(int i = 0; i < wysokosc; i++) {
            //liczba spacji na brzegach choinki by byla wysrodkowana
            for(int j = 0; j < wysokosc - i; j++) {
                System.out.print(" ");
            }

            //liczba drukowanych gwiazdek
            for(int j = 0; j < (i*2)-1; j++) {
                System.out.print("*");
            }

            System.out.println("\n");
        }
    }
}
