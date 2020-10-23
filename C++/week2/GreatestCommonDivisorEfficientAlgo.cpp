#include<bits/stdc++.h>

using namespace std;

int getGcd(int a, int b) {
    if(b == 0)
        return a;
    return getGcd(b, a % b);
}

int main() {
    int a, b;
    cin>>a>>b;
    int gcd = getGcd(a, b);
    cout<<gcd<<endl;
}

