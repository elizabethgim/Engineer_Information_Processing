#include <stdio.h>
void main(){
    int a = 5;
    int s = 0;

    switch (a/2)
    {
        case 2 : s++;
        case 3 : a += s;
        default: a++;
    }

    printf("%d %d", s, a);
}