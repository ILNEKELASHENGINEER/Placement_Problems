// c:\Users\Admin\Documents\C programming\strptrn3.c
#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int row,col;
    for (row=1;row<=n;row++,printf("\n")){
        for (col=1;col<=row;col++){
            printf("@");
        }
        for (col=1;col<=n-row;col++){
            printf(" ");
        }
        for (col=1;col<=n-row;col++){
            printf(" ");
        }
        for (col=1;col<=row;col++){
            printf("@");
        }
    }
    for (row=n-1;row>0;row--,printf("\n")){
        for (col=1;col<=row;col++){
            printf("@");
        }
        for (col=1;col<=n-row;col++){
            printf(" ");
        }
        for (col=1;col<=n-row;col++){
            printf(" ");
        }
        for (col=1;col<=row;col++){
            printf("@");
        }
    }
}