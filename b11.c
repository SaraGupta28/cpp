#include <stdio.h>

#include <stdlib.h>

void main() {
    int yr, a, lyrs, firstday;
    printf("Enter the year");
    scanf("%d",&yr);
    a = yr - 1;
    lyrs = a / 4 - a / 100 + a / 400;
    firstday = (a + lyrs) % 7;
    printf("%d",firstday);
    if(firstday==0)
        
        printf("\n monday");

    if (firstday == 1)

        printf("\n tuesday");

    if (firstday == 2)

        printf("\n wednesday");

    if (firstday == 3)

        printf("\n thursday");

    if (firstday == 4)

        printf("\n friday");

    if (firstday == 5)

        printf("\n saturday");

    if (firstday == 6)

        printf("\n sunday");
    else {
        printf("Enter valid year");
    }


}
