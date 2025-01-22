package lab4_p;
import java.util.Random;

public class zad1 {
    public static void main(String[] args) {

        Random r = new Random();

        int[] stary_tab = new int[30];
        int[] nowy_tab = new int[30];

        for (int i = 0; i < 30; i++) {
            stary_tab[i] = r.nextInt(51)+99;
        }

        System.arraycopy(stary_tab, 0, nowy_tab, 0, stary_tab.length);


        System.out.println("Stara tablica:");
        for(int i = 0; i < stary_tab.length; i++){
            System.out.print(stary_tab[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Nowa tablica:");
        for(int i = 0; i < nowy_tab.length; i++){
            System.out.print(nowy_tab[i] + " ");
        }


    }

}