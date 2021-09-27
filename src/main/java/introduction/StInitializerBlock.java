package introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */

public class StInitializerBlock {
    static boolean flag = true;
    static int B, H;

    static {
        try {
            Scanner sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main
}
