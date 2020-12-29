package project10;

import java.util.ArrayList;
import java.util.Scanner;

public class second {
	static void nechetn() {
		Scanner scan = new Scanner(System.in);
		  ArrayList<Integer> list = new ArrayList<>();
	        int p;
	        int flag = 0;
	        while ((p = scan.nextInt()) != 0)
	        {
	            if (flag == 0)
	                list.add(p);
	            flag = (flag == 0) ? 1 : 0;
	        }
	        System.out.println(list);
	}
	public static void main(String[] args) {
		nechetn();
	}
}
