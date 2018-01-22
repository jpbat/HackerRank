package algorithms.implementation.easy.DivisibleSumPairs;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int results = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n ; j++) {
                if ((a[i] + a[j]) % k == 0) {
                    results++;
                }
            }
        }

        sc.close();
        System.out.println(results);
    }
}
