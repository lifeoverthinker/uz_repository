package lab4_p;

import java.util.Random;

/*Napisz program, w którym zostanie utworzona 30-elementowa tablica liczb typu int.
Za pomocą pętli zapisz w kolejnych komórkach liczby losowo wygenerowane z
przedziału od 99-150. Wykonać kopię do nowej tablicy.*/

public class zad1 {
    public static void main(String[] args) {
        int[] old_tab = new int[30];
        int[] new_tab = new int[30];

        Random random = new Random();

        for(int i = 0; i < old_tab.length; i++){
            old_tab[i] = random.nextInt(52) + 99;
        }

        for(int i = 0; i < old_tab.length; i++){
            new_tab[i] = old_tab[i];
        }

        System.out.println("Tablica losowych elementów z przedziału od 99-150: ");

        int licznik =0;
        for(int liczba : new_tab){
            System.out.print(liczba + " ");
            licznik++;
            if(licznik % 10 == 0){ //po 10 w rzędzie
                System.out.println();
            }
        }
    }
}
