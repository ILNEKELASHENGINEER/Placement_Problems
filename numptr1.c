#include<stdio.h>
int main(){
    int n;
    int temp=1;
    scanf("%d",&n);
    for(int row=1,print=n;row<=n;row++,print--,printf("\n")){
        for(int col=1;col<=row;col++){
            printf("%d",print);    
                }
    }
 
}