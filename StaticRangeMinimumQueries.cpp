#include <bits/stdc++.h>
using namespace std;

class SegmentTree {
    vector<long long> tree;
    int n;

public:
    SegmentTree(vector<long long>& a) {
        n = a.size();
        tree.resize(4 * n);
        build(a, 1, 0, n - 1);
    }

    void build(vector<long long>& a, int node, int start, int end) {
        if (start == end) {
            tree[node] = a[start];
            return;
        }

        int mid = (start + end) / 2;

        build(a, 2 * node, start, mid);
        build(a, 2 * node + 1, mid + 1, end);

        tree[node] = min(tree[2 * node], tree[2 * node + 1]);
    }

    long long query(int node, int start, int end, int l, int r) {

        // Completely outside the query range
        if (r < start || end < l) {
            return LLONG_MAX;
        }

        // Completely inside the query range
        if (l <= start && end <= r) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        long long left = query(2 * node, start, mid, l, r);
        long long right = query(2 * node + 1, mid + 1, end, l, r);

        return min(left, right);
    }

    long long query(int l, int r) {
        return query(1, 0, n - 1, l, r);
    }
};

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, q;
    cin >> n >> q;

    vector<long long> a(n);

    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    SegmentTree st(a);

    while (q--) {
        int a, b;
        cin >> a >> b;

        // Input uses 1-based indexing
        // Convert to 0-based
        a--;
        b--;

        cout << st.query(a, b) << '\n';
    }

    return 0;
}