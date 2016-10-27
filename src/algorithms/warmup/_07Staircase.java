package algorithms.warmup;

import java.util.Scanner;

/*
	Sample Input	
	6  
	
	Sample Output
	     #
	    ##
	   ###
	  ####
	 #####
	######
*/

public class _07Staircase {
	
	// https://puu.sh/rWRHS/98cd1ac2c4.png
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
		for (int i = 1; i <= n ; i++) {
			 for (int j = 0; j < n - i; j++) {
				 System.out.print(" "); 
			 }
			 for (int j = n - i; j < n; j++) {
				 System.out.print("#"); 
			 }
			 System.out.print("\n");
		 }
		sc.close();
	}
}
