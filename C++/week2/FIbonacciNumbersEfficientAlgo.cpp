#include<bits/stdc++.h>

using namespace std;

long long nthFibonacciNumber(int n) {
    long long *series = new long long[n+1];
    series[0] = 0;
    series[1] = 1;
    for(int i = 2; i <= n; i++) {
        series[i] = series[i-1] + series[i-2];
    }
    return series[n];
}

int main() {
    int n ;
    cin>>n;
    long long number = nthFibonacciNumber(n);
    cout<<number<<endl;
    return 0;
}
