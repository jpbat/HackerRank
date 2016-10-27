package feedzai;

import java.util.Arrays;

public class ProblemA {

	// https://puu.sh/rWEGc/4e7786c20a.png
	
	/**
     * The following routine checks if two arrays have the same contents (strings) in any order.
     * It clearly has problems.
     * Identify the bugs and correct the implementation.
     */
    static boolean given_sameContents(String[] a, String[] b) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }
    
    static boolean sameContents(String[] a, String[] b) {
    	
    	if (a == null) {
    		if (b == null) {
    			return true;
    		} else {
    			return false;
    		}
    	} else if (b == null) {
    		return false;
    	}
    	
    	if (a.length != b.length) {
    		return false;
    	}
    	
    	Arrays.sort(a);
    	Arrays.sort(b);  	

        for (int i = 0; i < a.length; i++) {
        	if (a[i] != b[i]) {
        		return false; 
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		String[] a = {"asd", "das"};
		String[] b = {"asd", "das"};
		System.out.println(sameContents(a,b));
	}

}
