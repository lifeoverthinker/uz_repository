package lab2_p;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double km;
        double ml;
        System.out.print("Podaj Predkosc samochodu w milach: ");
        ml = scanner.nextDouble(); // zczytuje dane z klawiatury i zapisuje do zmiennej ml

        km = ml * 1.6093440;

        System.out.println(ml + " mil to " + km + " Kilometrow");

    }
}