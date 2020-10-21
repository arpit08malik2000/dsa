#include<bits/stdc++.h>

using namespace std;

int gcdOfTwoNos(int a, int b) {
    int ans = 0;
    for(int i = 1; i < a + b; i++)
        if((a % i == 0) && (b % i == 0))
            ans = i;
    return ans;
}

int main() {
    int a,b;
    cin>>a>>b;
    int gcd = gcdOfTwoNos(a,b);
    cout<<gcd<<endl;
    return 0;
}
