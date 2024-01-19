// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String queue = scanner.next();

        char[] queueArray = queue.toCharArray();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (queueArray[j] == 'B' && queueArray[j + 1] == 'G') {
                    queueArray[j] = 'G';
                    queueArray[j + 1] = 'B';
                    j++;
                }
            }
        }

        System.out.println(String.valueOf(queueArray));
    }
}
