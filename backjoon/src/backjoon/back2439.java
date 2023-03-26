package backjoon;

import java.util.Scanner;

public class back2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		n1 = sc.nextInt();
		
		for(int i = 1; i<=n1;i++) {
			for(int j = 1; j <=n1-i;j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
