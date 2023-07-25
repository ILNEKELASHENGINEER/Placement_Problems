#include<stdio.h>
int main(){
    int num,nod;
    scanf("%d",&num);
    for(nod=0;num>0;nod++,num/=10);
    printf("%d",nod);

}