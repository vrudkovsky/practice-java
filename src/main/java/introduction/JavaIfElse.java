package introduction;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-if-else/problem
 */

public class JavaIfElse {
    private static final Scanner sc = new Scanner(System.in);

    public static void print(String s) {
        System.out.printf("%s\n", s);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (n % 2 == 1 || n >= 6 && n <= 20) {
            print("Weird");
        } else if (n % 2 == 0 || n >= 2 && n <= 5) {
            print("Not Weird");
        } else {
            print("Not Weird");
        }

        sc.close();
    }
}
