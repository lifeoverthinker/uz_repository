package lab9_p;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StudentInstytut student = new StudentInstytut();

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = sc.nextLine();
        student.ustawImie(imie);

        System.out.print("Podaj nazwisko: ");
        String nazwisko = sc.nextLine();
        student.ustawNazwisko(nazwisko);

        System.out.print("Podaj indeks: ");
        int indeks = sc.nextInt();
        student.ustawIndeks(indeks);

        sc.nextLine();
        System.out.print("Podaj wydział: ");
        String wydzial = sc.nextLine();
        student.ustawWydzial(wydzial);

        System.out.print("Podaj instytut: ");
        String instytut = sc.nextLine();
        student.ustawInstytut(instytut);

        System.out.println("\nDane studenta:");
        student.wyswietlDane();

        sc.close();
    }
}

