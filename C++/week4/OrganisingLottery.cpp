#include<bits/stdc++.h>

using namespace std;

void PrintArray(int n,int arr[]) {
     for(int i = 0; i < n; i++)  {
         cout<<arr[i]<<" ";
     }
}

void NumberOfSegments(vector<pair<int,int> >segments, vector<int>points, int s, int p) {
   vector< pair<int, int> >pts, seg;
   for(int i = 0; i < p; i++) {
      pts.push_back({points[i], i});;
   }

   for(int i = 0; i < s; i++) {
      seg.push_back({segments[i].first, 1});
      seg.push_back({segments[i].second+1, -1});
   }

   sort(seg.begin(), seg.end(), greater<pair<int,int> >());
   sort(pts.begin(),pts.end());

   int count = 0;
   int ans[p];

   for(int i = 0; i < p; i++) {
        int x = pts[i].first;

        while(!seg.empty() && seg.back().first <= x) {
            count+= seg.back().second;
            seg.pop_back();
        }
        ans[pts[i].second] = count;
   }
   PrintArray(p, ans);
}

int main() {
    int n, m, x, y, p;
    cin>>n>>m;
    vector<pair<int,int> > seg;
    for(int i = 0; i<n;i++) {
        cin>>x>>y;
        seg.push_back({x, y});
    }
    vector<int>point;
    for(int i=0;i<m;i++) {
        cin>>p;
        point.push_back(p);
    }

    NumberOfSegments(seg, point, n, m);
    return 0;
}
