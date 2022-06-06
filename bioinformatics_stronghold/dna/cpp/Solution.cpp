#include <iostream>
#include <string>
#include <cctype>
#include <algorithm>

using namespace std;

int main() {
    string dna_str;
    cout << "Insert a DNA string of lenght at most 1000 nt:" << endl;
    cin >> dna_str;
    int a=0, c=0, g=0, t=0;
    transform(dna_str.begin(), dna_str.end(), dna_str.begin(), [](unsigned char c) {return tolower(c);});
    a = count(dna_str.begin(), dna_str.end(), 'a');
    c = count(dna_str.begin(), dna_str.end(), 'c');
    g = count(dna_str.begin(), dna_str.end(), 'g');
    t = count(dna_str.begin(), dna_str.end(), 't');
    cout << a << " " << c << " " << g << " " << t << endl;
    return 0;
}