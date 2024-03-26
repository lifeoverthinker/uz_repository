#include <iostream>

using namespace std;

int Zwiekszacz(int liczba){
    return liczba + 1;
}

int main(){
    int a;
    cout << "Podaj liczbe: ";
    cin >> a;

    cout << "Liczba przed: " << a << endl;

    int wynik = Zwiekszacz(a);
    cout << "Liczba po: " << wynik << endl;

    return 0;
}