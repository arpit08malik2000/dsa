#include<bits/stdc++.h>

using namespace std;

long long nthFibonacciNumber(int n) {
    switch(n) {
        case 0:
            return 0;
        case 1:
            return 1;
        default:
            return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
    }
}

int main() {
    int n;
    cin>>n;
    long long number = nthFibonacciNumber(n);
    cout<<number<<endl;
    return 0;
}
