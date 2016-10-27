package algorithms.warmup;

import java.util.Scanner;

/*
	Sample Input	
	6
	-4 3 -9 0 4 1  
	
	Sample Output
	0.500000
	0.333333
	0.166667
*/

public class _05DiagonalDifference {
	
	// https://puu.sh/rWQOJ/ffc003b52e.png
	
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
