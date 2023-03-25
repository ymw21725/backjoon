package backjoon;

import java.util.Scanner;

public class back25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int tmp;
		n1 =sc.nextInt();
		tmp = n1/4;
		
		for(int i=0; i < tmp; i++) {
			System.out.print("long ");
		}
		
		System.out.print("int");
	}

}
