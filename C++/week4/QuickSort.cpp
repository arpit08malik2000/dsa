#include<bits/stdc++.h>

using namespace std;

void quickSort(int* arr, int low, int high) {
    if (low > high)
        return;
    int pivotIndex = low;
    for (int i = low + 1; i <= high; i++) {
        if (arr[i] <= arr[pivotIndex]) {
            // swapping
            if(i == pivotIndex+1) {
                int temp = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = temp;
            } else {
                int temp1 = arr[pivotIndex];
                arr[pivotIndex] = arr[pivotIndex+1];
                arr[pivotIndex+1] = temp1;

                int temp2 = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = temp2;
            }
            pivotIndex++;
        }
    }

    quickSort(arr, low, pivotIndex - 1);
    quickSort(arr, pivotIndex + 1, high);
}

int main() {
    int n;
    cin>>n;
    int* arr = new int[n];
    for (int i = 0; i < n; i++)
        cin>>arr[i];

    quickSort(arr, 0, n - 1);
    for (int i = 0; i < n; i++)
        cout<<arr[i]<<" ";
    cout<<endl;
}
