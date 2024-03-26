#include <iostream>

using namespace std;

int main() {
    int tab[] = {1, 2, 3, 4, 5};

    int min = tab[0];
    int max = tab[0];

    int n = sizeof(tab)/sizeof(tab[0]);

    for(int i = 0; i < n; i++){
        if(min > tab[i]){
            min = tab[i];
        }

        if(max < tab[i]){
            max = tab[i];
        }
    }

    cout << "Max = " << min << "\nMax = " << max;
    return EXIT_SUCCESS;
}