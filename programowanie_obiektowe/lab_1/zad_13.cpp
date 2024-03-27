// iloczyn (z1, z2) i  iloraz (z1, z2) dwóch liczb zespolonych ( z1= a+bi, z2= c+di )
#include <iostream>
using namespace std;

int main() {
    float a,b;
    cout << "Podaj wartość a i b liczby z1=a+bi: ";
    cin >> a >> b;

    float c,d;
    cout << "Podaj wartość c i d liczby z2=c+di: ";
    cin >> c >> d;

    // iloczyn z1 i z2
    cout << "\nIloczyn z1 i z2: " << a*c-b*d << " + " << b*c+a*d << "i\n";
    // iloraz z1 i z2
    cout << "Iloraz z1 i z2: " << (a*c+b*d)/(c*c+d*d) << " + " << (b*c-a*d)/(c*c+d*d) << "i";
    return EXIT_SUCCESS;
}