package algorithms.warmup._05DiagonalDifference;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][]matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int diagonal1 = 0, diagonal2 = 0;
		for (int i = 0; i < n; i++) {
			diagonal1 += matrix[i][i];
			diagonal2 += matrix[i][n-i-1];
		}

		System.out.println(Math.abs(diagonal1 - diagonal2));
		sc.close();
	}

}
