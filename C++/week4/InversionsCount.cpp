#include<bits/stdc++.h>

using namespace std;

long inversions = 0;

int* mergeAndCountSplitInversions(int* a, int* b, int n, int m) {
    int j = 0;
    int k = 0;

    int* result = new int[n + m];

    for(int i = 0; i < n + m; i++) {
        if(j < n && k < m) {
            if(a[j] <= b[k]) {
                result[i] = a[j];
                j++;
            } else {
                result[i] = b[k];
                k++;

                inversions += n - j;
            }

        } else if(j < n) {
            result[i] = a[j];
            j++;
        } else if(k < m) {
            result[i] = b[k];
            k++;
        }
    }
    return result;
}

int* sortAndCountInversions(int* a, int n) {
    if(n == 1) {
        return a;
    } else {
        int * firstHalfArray = new int[n/2];
        int * secondHalfArray = new int[n/2];
        for(int i = 0, j = 0; i < n; i++) {
            if(i < n/2) {
                firstHalfArray[i] = a[i];
            } else {
                secondHalfArray[j++] = a[i];
            }
        }
        int* firstHalf = sortAndCountInversions(firstHalfArray, n/2);
        int* secondHalf = sortAndCountInversions(secondHalfArray, n/2);
        return mergeAndCountSplitInversions(firstHalf, secondHalf, n/2, n/2);
    }
}

int main() {
    inversions = 0;
    int n;
    cin>>n;
    int* numbers = new int[n];
    for(int i = 0; i < n; i++) {
        cin>>numbers[i];
    }
    sortAndCountInversions(numbers, n);
    cout<<inversions;
}
