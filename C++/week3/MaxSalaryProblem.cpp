#include<bits/stdc++.h>

using namespace std;

string largestSalary(vector<string> Nums, int n);
bool GreaterOrEqual(string& a , string& b);

int main() {
	int n;
	cin >> n;
	vector<string> Nums(n);
	for (size_t i = 0; i < n; i++) {
		cin >> Nums[i];
	}
	cout << largestSalary(Nums, n) << endl;
}

string largestSalary(vector<string> Nums, int n) {
	for (size_t i = 1; i < n; i++) {
		for (size_t j = 0; j < n - i; j++) {
			if (GreaterOrEqual(Nums[j], Nums[j + 1])) {
				swap(Nums[j], Nums[j + 1]);
			}
		}
	}
	stringstream Salary;
	for (size_t i = 0; i < n; i++) {
		Salary << Nums[i];
	}
	return Salary.str();
}

bool GreaterOrEqual(string& a, string& b) {
	return(b + a > a + b);
}
