import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if(a==0 && b!=0)
		        System.out.println(b);
		else if(a!=0 && b==0)
		        System.out.println(a);
		else if(a==b)
		        System.out.println(a);
		else{
		    int ans = gcd(a,b);
		    System.out.println("GCD = "+ans+" LCM = "+(a*b)/ans);
		}
		
	}
	public static int gcd(int a,int b){
	        while(!(a==b)){
	                if(a>b)
	                a = a-b;
	                else
	                b=b-a;
	        }
	        return a;
	}
}
