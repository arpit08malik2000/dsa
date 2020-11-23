#include<bits/stdc++.h>

using namespace std;

int binarySearch(int* arr, int low, int high, int key) {
    if (high < low)
        return -1;

    int mid = (low + high) / 2;
    if (key == arr[mid])
        return mid;
    if (key < arr[mid])
        return binarySearch(arr, low, mid - 1, key);
    else
        return binarySearch(arr, mid + 1, high, key);
}

int main() {
    int n,m;
    cin>>n;
    int* arr = new int[n];
    for (int i = 0; i < n; i++)
        cin>>arr[i];

    cin>>m;
    int* key = new int[m];
    for (int i = 0; i < m; i++)
        cin>>key[i];

    for (int i = 0; i < m; i++)
        cout<<binarySearch(arr, 0, n - 1, key[i])<<" ";
    cout<<endl;
}
