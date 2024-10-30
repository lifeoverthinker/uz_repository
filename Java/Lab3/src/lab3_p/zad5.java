package lab3_p;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe nieujemna: ");
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();

        if(limit < 0){
            System.out.println("Liczba nie jest nieujemna");
        }else {
            int potega = 1;

            System.out.println("Potęgi liczby 3 mniejsze niż " + limit + ":");

            while (potega < limit) {
                System.out.println(potega);
                potega *= 3;
            }
        }
    }
}
