#include <iostream>
#include <cstring> // Dla funkcji strlen
using namespace std;

// Funkcja odwracająca kolejność elementów w tablicy znakowej
void reverseString(char str[]) {
    int length = strlen(str);
    for (int i = 0; i < length / 2; ++i) {
        char temp = str[i];
        str[i] = str[length - i - 1];
        str[length - i - 1] = temp;
    }
}

int main() {
    char str[] = "Hello, World!";
    cout << "Przed odwróceniem: " << str << endl;

    // Wywołanie funkcji odwracającej kolejność elementów w tablicy znakowej
    reverseString(str);

    cout << "Po odwróceniu: " << str << endl;

    return 0;
}
