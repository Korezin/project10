package project10;
import java.util.ArrayList;
import java.util.Scanner;

public class first {
	static void nechetn() {
		Scanner scan = new Scanner(System.in);
		  ArrayList<Integer> list = new ArrayList<>();
	        int p;
	        int count = 0;
	        while ((p = scan.nextInt()) != 0)
	        {
	            if (p % 2 != 0)
	                list.add(p);
	        }
	        System.out.println(list);
	}
	public static void main(String[] args) {
		nechetn();
	}
}
