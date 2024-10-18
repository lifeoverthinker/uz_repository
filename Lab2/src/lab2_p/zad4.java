package lab2_p;

import java.util.Scanner;

//zamienic tablice na liste bo nie wiemy ile wprowadzimy liczb

public class zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzic?");
        int n = sc.nextInt();

        double[] liczby = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę nr"+(i+1));
            liczby[i] = sc.nextDouble();
        }

        double min  = liczby[0];
        double max = liczby[0];
        double sum = 0;

        for (double num : liczby) {
            if (num < min) min = num;

            if (num > max) max = num;

            sum += num;
        }

        double srednia = sum/n;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Średnia: " + max);
    }
}