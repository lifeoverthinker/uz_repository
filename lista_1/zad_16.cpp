// Wprowadzić n liczb typu całkowitego lub rzeczywistego, a następnie
// (a) wyznaczyć ich sumę i średnią arytmetyczną,
// (b) powtórzyć punkt 16a dla ciągu liczb zakończonego liczbą 0 (bez wykonywania obliczeń dla liczby 0), zamiast podawania wartości n.

#include <iostream>

using namespace std;

int main() {
    int liczba, sum = 0, count = 0;

    while (true) {
        cout << "Podaj liczbe (Koniec: '0'): ";
        cin >> liczba;
        if (liczba == 0) {
            break;
        }
        sum += liczba;
        count++;
    }

    cout << "Suma: " << sum << endl;
    cout << "Srednia: " << (double)sum / count << endl;
    return EXIT_SUCCESS;
}