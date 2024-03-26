#include <iostream>

using namespace std;

int Zwiekszacz(int liczba){
    return liczba + 1;
}

int main(){
    int a = 6;
    cout << "Liczba przed: " << a << endl;

    int wynik = Zwiekszacz(a);
    cout << "Liczba po: " << wynik << endl;

    return 0;
}