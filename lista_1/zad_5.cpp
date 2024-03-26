#include <iostream>

using namespace std;

int Zwiekszacz(int liczba){
    return liczba + 1;
}

int main() {

    for(int i = 0; i <= 17; i++){
        int argument = i;
        cout << "Argument: " << argument << ", zwiekszacz(" << argument << ") = " << Zwiekszacz(argument) << endl;
    }
    return 0;
}