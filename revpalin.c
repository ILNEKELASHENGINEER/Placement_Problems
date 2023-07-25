#include<stdio.h>
int main(){
    int res=0,num,safe,div;
    scanf("%d",&num);
    safe=num;
    while(num>0){
        div=num%10;
        res=res*10+div;
        num=num/10;
    }
    printf("%d",res);
    if(safe==res){
        printf("\nThe given number is palindrome");
    }
    else
        printf("\nThe given number is not palindrome");
        
    return 0;
}