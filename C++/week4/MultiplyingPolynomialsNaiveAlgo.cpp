#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin>>n;
    int* a = new int[n];
    int* b = new int[n];
    for (int i = 0; i < n; i++)
        cin>>a[i]>>b[i];

    int* res = new int[2 * n - 1];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            res[i + j] += a[i] * b[j];
        }
    }
    for (int i = 0; i < 2 * n - 1; i++)
        cout<<res[i]<<endl;

}
