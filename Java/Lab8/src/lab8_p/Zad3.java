package lab8_p;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String zdanie = sc.nextLine();

        // Wyrażenie regularne do rozdzielenia słów (spacje, tabulatory, nowe linie)
        String[] slowa = zdanie.split("\\s+");

        // Wyświetlanie każdego słowa z tablicy
        for (String word : slowa) {
            System.out.println(word);
        }
    }
}
