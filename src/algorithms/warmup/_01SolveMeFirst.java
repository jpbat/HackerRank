package algorithms.warmup;

import java.util.*;

/*
	Sample Input	
	6
	1 2 3 4 10 11
	
	Sample Output
	31
*/

public class _01SolveMeFirst {
	
	// https://puu.sh/rWQ2u/e21685db7d.png
   
	static int solveMeFirst(int a, int b) {
		return a + b;
	}
  
	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a;
       a = in.nextInt();
       int b;
       b = in.nextInt();
       int sum;
       sum = solveMeFirst(a, b);
       System.out.println(sum);
       in.close();
	}

}
