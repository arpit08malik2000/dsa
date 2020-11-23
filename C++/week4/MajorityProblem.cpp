#include<bits/stdc++.h>

using namespace std;

void majorityElement(int* arr, int n) {
    sort(arr, arr + n);
    int count = 1, max_ele = -1, temp = arr[0], f = 0;

    for (int i = 1; i < n; i++) {
        if (temp == arr[i]) {
            count++;
        } else {
            count = 1;
            temp = arr[i];
        }

        if (max_ele < count) {
            max_ele = count;
            if (max_ele > (n / 2)) {
                f = 1;
                break;
            }
        }
    }
    cout<<f<<endl;
}

int main() {
    int n;
    cin>>n;
    int* arr = new int[n];
    for (int i = 0; i < n; i++)
        cin>>arr[i];

    majorityElement(arr, n);
}
