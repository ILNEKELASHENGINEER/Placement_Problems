#include <stdio.h>

int isPalindrome(int num){
        int rev = 0;
        int org = num;
        while(num>0){
                int rem = num%10;
                rev = rev*10 + rem;
                num = num/10;
        }
        if(rev == org){
                return 1;
        }
        else{
        return 0;}
}

int main()
{
        int a;
        printf("Enter the number to find palindrome or not : ");
        scanf("%d",&a);
        if(isPalindrome(a)){
                printf("True given number is palindrome");
        }
        else{
                printf("False given number is not Palindrome");
        }
}
