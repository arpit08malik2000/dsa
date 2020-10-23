/***
 *@author Arpit Malik
 *The sum of squares of fibonacci numbers up to n is equal to the product of
 *nth and (n + 1) th fibonacci numbers.
 */

#include<bits/stdc++.h>

using namespace std;

int* getSeries() {
    int* series = new int[60];
    series[0] = 0;
    series[1] = 1;
    for(int i = 2; i < 60; i++)
        series[i] = series[i-1] + series[i-2];
    return series;
}

int sum(long long n) {
    int* series = getSeries();
    n = n % 60;
    if(n == 59)
        return (series[(int)n]*series[0])%10;
    else
        return (series[(int)n]*series[(int)n+1])%10;
}

int main() {
    long long n;
    cin>>n;
    cout<<sum(n)<<endl;
}
