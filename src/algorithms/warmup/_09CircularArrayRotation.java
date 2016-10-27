package algorithms.warmup;

import java.util.Scanner;

/*
    Sample Input
    3 2 3
    1 2 3
    0
    1
    2

    Sample Output
    2
    3
    1
*/

public class _09CircularArrayRotation {

    // https://puu.sh/rWTg8/cc28309b42.png

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        for(int i = 0; i < q; i++){
            int m = in.nextInt();
        }

        in.close();
    }
}
