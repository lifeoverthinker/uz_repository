#include <iostream>
using namespace std;

int main(){
    int a = 3;
    int b = 4;
    int c = 5;

    if ((a + b > c) && (a + c > b) && (b + c > a)) {
        cout << "Mozna zbudowac trojkat" << endl;
    } else {
        cout << "Nie mozna zbudowac trojkata" << endl;
    }
    return 0;
}