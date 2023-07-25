#include<stdio.h>
int main(){
    int num,power,rotated,torotate,nor,nod;
    scanf("%d%d",&num,&nor);
    for(power=1,nod=0;num/power;power*=10,nod++);
    power = power/10;
    nor=nor%nod;
    torotate=rotated=num;
    while(nor>0){
        rotated=torotate%power*10+torotate/power;
        torotate=rotated;
        nor--;
    }
    printf("%d",rotated);
    return 0;
}