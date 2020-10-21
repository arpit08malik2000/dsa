#include<bits/stdc++.h>

using namespace std;

long long MaxPairwiseProduct(const vector<int>& numbers) {
    long long result = 0;
    int n = numbers.size();
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            if((i!=j) && ((long long)numbers[i]*numbers[j] > result))
                result = numbers[i]*numbers[j];
    return result;
}

int main() {
    int n;
    cin>>n;
    vector<int> numbers(n);
    for(int i = 0; i < n; i++) {
        cin>>numbers[i];
    }
    long long result = MaxPairwiseProduct(numbers);
    cout<<result<<endl;
    return 0;
}
