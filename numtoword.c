#include<stdio.h>
int main(){
    char ones[100][100]={"zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Tweleve","Thirteen","fourteen","fifteen","Sixteen","Siventeen","Eighteen","Nineteen"};
    char tens[100][100]={"","","Twenty","Thirty","forty","fifty","Sixty","Seventy","Eighty","Ninety"};
    int num;
    scanf("%d",&num);
    if(num>99){
        if(num%10>0&&(num%100)%10>0&&num%100>20)
            printf("%s hundred and %s %s only",ones[num/100],tens[(num%100)/10],ones[(num%100)%10]);
        else if((num%100)%10==0||num%100>0&&num%100<20)
            printf("%s hundred and %s only",ones[num/100],(num%100)/10>9?tens[(num%100)/10]:ones[(num%100)%10]);
        else
            printf("%s hundred only",ones[num/100]);
    }
    else{
        if(num>=20 && num<=99)
            if(num%10>0)
                printf("%s %s only",tens[num/10],ones[num%10]);
            else
                printf("%s only",tens[num/10]);
        else if(num<=19)
            printf("%s only",ones[num]);
    }
    return 0;
}