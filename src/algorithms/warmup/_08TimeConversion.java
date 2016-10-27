package algorithms.warmup;

import java.util.Scanner;

/*
	Sample Input	
	07:05:45PM
	
	Sample Output
	19:05:45
*/

public class _08TimeConversion {
	
	// https://puu.sh/rWSee/ed315ec07e.png
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		
		String format = original.substring(original.length() - 2, original.length());
		
		int hours = Integer.parseInt(original.substring(0, 2));
		
		if (format.equals("PM")) {
			if (hours == 12) {
				hours = 12;
			} else {
				hours += 12 % 24;
			}
		} else {
			if (hours == 12) {
				hours = 0;
			}
		}
		
		String s_hours = hours + "";
		if (hours < 10) {
			s_hours = "0" + hours;
		}
		
		System.out.println(s_hours + original.substring(2, original.length() - 2));
		
		sc.close();
	}
}
