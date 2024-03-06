/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Stack<Integer> s=new Stack<>();
            int ref[]=new int[n];
            for(int i=0;i<n;i++)
            {
                if(s.empty())
                {
                    s.push(arr[i]);
                    ref[i]=s.size();
                }
             else{
                while(!s.empty() && arr[i]>=s.peek())
                {
                        s.pop();
                } 
                
                        s.push(arr[i]);
                    
                
                ref[i]=s.size();
                }

            }
            for(int i=0;i<n;i++)
            {
                System.out.print(ref[i]+" ");
            }
            System.out.println();

            t--;
        }

    }
}
