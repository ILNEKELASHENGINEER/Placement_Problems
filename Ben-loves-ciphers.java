// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length();
        int inc = 1;
        for(int i=0;i<str.length();i+=inc){
            // System.out.println(i);
            line.append(str.charAt(i));
            inc++;
        }
        System.out.println(line);
        
    }
}
