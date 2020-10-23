/***
 *@author Arpit Malik
 *The sum of fibonacci numbers from n to m is equal to substraction of
 *(n + 1) th number from (m + 2) th number
 */

#include<bits/stdc++.h>

using namespace std;

long long seriesSum = 0;

long long* getSeries() {
    long long* series = new long long[60];
    series[0] = 0;
    series[1] = 1;
    seriesSum = seriesSum + series[0] + series[1];
    for(int i = 2; i< 60; i++) {
        series[i] = (series[i - 1] + series[ i -2]);
        seriesSum += series[i];
    }
    return series;
}

long long getSum(long long n, long long m) {
    long long* series = getSeries();

    int from = (int)((n + 1) % 60);
    int to = (int)((m + 2) % 60);

    if(from <= to)
        return (series[to] - series[from]) % 10;
    else
        return (seriesSum - (series[from] - series[to])) % 10;
}

int main() {
    long long n, m;
    cin>>n>>m;
    long long sum = getSum(n, m);
    cout<<sum<<endl;
}
