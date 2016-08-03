#include <bits/stdc++.h>

using namespace std;

string alph = "AB";
int n = 5;

void perm(string str) {
    if (str.length() == 3){
        cout << str << endl;
        return;
    }
    for (char c: alph)
        perm(str + c);
}

int main() {
    string a = "";
    perm(a);
    return 0;
}
