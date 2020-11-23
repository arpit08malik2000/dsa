#include<bits/stdc++.h>

using namespace std;

int linearSearch(int* arr, int low, int high, int key) {
    if(high < low)
        return -1;
    if(arr[low] == key)
        return low;
    return linearSearch(arr, low+1, high, key);
}

int main() {
    int n, key;
    cin>>n;
    int* arr = new int[n];
    for (int i = 0; i < n; i++)
        cin>>arr[i];
    cin>>key;

    int result = linearSearch(arr, 0, n - 1, key);
    cout<<result<<endl;
}
