#include <iostream>

using namespace std;

int main()
{
    int casos, paredes, total[30][2], paredeatual, paredenova;
    for (int i=0; i<30; i++) {
        total[i][0] = 0;
        total[i][1] = 0;
    }
    cin >> casos;
    for (int i=1; i<=casos; i++) {
        cin >> paredes;
        cin >> paredeatual;
        for (int j=2; j<=paredes; j++) {
            cin >> paredenova;
            if (paredenova > paredeatual) {
                total[i-1][0] = total[i-1][0] + 1;
            } else {
                if (paredenova < paredeatual) {
                    total[i-1][1] = total[i-1][1] + 1;
                }
            }
            paredeatual = paredenova;
        }
    }
    for (int i=0; i<casos; i++) {
        cout << total[i][0] << " " << total[i][1] << endl;
    }
    return 0;
}

