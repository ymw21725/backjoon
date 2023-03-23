package backjoon;

import java.util.Scanner;

public class back2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		n1 = sc.nextInt();
		
		if((n1%4 == 0 && n1%100 !=0) || n1%400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
