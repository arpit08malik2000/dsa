#include<bits/stdc++.h>

using namespace std;

int* arr;

void swap(int* arr, int i, int j) {
    int a = arr[i];
    arr[i] = arr[j];
    arr[j] = a;
}

void shuffleArray(int* arr, int n) {
  //  Random rnd = new Random();
    for (int i = n - 1; i > 0; i--) {
        int index = 0;
        swap(arr, i, index);
    }
}

void quickSort(int* array, int lo, int hi) {
    if (hi <= lo)
        return;

    int lowerIndex = lo;
    int greaterIndex = hi;
    int element = array[lo];
    int i = lo;

    while (i <= greaterIndex) {
        if (array[i] < element)
            swap(array, lowerIndex++, i++);
        else if (array[i] > element)
            swap(array, i, greaterIndex--);
        else
            i++;
    }

    quickSort(array, lo, lowerIndex - 1);
    quickSort(array, greaterIndex + 1, hi);
}

void quickSort(int* array, int n) {
    shuffleArray(array, n);
    quickSort(array, 0, n - 1);
}

int main() {
    int n;
    cin>>n;
    arr = new int[n];
    for (int i = 0; i < n; i++)
        cin>>arr[i];

    quickSort(arr, n);
    for (int i = 0; i < n; i++)
        cout<<arr[i]<<" ";
    cout<<endl;
}
