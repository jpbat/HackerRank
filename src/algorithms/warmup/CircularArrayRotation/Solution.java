package algorithms.warmup.CircularArrayRotation;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[(i + k) % n] = in.nextInt();
        }

        for(int i = 0; i < q; i++){
            int m = in.nextInt();
            System.out.println(a[m]);
        }

        in.close();
    }
}
