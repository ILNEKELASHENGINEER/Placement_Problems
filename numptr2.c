#include<stdio.h>
int main(){
    int n,row,col,print;
    scanf("%d",&n);
    for(row=1;row<=n;row++,printf("\n")){
        print=row%2==0?1:0;
        for(col=1;col<=row;col++){
           printf("%d",print=print^1);
        }
    }
    return 0;
}