import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
      System.out.print ("Enter the number : ");
    int n = in.nextInt ();
      System.out.println ("=" + fib (n));
  }
  public static int fib (int n)
  {
    if (n != 1)
      System.out.print (n + "*");
    if (n == 1)
      {
	System.out.print (n);
	return 1;
      }
    return n * fib (n - 1);
  }
}
