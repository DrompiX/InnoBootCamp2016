#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    freopen("input.txt", "r", stdin); freopen("output.txt", "w", stdout);
    string s;
    getline(cin, s);
    for (int i = 0; i < s.length(); i++) 
        if ((int)s[i] > 96 && (int)s[i] < 123) {
            s[i] = (char)(s[i] - 32);
        }

    cout << s << endl;
    return 0;
}
