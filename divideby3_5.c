#include<stdio.h>
int main(){
    int three,five,fifs,num,sum=0;
    scanf("%d",&num);
    three=num/3;
    five=num/5;
    fifs=num/15;
    sum=3*(three*(three+1)/2)+3*(five*(five+1)/2)-15*(fifs*(fifs+1)/2);
    printf("%d",sum);
    
}