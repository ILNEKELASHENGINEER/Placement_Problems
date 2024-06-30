// Online C compiler to run C program online
#include <stdio.h>
void prime(int num){
    for(int i=2;num>1;i++){
        // printf("The number is %d \n",num);
        while(num%i==0){
            printf("the factor is %d\n",i);
            num=num/i;
        }
        // printf("\n");
    }
}
int main() {
   int num=90;
//   printf("Enter the positive integer");
//   scanf("%d",&num);
   prime(num);
   return 0;
}
