#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin>>n;
    int* arr = new int[n];
    for (int i = 0; i < n; i++)
        cin>>arr[i];

    int* count = new int[3];
    for (int i = 0; i < n; i++) {
        if (arr[i] == 1)
            count[0]++;
        if (arr[i] == 2)
            count[1]++;
        if (arr[i] == 3)
            count[2]++;
    }

    int j = 0;
    for (int i = 0; i < 3; i++) {
        for (; count[i] > 0; count[i]--) {
            arr[j] = i + 1;
            j++;
        }
    }

    for (int i = 0; i < n; i++) {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
