package project10;

import java.util.Scanner;

public class third {
	static void reverse(int n, int i) {
		if (i != 0) {
		if (n / (i*10) == 0) {
			System.out.print(n / i + " ");
			reverse(n % i, i / 10);
		}else {
	        reverse(n, i * 10);
	}
	}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		N = scan.nextInt();
		reverse(N, 1);

	}
}
