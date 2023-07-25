#include<stdio.h>
int main(){
    int num,sum=0,till;
    printf("Enter the number :");
    scanf("%d",&num);
    till=num/2;
    for(int i=1;i<=till;i++){
        if(num%i==0){
            // sum+=i;
            // printf("%d",i);
            sum+=i;
        }
    }
    if(sum==num)
        printf("Given %d is a perfect number",num);
    return 0;
}