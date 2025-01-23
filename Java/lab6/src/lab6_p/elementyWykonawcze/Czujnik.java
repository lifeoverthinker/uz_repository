package lab6_p.elementyWykonawcze;

public class Czujnik {
    private int maksymalnaWaga = 10; // maksymalna waga w kg

    public boolean sprawdzWage(int waga) {
        return waga <= maksymalnaWaga;
    }

    // Pozostałe metody bez zmian
    public void zmierzCisnienie() {
        System.out.println("Mierzenie ciśnienia wody...");
    }

    public void zmierzTemperature() {
        System.out.println("Mierzenie temperatury wody...");
    }

    public void zmierzPoziomWody() {
        System.out.println("Mierzenie poziomu wody...");
    }

    public void sprawdzSzcelnosc() {
        System.out.println("Sprawdzanie zabezpieczeń przed zalaniem...");
    }

    public void sprawdzDroznoscFiltra() {
        System.out.println("Drożność filtra wody sprawdzona.");
    }
}