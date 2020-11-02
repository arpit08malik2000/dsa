#include<bits/stdc++.h>

using namespace std;

int getGroups(float *children, int length) {
    int lastChild = length;
    int currentChild = 1;
    int startingPoint = 0;
    int groups = 0;

    while (currentChild < lastChild) {
        if (children[currentChild] - children[startingPoint] > 1) {
            startingPoint = currentChild;
            groups++;
        }

        if (currentChild == lastChild - 1) {
            groups++;
        }
        currentChild++;
    }

    return groups;
}

int main() {
    int n;
    cin>>n;
    float *children = new float[n];
    for (int i = 0; i < n; i++)
        cin>>children[i];

    sort(children, children + n);
    int groups = getGroups(children,n);
    cout<<groups;
    return 0;
}
