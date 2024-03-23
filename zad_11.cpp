#include <iostream>
#include <climits> // Dla INT_MAX i INT_MIN
using namespace std;

const int ROWS = 3; // Ilość wierszy
const int COLS = 3; // Ilość kolumn

// Funkcja znajdująca minimum w tablicy dwuwymiarowej
double findMin(double arr[ROWS][COLS]) {
    double min = arr[0][0]; // Zakładamy, że pierwszy element jest minimum

    // Przechodzimy przez wszystkie elementy tablicy, aby znaleźć minimum
    for (int i = 0; i < ROWS; ++i) {
        for (int j = 0; j < COLS; ++j) {
            if (arr[i][j] < min) {
                min = arr[i][j];
            }
        }
    }

    return min;
}

// Funkcja znajdująca maksimum w tablicy dwuwymiarowej
double findMax(double arr[ROWS][COLS]) {
    double max = arr[0][0]; // Zakładamy, że pierwszy element jest maksimum

    // Przechodzimy przez wszystkie elementy tablicy, aby znaleźć maksimum
    for (int i = 0; i < ROWS; ++i) {
        for (int j = 0; j < COLS; ++j) {
            if (arr[i][j] > max) {
                max = arr[i][j];
            }
        }
    }

    return max;
}

int main() {
    double arr[ROWS][COLS] = {
        {3.14, 2.71, 1.618},
        {-1.0, 0.0, 2.0},
        {10.0, 5.0, -3.0}
    };

    // Znajdowanie i wyświetlanie minimum i maksimum
    double min = findMin(arr);
    double max = findMax(arr);
    cout << "Minimum: " << min << endl;
    cout << "Maksimum: " << max << endl;

    return 0;
}
