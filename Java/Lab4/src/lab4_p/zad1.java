package lab4_p;

import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        int[] stary_tab = new int[30];
        int[] nowy_tab = new int[30];

        Random random = new Random();

        for(int i = 0; i < stary_tab.length; i++){
            stary_tab[i] = random.nextInt(52) + 99;
        }

        for(int i = 0; i < stary_tab.length; i++){
            nowy_tab[i] = stary_tab[i];
        }

        System.out.println("Tablica losowych elementów z przedziału od 99-150: ");

        int licznik =0;
        for(int liczba : nowy_tab){
            System.out.print(liczba + " ");
            licznik++;
            if(licznik % 10 == 0){ //po 10 w rzędzie
                System.out.println();
            }
        }
    }
}
