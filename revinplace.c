#include<stdio.h>
#define isNormal(ch) (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')
void revstr1(char str1[],int start,int end){
    char temp;
    while(start<end){
        temp=str1[start];
        str1[start]=str1[end];
        str1[end]=temp;
    }
}
int main(){
    char str1[]="=>:23asdfg127 : 00 :00 <=",temp;
    int start,end,len;
    for(len=0;str1[len];len++);
    start=0;
    end=len-1;
    while(start<end){
        for(;str1[start]&&(!(isNormal(str1[start])));start++);
        for(;str1[end]&&(!isNormal(str1[end]));end--);
        temp=str1[start];
        str1[start]=str1[end];
        str1[end]=temp;
        start++;
        end--;
    }
    printf("%s",str1);
    return 0;

    // for(int index=0;str1[index];index++){
    //     if(sayAlpha(str1[index])){
    //         printf("1 ");
    //     }
    // }
    // return 0;
}
//


