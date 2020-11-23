#include<bits/stdc++.h>

using namespace std;

int* selectionSort(int* arr, int length, int currentIndex) {
    if (currentIndex == length - 1)
        return arr;

    int minIndex = currentIndex;
    for (int i = currentIndex + 1; i < length; i++) {
        if(arr[i] < arr[minIndex]) {
            minIndex = i;
        }
    }

    if(minIndex != currentIndex) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[currentIndex];
        arr[currentIndex] = temp;
    }

    return selectionSort(arr, length, currentIndex + 1);
}

int main() {
    int n;
    cin>>n;
    int* arr = new int[n];
    for (int i = 0; i < n; i++)
        cin>>arr[i];

    arr = selectionSort(arr, n, 0);
    for (int i = 0; i < n; i++)
        cout<<arr[i]<<" ";
    cout<<endl;
}

