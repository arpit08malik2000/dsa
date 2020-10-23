#include<bits/stdc++.h>

using namespace std;

long long getGcd(long long a, long long b) {
    long long ans = 0;
    for(long long i = 1; i <= a + b; i++)
        if((a % i == 0) && (b % i == 0))
            ans = i;
    return ans;
}

int main() {
    long long a, b;
    cin>>a>>b;
    long long gcd = getGcd(a,b);
    cout<<gcd<<endl;
}
