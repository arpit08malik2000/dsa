#include<bits/stdc++.h>

using namespace std;

int linearSearch(int* arr, int length, int key) {
    for (int i = 0; i < length; i++) {
        if (arr[i] == key)
            return i;
    }
    return -1;
}

int main() {
    int n, key;
    cin>>n;
    int* arr = new int[n];
    for (int i = 0; i < n; i++)
        cin>>arr[i];
    cin>>key;

    int result = linearSearch(arr, n, key);
    cout<<result<<endl;
}
