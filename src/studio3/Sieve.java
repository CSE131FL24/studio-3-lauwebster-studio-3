package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for n: ");
		int n = in.nextInt();
		boolean[] sieve = new boolean[n];
		int p = 2;
		for(int i = 0; i < sieve.length; i++) {
			for(int s = 2; p * s <= sieve.length-1; s++) {
				sieve[p*s] = true;
			
			}
			if(sieve[i] == false && i > 1) {
				System.out.println(i);
			}
			p++;

		}

	}

}
