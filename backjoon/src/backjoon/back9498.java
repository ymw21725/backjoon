package backjoon;

import java.util.Scanner;

public class back9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		n1 = sc.nextInt();
		
		if(n1 >= 90 && n1 <=100) {
			System.out.println("A");
		} else if(n1 >= 80 && n1 <=89) {
			System.out.println("B");
		} else if(n1 >= 70 && n1 <=79) {
			System.out.println("C");
		} else if(n1 >= 60 && n1 <=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
