#include <iostream>
using namespace std;

int main() {
    int words=1;
    char str[]= "Ala ma kota. Kot ma Ale. Ala i kota ida do domu.";

    // Split string into sentences. If ' ' and '.' are neighbors, remove ' '.
    for (int i=0; i<sizeof(str); i++) {
        if (str[i] == '.') {
            cout << "Words in sentence: " << words << endl;
            words = 0;
        }
        if (str[i] == ' ' || str[i] == '.' || str[i] == '\'') {
            words++;
        }
        if (str[i] == '.' && str[i+1] == ' ') {
            words--;
        }
    }

    return EXIT_SUCCESS;
}
