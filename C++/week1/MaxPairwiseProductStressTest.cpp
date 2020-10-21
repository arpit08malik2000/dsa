#include<cstdlib>
#include<iostream>
#include<vector>

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

int main () {
    while(true) {
        int n = rand() % 1000 + 2;
        cout<<n<<endl;
        vector<int> a;
        for(int i = 0; i < n; i++) {
            a.push_back(rand() % 100000);
        }
        for( int i = 0; i < n; i++)
            cout<<a[i]<<" ";
        cout<<endl;
        long long res1 = MaxPairwiseProduct(a);
        long long res2 = MaxPairwiseProductFast(a);
        if(res1 != res2) {
            cout<<"Wrong Answer: "<<res1<<" "<<res2<<endl;
            break;
        } else {
            cout<<"OK"<<endl;
        }
    }

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
