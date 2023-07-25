#include<stdio.h>
int main(){
    int res=0,num,div;
    scanf("%d",&num);
    while(num>0){
        div=num%10;
        res=res*10+div;
        num=num/10;
    }
    printf("%d",res);
    return 0;
}