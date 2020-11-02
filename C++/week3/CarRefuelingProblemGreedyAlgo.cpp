#include<bits/stdc++.h>

using namespace std;

int minRefills(int* arr, int n, int full) {
    int lastRefill, numRefills = 0, currentRefill = 0;
    while(currentRefill <= n) {
        lastRefill = currentRefill;
        while (currentRefill <= n && arr[currentRefill + 1] - arr[lastRefill] <= full)
            currentRefill++;
        if(currentRefill == lastRefill)
            return -1;
        if(currentRefill <= n)
            numRefills++;
    }
    return numRefills;
}

int main() {
    int l,f,n;
    cin>>l>>f>>n;
    int *arr = new int[n+2];
    arr[0] = 0;
    for(int i = 1; i < n + 1; i++)
        cin>>arr[i];
    arr[n+1] = l;

    cout<<minRefills(arr,n,f);
    return 0;
}
