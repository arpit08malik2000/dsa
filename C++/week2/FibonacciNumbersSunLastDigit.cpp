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

int sum(long long n) {
    int* series = getSeries();
    long sum = 0;
    n = n % 60;
    for(int i =0; i<= n; i++)
        sum+= series[i];
    return (int) (sum % 10);
}

int main() {
    long long n;
    cin>>n;
    cout<<sum(n)<<endl;
}
