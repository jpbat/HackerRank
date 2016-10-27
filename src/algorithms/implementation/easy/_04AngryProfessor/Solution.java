package algorithms.implementation.easy._04AngryProfessor;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        int n_students;
        int k_students;
        int arrival_time;

        for (int i = 0; i < test_cases; i++) {
        	n_students = sc.nextInt();
        	k_students = sc.nextInt();
        	for (int j = 0; j < n_students; j++) {
        		arrival_time = sc.nextInt();
        		if (arrival_time <= 0) {
            		k_students--;
            	}
        	}
        	if (k_students > 0) {
        		System.out.println("YES");
        	} else {
        		System.out.println("NO");
        	}
        }

        sc.close();
    }

}
