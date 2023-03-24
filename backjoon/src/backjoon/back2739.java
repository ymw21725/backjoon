package backjoon;

import java.util.Scanner;

public class back2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		for(int i = 1 ;i < 10; i ++) {
			System.out.println(n1 + " * " + i + " = " + n1*i);
		}
	}

}
