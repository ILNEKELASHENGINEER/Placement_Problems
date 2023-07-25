#include<stdio.h>
int main(){
    int year;
    printf("Enter the year to find ");
    scanf("%d",&year);
    if(year%4==0 && year%100!=0 || year%400==0)
        printf("%d is a leap year",year);
    else
        printf("Its not a leap year");
}