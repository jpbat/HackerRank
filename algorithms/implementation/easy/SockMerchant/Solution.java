package algorithms.implementation.easy.SockMerchant;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sock, matches = 0, sock_index;
		ArrayList<Integer> colors = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			sock = sc.nextInt();
			sock_index = colors.indexOf(sock);
			if (sock_index != -1) {
				colors.remove(sock_index);
				matches++;
			} else {
				colors.add(sock);
			}
		}
		
		System.out.println(matches);
		sc.close();
	}
}
