#include <iostream>

using namespace std;

int main() {
    double arr[][2]={{10,2},{3,4},{5,6},{7,8},{90,10},{11,12},{13,14},{15,16}};
    double min=arr[0][0], max=arr[0][0];

    for (size_t i = 0; i < sizeof(arr) / sizeof(arr[0]); ++i) {
        for (size_t j = 0; j < 2; ++j) {
            if (arr[i][j] < min) min = arr[i][j];
            if (arr[i][j] > max) max = arr[i][j];
        }
    }

    cout << "Min: " << min << "\nMax: " << max;
    return 0;
}
