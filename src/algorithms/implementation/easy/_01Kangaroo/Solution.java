package algorithms.implementation.easy._01Kangaroo;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        in.close();
        
        long a, b;
        try {
        	if(v1 < v2) {
                System.out.println("NO");
            } else {
                a = x2 - x1;
                b = v1 - v2;
                if(a % b == 0) {
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }
		} catch (ArithmeticException e) {
			System.out.println("NO");
		} 
	}
}
