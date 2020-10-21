#include<bits/stdc++.h>

using namespace std;

long long MaxPairwiseProductFast(const vector<int>& numbers) {
    int n = numbers.size();

    int max_index_1 = -1;
    for(int i = 0; i < n; i++)
        if((max_index_1 == -1) || (numbers[i] > numbers[max_index_1]))
            max_index_1 = i;

    int max_index_2 = -1;
    for(int i = 0; i < n; i++)
        if((i != max_index_1) && ((max_index_2 == -1) || (numbers[i] > numbers[max_index_2])))
            max_index_2 = i;

    return (long long) numbers[max_index_1] * numbers[max_index_2];
}

int main() {
    int n;
    cin>>n;
    vector<int> numbers(n);
    for(int i = 0; i < n; i++) {
        cin>>numbers[i];
    }
    long long result = MaxPairwiseProductFast(numbers);
    cout<<result<<endl;
    return 0;
}
