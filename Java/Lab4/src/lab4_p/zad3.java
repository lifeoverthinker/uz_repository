package lab4_p;
import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tab1 = new int[40];

        // Użycie jednej pętli z różnymi zakresami dla różnych grup liczb
        for (int i = 0; i < 40; i++) {
            if (i < 11) {
                tab1[i] = r.nextInt(5) + 1;      // Liczby z zakresu 1-5
            } else if (i < 21) {
                tab1[i] = r.nextInt(5) + 6;      // Liczby z zakresu 6-10
            } else if (i < 31) {
                tab1[i] = r.nextInt(44) + 11;    // Liczby z zakresu 11-55
            } else {
                tab1[i] = r.nextInt(15) + 60;    // Liczby z zakresu 60-75
            }
        }

        // Wyświetlanie zawartości tablicy
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
    }
}
