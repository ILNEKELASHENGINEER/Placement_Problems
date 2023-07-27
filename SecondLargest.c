#include<stdio.h>
#include<limits.h>
int main(){
int arr[]={10,20,40,5,45,98};
int noe=sizeof(arr)/sizeof(int);
int max1=INT_MAX;
int max2=INT_MIN;
for(int index=0;index<noe;index++){
    if(arr[index],max1){
        max2=max1;
        max1=arr[index];
    }
    else if(arr[index]<max1&&arr[index]>max2){
        max2=arr[index];
    } 
}
printf("%d",max2); 
}