#include<bits/stdc++.h>

using namespace std;

long long getT(long long m) {
    long long a = 0, b = 1, c = (a + b) % m, ctr = 0;
    while(true) {
        ctr++;
        c = (a + b) % m;
        a = b;
        b = c;
        if((a == 0) && ( b == 1))
            return ctr;
    }
}

long long getNumber(long long n, long long m) {
    long long t = getT(m);
    int length = (int) (n % t) + 1;
    long long *series = new long long[length];
    series[0] = 0;
    if(length > 1)
        series[1] = 1;
    for(int i = 2; i< length; i++)
        series[i] = (series[i - 1]  + series[i - 2]) % m;
    return series[length - 1];
}

int main() {
    long long n, m;
    cin>>n>>m;
    long long number = getNumber(n,m);
    cout<<number<<endl;
}
