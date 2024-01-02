import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int [n];
	    int ans = 0;
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	        ans = ans^arr[i];
	    }
	    char wins = ans==0?'B':'A';
	    System.out.println("The winner is "+wins);
}
}

//given a numbers of ball and a,b picks balls wisely and the winner is who is picking the ball at last
//idea : xor of all values = > if it is zero b wins else a wins
