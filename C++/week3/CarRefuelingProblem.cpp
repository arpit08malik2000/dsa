#include<bits/stdc++.h>

using namespace std;

int main() {
    int l,f,n;
    cin>>l>>f>>n;
    int *arr = new int[n+2];

    arr[0] = 0;
    for(int i = 1; i < n + 1; i++)
        cin>>arr[i];
    arr[n + 1] = l;

    int ctr = 0;
    int distLeft = f;
    for(int i = 0; i < n + 1; i++) {
        if(arr[i+1] - arr[i] <= f) {
            if(distLeft < arr[i+1] - arr[i]) {
                //re-fueling
                ctr++;
                distLeft = f;
            }
            distLeft -= arr[i+1] - arr[i];
        } else {
            ctr = -1;
            break;
        }
    }
    cout<<ctr;
    return 0;
}
