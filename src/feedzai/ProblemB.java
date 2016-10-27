package feedzai;

import java.util.ArrayList;
import java.util.Arrays;

public class ProblemB {
	
	// https://puu.sh/rWFpx/3c518a8c14.png
    /**
     * Two words are called friendly if the letters of the first can be rearranged to produce the second (e.g., "silent" and "listen" are friendly).
     * Write a program that given a set of words prints out all friendly words. Each set of friendly words should be print on a separate line.
     * Words without friends should not be printed. The output should be alphabetically ordered (across lines and within each line).
     *
     * @param input An array with all the words to be processed.
     * @return An array with each line of the output. Each line should have already the friendly words. (eg.: the first line of the example output is "cheating teaching"
     */
    static String[] given_friendlyWords(String[] input) {
        return new String[]{};
    }
    
    static boolean are_friendly(String a, String b) {
    	char[] a_array = a.toCharArray();
    	char[] b_array = b.toCharArray();
    	Arrays.sort(a_array);
    	Arrays.sort(b_array);
    	String sorted_a = new String(a_array); 
    	String sorted_b = new String(b_array);
    	return sorted_a.equalsIgnoreCase(sorted_b);
    }
    
    static String[] friendlyWords(String[] input) {
    
    	if (input == null) {
    		return new String[]{};
    	}
    	
    	ArrayList<String> retval = new ArrayList<String>();
    	
    	// make sure we dont use twice the same word
    	boolean[] processed = new boolean[input.length];
    	for (int i = 0; i < input.length; i++) {
    		processed[i] = false;
    	}
    	
    	Arrays.sort(input);
    	
    	for (int i = 0; i < input.length; i++) {
    		ArrayList<String> my_friends = new ArrayList<String>();
    		for (int j = i + 1; j < input.length; j++) {

        		if (processed[j]) {
        			continue;
        		}
    			
    			if (are_friendly(input[i], input[j])) {
    				my_friends.add(input[j]);
    				// mark it as processed
    				processed[j] = true;
    			}
    		}
    		
    		if (!my_friends.isEmpty()) {
				String friend_string = input[i];
				for (int j = 0; j < my_friends.size(); j++) {
					friend_string += " " + my_friends.get(j);
				}
				retval.add(friend_string);
    		}
    	}
    	
    	String[] final_retval = new String[retval.size()];
    	final_retval = retval.toArray(final_retval);
    	
        return final_retval;
    }
    
	public static void main(String[] args) {
		String[] input = {"car", "cheating", "dale", "deal", "lead", "listen", "silent", "teaching"};
		String[] output = friendlyWords(input);
		System.out.println(Arrays.toString(output));
	}
}
