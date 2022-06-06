#include <stdio.h>

void main() {
    const int MAX = 1000;
    char dna_str[1000];
    int a=0, c=0, g=0, t=0;
    int i;
    printf("Insert a DNA string of lenght at most 1000 nt:\n");
    scanf("%S", dna_str);
    for(i=0; i<MAX; i++) {
        switch(dna_str[i]) {
            case 'A':
            case 'a':
                a = a + 1;
                break;
            case 'C':
            case 'c':
                c = c + 1;
                break;
            case 'G':
            case 'g':
                g = g + 1;
                break;
            case 'T':
            case 't':
                t = t + 1;
        }
    }
    printf("%d %d %d %d\n", a, c, g, t);
}