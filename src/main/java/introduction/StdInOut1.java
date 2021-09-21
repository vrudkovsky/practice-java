package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class StdInOut1 {
    public static void main(String[] args) throws IOException {
        int[] myInts = new int[3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            myInts[i] = sc.nextInt();
//        }
//        sc.close();
//        Arrays.stream(myInts).forEach(System.out::println);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            myInts[i] = Integer.parseInt(br.readLine().trim());
        }

    }
}
