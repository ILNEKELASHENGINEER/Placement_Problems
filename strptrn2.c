#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int row,col;
    for (row=1;row<=n;row++,printf("\n")){
        for (col=1;col<=n;col++){
            printf("@");
        }
    }
}