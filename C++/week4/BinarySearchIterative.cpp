#include<bits/stdc++.h>

using namespace std;

int binarySearch(int* arr, int low, int high, int key) {
    while (low <= high) {
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        else if (key < arr[mid])
            high = mid - 1;
        else
            low = mid + 1;
    }
    return -1;
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
