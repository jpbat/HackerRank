package algorithms.sorting.easy;

import java.util.Scanner;

public class IntroToTutorialChallenges {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int n = sc.nextInt();
		int temp;
		
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			
			if (V == temp) {
				System.out.println(i);
				break;
			}
		}
		
		sc.close();
	}

}
