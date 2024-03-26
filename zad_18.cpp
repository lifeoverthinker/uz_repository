#include <iostream>
using namespace std;

int main() {
    const int m = 4, n = 2;
    const int w[n] = {10, 20};
    const int tab[m][n] = {{1,2},{3,4},{5,6},{7,8}};
    int x, k = 0;

    if (m == 1) {
        x = m * 2;
    } else {
        x = m * 2 - 1;
    }

    int tab2[x][n];

    for (int i = 0; i < x; i++) {

        for (int j = 0; j < n; j++) {
            if (i % 2 == 0) {
                tab2[i][j] = tab[k][j];
            } else {
                tab2[i][j] = w[j];
            }
        }

        if (i % 2 == 0) {
            k++;
        }
    }

    cout << "Tablica po wstawieniu wektora m: " << endl;
    for (auto & i : tab2) {
        for (int j : i) {
            cout << j << " ";
        }
        cout << endl;
    }

    return EXIT_SUCCESS;
}
