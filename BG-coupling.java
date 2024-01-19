import java.util.Scanner;

public class BoyGirlLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if(n>m){
            bfirst(n,m);
        }
        else{
            gfirst(n,m);
        }
    }
    public static void gfirst(int n,int m){
        int i=0;
        StringBuilder line = new StringBuilder();
         while (n > 0 || m > 0) {
            if (i % 2 == 0 && m > 0) {
                line.append("G");
                m--;
            } else if (i % 2 == 1 && n > 0) {
                line.append("B");
                n--;
            }
            i++;
        }

        System.out.println(line.toString());
    }
    public static void bfirst(int n,int m){
        int i=0;
        StringBuilder line = new StringBuilder();
         while (n > 0 || m > 0) {
            if (i % 2 == 1 && m > 0) {
                line.append("G");
                m--;
            } else if (i % 2 == 0 && n > 0) {
                line.append("B");
                n--;
            }
            i++;
        }

        System.out.println(line.toString());
    }
}
