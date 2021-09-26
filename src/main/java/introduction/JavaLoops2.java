package introduction;

import java.util.*;
import java.io.*;
import java.lang.Math;

/**
 * https://www.hackerrank.com/challenges/java-loops/problem
 */

public class JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] a = new int[t][3];

        for (int i = 0; i < t; i++) {
            a[i][0] = in.nextInt(); //a
            a[i][1] = in.nextInt(); //b
            a[i][2] = in.nextInt(); //n
        }
        in.close();

        for (int j = 0; j < t; j++) {
            int c = a[j][0];
            for (int i = 0; i < a[j][2]; i++) {
                c += Math.pow(2, i) * a[j][1];
                System.out.printf("%s ", c);
            }
        System.out.println();
        }
    }
}
