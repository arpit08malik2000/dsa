#include<bits/stdc++.h>

using namespace std;

int Solve(vector<pair<int, int> >, vector<int> &);

int main() {
  int n;
  cin >> n;
  vector<pair<int, int> > periods(n);
  vector<int> segments;

  for (int i = 0; i < n; i++) cin >> periods[i].first >> periods[i].second;
  int Mini_Visits = Solve(periods, segments);

  cout << Mini_Visits << endl;
  for (int i = 0; i < segments.size(); i++) cout << segments[i] << ' ';
  return 0;
}

int Solve(vector<pair<int, int> > periods, vector<int> &segments) {
  sort(periods.begin(), periods.end());
  int current_visit = 0, last_visit = 1, res = 0;

  while (current_visit < periods.size()) {
    while (last_visit < periods.size() &&
           periods[current_visit].second >= periods[last_visit].first &&
           periods[current_visit].second >=
               periods[last_visit]
                   .second)
    {
      current_visit = last_visit++;
    }
    while (current_visit < periods.size() && last_visit < periods.size() &&
           periods[current_visit].second - periods[last_visit].first >= 0)
      last_visit++;
    res++;
    segments.push_back(periods[current_visit].second);
    current_visit = last_visit;
  }
  return res;
}
