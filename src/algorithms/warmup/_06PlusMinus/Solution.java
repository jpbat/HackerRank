package algorithms.warmup._06PlusMinus;

import java.util.Scanner;

public class Solution {
	
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
