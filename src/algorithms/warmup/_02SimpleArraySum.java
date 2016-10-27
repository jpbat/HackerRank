package algorithms.warmup;

import java.util.Scanner;

/*
	Sample Input	
	5 6 7
	3 6 10
	
	Sample Output
	1 1 
*/

public class _02SimpleArraySum {
	
	// https://puu.sh/rWQ3O/272ccbed1a.png
	
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	
    	int sum = 0;
    	for (int i = 0; i < size; i++) {
    		sum += sc.nextInt();
    	}
    	sc.close();
    	System.out.println(sum);
    }
}
