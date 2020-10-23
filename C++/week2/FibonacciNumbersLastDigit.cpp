#include<bits/stdc++.h>

using namespace std;

int* getSeries() {
    int* series = new int[60];
    series[0] = 0;
    series[1] = 1;
    for(int i = 2; i < 60; i++)
        series[i] = (series[i-1] + series[i-2]) % 10;
    return series;
}

int getLastDigit(long long n) {
    int *series = getSeries();
    return series[(int)(n % 60)];
}

int main() {
    long long n;
    cin>>n;
    int lastDigit = getLastDigit(n);
    cout<<lastDigit<<endl;
}
