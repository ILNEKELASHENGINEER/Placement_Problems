#include<stdio.h>
#include<math.h>
int main(){
    int num,fact,till;
    scanf("%d",&num);
    till = sqrt(num);
    for(fact=1;fact<=till;fact++){
        if(num%fact==0)
            if(fact*fact==num)
                printf("%d",fact);
            else
                printf("%d %d ",fact,num/fact);
    }
}