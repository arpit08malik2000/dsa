#include<bits/stdc++.h>

using namespace std;

int main() {
    int money;
    cin>>money;
    int denominations[] = { 10, 5, 1 };
    int ctr = 0;
    while (money > 0) {
        if (money - denominations[0] >= 0) {
            money -= denominations[0];
            ctr++;
        } else if (money - denominations[1] >= 0) {
            money -= denominations[1];
            ctr++;
        } else if (money - denominations[2] >= 0) {
            money -= denominations[1];
            ctr++;
        }
    }
    cout<<ctr;
    return 0;
}
