package algorithms.warmup.CompareTheTriplets;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int a0 = sc.nextInt();
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b0 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
		
        int alice = 0;
        int bob = 0;
        
        int []alice_votes = {a0, a1, a2};
        int []bob_votes = {b0, b1, b2};
        
        for (int i = 0; i < alice_votes.length; i++) {
        	if (alice_votes[i] > bob_votes[i]) {
        		alice++;
        	} else if (alice_votes[i] < bob_votes[i]) {
        		bob++;
        	}
        }
        
        System.out.println(alice + " " + bob);
        sc.close();
	}

}
