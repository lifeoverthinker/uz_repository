#include <iostream>

using namespace std;

int main() {
    double tab[3][2]={
            {10,2},
            {3,4},
            {66, 9}};
    double min=tab[0][0], max=tab[0][0];

  /* for (auto & i : tab) {
        for (double j : i) {
            if (j < min) min = j;
            if (j > max) max = j;
        }
    } */

    for(int j=0;j<3;j++){
        for(int z=0;z<2;z++){
            if(min > tab[j][z]){
                min = tab[j][z];
            }
            if(max < tab[j][z]){
                max = tab[j][z];
            }
        }
    }

    cout << "Min: " << min << "\nMax: " << max;
    return EXIT_SUCCESS;
}
