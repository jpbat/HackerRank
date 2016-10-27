package algorithms.implementation.easy._02ViralAdvertising;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n_days = sc.nextInt();
		int received = 5;

		int liked = 0;
		
		for (int i = 0; i < n_days; i++) {

			if (i > 0) {
				received *= 3;
			}

			received = Math.floorDiv(received, 2);
			
			liked += received;
		}

		System.out.println(liked);

		sc.close();
	}
}
