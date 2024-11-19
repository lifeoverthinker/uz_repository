package lab3_p;

import java.util.Scanner;
import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int wylosowanaLiczba = generator.nextInt(200) + 1;
        int proba;

        do {
            System.out.print("Zgadnij liczbę: ");
            proba = input.nextInt();

            if (proba == wylosowanaLiczba) {
                System.out.println("Brawo! Trafiłeś!\nWylosowana liczba to: " + wylosowanaLiczba);
                break;
            } else if (proba < wylosowanaLiczba) {
                System.out.println("Liczba jest za mała.");
            } else {
                System.out.println("Liczba jest za duża.");
            }
        } while (proba != wylosowanaLiczba);
    }
}
