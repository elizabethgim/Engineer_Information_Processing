#include <stdio.h>
int main(void){
    int i;
    int sum;
    for(i=1;i<=10;i+=2){
        printf("%B", bool(i%2));
        printf("%B", bool(i%3));
        if (i%2 && i%3) continue;
        sum+=i;
    }
    printf("%d\n", sum);
    return 0;
}