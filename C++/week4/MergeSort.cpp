#include<bits/stdc++.h>

using namespace std;

void merge(int* arr, int low, int mid, int high) {
    int length1 = mid - low + 1;
    int length2 = high - mid;
    int* A = new int[length1];
    int* B = new int[length2];
    for (int i = 0; i < length1; i++)
        A[i] = arr[low + i];
    for (int i = 0; i < length2; i++)
        B[i] = arr[mid + i + 1];

    int i = 0, j = 0;
    int k = low;
    while (i < length1 && j < length2) {
        if (A[i] <= B[j]) {
            arr[k] = A[i];
            k++;
            i++;
        } else {
            arr[k] = B[j];
            k++;
            j++;
        }
    }
    while (i < length1) {
        arr[k] = A[i];
        k++;
        i++;
    }
    while (j < length2) {
        arr[k] = B[j];
        k++;
        j++;
    }
}

void mergeSort(int* arr, int low, int high) {
    if (low < high) {
        int mid = (high + low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}

int main() {
    int n;
    cin>>n;
    int* arr = new int[n];
    for (int i = 0; i < n; i++)
        cin>>arr[i];

    mergeSort(arr, 0, n - 1);
    for (int i = 0; i < n; i++)
        cout<<arr[i]<<" ";
    cout<<endl;
}


