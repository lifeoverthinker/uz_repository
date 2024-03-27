#include <iostream>
#include <cmath>

using namespace std;

double obliczOdleglosc(double x1, double y1, double z1, double x2, double y2, double z2) {
    double odleglosc = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2) + pow(z1 - z2, 2));
    return odleglosc;
}

int main() {
    double x1, y1, z1, x2, y2, z2;

    cout << "Podaj wspolrzendne punktu A (x1 y1 z1): ";
    cin >> x1 >> y1 >> z1;

    cout << "\nPodaj wspolrzendne punktu B (x1 y1 z1): ";
    cin >> x2 >> y2 >> z2;

    double odleglosc = obliczOdleglosc(x1, y1, z1, x2, y2, z2);

    cout << "\nd = " << odleglosc;
    return 0;
}