#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin>>n;
    vector<int> nos;

    if (n == 2) {
        nos.push_back(2);
    } else {
        int i=1;
        while (n > 0) {
            if (n - i <= i) {
                i = n;
            }
            nos.push_back(i);
            n -= i;
            i++;
        }
    }

    cout<<nos.size()<<endl;
    for(int i1 = 0; i1<nos.size();i1++)
        cout<<nos[i1]<<" ";
    cout<<endl;
    return 0;
}
