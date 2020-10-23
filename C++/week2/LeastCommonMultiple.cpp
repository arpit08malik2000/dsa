#include<bits/stdc++.h>

using namespace std;

long long getLcm(long long a, long long b) {
    long long max = 0, step = 0;
    if(a > b) max = step = a;
    else max = step = b;
    while(true) {
        if((max % a == 0) && (max % b == 0))
            return max;
        max += step;
    }
}

int main() {
    long long a, b;
    cin>>a>>b;
    cout<<getLcm(a,b)<<endl;
}
