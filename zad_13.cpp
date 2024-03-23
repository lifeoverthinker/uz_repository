#include <iostream>
using namespace std;

struct LiczbaZespolona {
    double rzeczywista;
    double urojona;
};

// Funkcja do mnożenia dwóch liczb zespolonych
LiczbaZespolona pomnoz(LiczbaZespolona z1, LiczbaZespolona z2) {
    LiczbaZespolona wynik;
    wynik.rzeczywista = z1.rzeczywista * z2.rzeczywista - z1.urojona * z2.urojona;
    wynik.urojona = z1.rzeczywista * z2.urojona + z1.urojona * z2.rzeczywista;
    return wynik;
}

// Funkcja do dzielenia dwóch liczb zespolonych
LiczbaZespolona podziel(LiczbaZespolona z1, LiczbaZespolona z2) {
    LiczbaZespolona wynik;
    double mianownik = z2.rzeczywista * z2.rzeczywista + z2.urojona * z2.urojona;
    wynik.rzeczywista = (z1.rzeczywista * z2.rzeczywista + z1.urojona * z2.urojona) / mianownik;
    wynik.urojona = (z1.urojona * z2.rzeczywista - z1.rzeczywista * z2.urojona) / mianownik;
    return wynik;
}

int main() {
    // Wprowadź liczby zespolone
    LiczbaZespolona z1, z2;
    cout << "Podaj część rzeczywistą i urojoną liczby z1:" << endl;
    cout << "Część rzeczywista: ";
    cin >> z1.rzeczywista;
    cout << "Część urojona: ";
    cin >> z1.urojona;

    cout << "Podaj część rzeczywistą i urojoną liczby z2:" << endl;
    cout << "Część rzeczywista: ";
    cin >> z2.rzeczywista;
    cout << "Część urojona: ";
    cin >> z2.urojona;

    // Oblicz iloczyn i iloraz
    LiczbaZespolona iloczyn = pomnoz(z1, z2);
    LiczbaZespolona iloraz = podziel(z1, z2);

    // Wyświetl wyniki
    cout << "Iloczyn z1 * z2: " << iloczyn.rzeczywista << " + " << iloczyn.urojona << "i" << endl;
    cout << "Iloraz z1 / z2: " << iloraz.rzeczywista << " + " << iloraz.urojona << "i" << endl;

    return 0;
}
