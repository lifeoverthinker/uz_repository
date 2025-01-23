package lab11_p.zad2;

import lab11_p.zad2.MojWyjatek;

public class Zad2 {
    public static void main(String[] args) {
        try {
            sprawdzTemperature(39);
        } catch (MojWyjatek e) {
            System.out.println("Wystąpił wyjątek: " + e.getMessage());
        }

        try {
            sprawdzTemperature(36.5);
        } catch (MojWyjatek e) {
            System.out.println("Wystąpił wyjątek: " + e.getMessage());
        }
    }

    // Metoda sprawdzająca temperaturę ciała i zgłaszająca wyjątek, jeśli wartość jest nieodpowiednia
    public static void sprawdzTemperature(double temperatura) throws MojWyjatek {
        if (temperatura > 37.5) {
            throw new MojWyjatek("Gorączka! Temperatura ciała jest zbyt wysoka: " + temperatura + "°C");
        } else if (temperatura < 36) {
            throw new MojWyjatek("Temperatura ciała jest zbyt niska: " + temperatura + "°C");
        }
        System.out.println("Temperatura ciała jest w normie: " + temperatura + "°C");
    }
}