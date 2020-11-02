#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin>>n;
    double W;
    cin>>W;

    double *values = new double[n], *weights = new double[n];
    for (int i = 0; i < n; i++) {
        cin>>values[i];
        cin>>weights[i];
    }

    double value = 0;
    while (W > 0) {
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if ((i == 0) && (weights[i] != 0))
                maxIndex = i;
            else if (weights[i] != 0)
                if (values[i] / weights[i] > values[maxIndex] / weights[maxIndex])
                    maxIndex = i;
        }
        if (maxIndex != -1) {
            double qty = weights[maxIndex];
            if (qty > W)
                qty = W;
            value += qty * values[maxIndex] / weights[maxIndex];
            weights[maxIndex] -= qty;
            W -= qty;
        }
        bool needBreak = true;
        for(int i = 0; i< n; i++ ) {
            if(weights[i] != 0)
                needBreak = false;
        }
        if(needBreak)
            break;
    }
    cout<<value;
    return 0;
}
