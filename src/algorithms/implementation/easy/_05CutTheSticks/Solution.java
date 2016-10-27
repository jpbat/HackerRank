package algorithms.implementation.easy._05CutTheSticks;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = 1001;
		int n_sticks = sc.nextInt();
		int []sticks = new int[n_sticks];
		int cuts;
		
		for (int i = 0; i < n_sticks; i++) {
			sticks[i] = sc.nextInt();
		}
		
		do {
			cuts = 0;
			length = 1001;
			for (int i = 0; i < n_sticks; i++) {
				if (length > sticks[i] && sticks[i] > 0) {
					length = sticks[i];
				}
			}
			
			for (int i = 0; i < n_sticks; i++) {
				if (sticks[i] > 0) {
					sticks[i] -= length;
					cuts++;
				}
			}
			
			if (cuts > 0) {
				System.out.println(cuts);	
			}
			
		} while(cuts > 0);
		
		sc.close();
	}
}
