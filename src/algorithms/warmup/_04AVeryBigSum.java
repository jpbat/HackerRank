package algorithms.warmup;

import java.util.Scanner;

/*
	Sample Input	
	3
	11 2 4
	4 5 6
	10 8 -12
	
	Sample Output
	15
*/

public class _04AVeryBigSum {

	// https://puu.sh/rWQsR/b446fce088.png
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += sc.nextInt();;
		}
		
		System.out.println(sum);
		sc.close();
	}
	
}
