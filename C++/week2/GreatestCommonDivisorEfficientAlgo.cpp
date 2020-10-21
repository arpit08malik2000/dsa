#include<bits/stdc++.h>

using namespace std;

int gcdOfTwoNos(int a, int b) {
    if(b == 0)
        return a;
    return gcdOfTwoNos(b, a % b);
}

int main() {
    int a,b;
    cin>>a>>b;
    int gcd = gcdOfTwoNos(a,b);
    cout<<gcd<<endl;
    return 0;
}
