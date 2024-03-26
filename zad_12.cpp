// Dla tablicy znakowej odwróć kolejność elementów
#include <iostream>
using namespace std;

int main() {
    char tab[] = "Hello, World!";
    for (int i = sizeof(tab) - 2; i >= 0; --i) {
        cout << tab[i];
    }
    return 0;
}