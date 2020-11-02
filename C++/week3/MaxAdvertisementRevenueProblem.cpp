#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin>>n;
    int *a = new int[n], *b = new int[n];
    for (int i = 0; i < n; i++)
        cin>>a[i];
    for (int i = 0; i < n; i++)
        cin>>b[i];

    sort(a, a +n );
    sort(b, b + n);
    long ans = 0;
    for (int i = 0; i < n; i++)
        ans += (long long) a[i] * b[i];
    cout<<ans;
    return 0;
}
