// Dla tablicy znakowej odwróć kolejność elementów
#include <iostream>
using namespace std;

int main() {

    char tab1[] = "Witaj swiecie i wiosno";
    for (int i = sizeof(tab1) - 2; i >= 0; --i) {
        cout << tab1[i];
    }

    cout << "\n";
////
    int temp;
    char tab[] = {'a','b','c','d','e', 'g','h'};
    int n = sizeof(tab)/sizeof(tab[0]);
    for (int i = 0; i < n/2; i++) {
        temp = tab[i];
        tab[i]=tab[n-1-i];
        tab[n-1-i]=temp;
    }

    for(int z=0;z<n;z++){
        cout<<tab[z];
    }

    return 0;
}

