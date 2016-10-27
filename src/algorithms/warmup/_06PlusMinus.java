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

public class _06PlusMinus {
	
	// https://puu.sh/rWRlR/034b773c74.png
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		float positives = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] > 0) {
				positives++;
			}
		}
		float negatives = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] < 0) {
				negatives++;
			}
		}
		float zeroes = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == 0) {
				zeroes++;
			}
		}
		
		System.out.println(positives / array.length);
		System.out.println(negatives / array.length);
		System.out.println(zeroes / array.length);
	}
}
