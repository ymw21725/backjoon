package backjoon;

import java.util.Scanner;

public class back2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n;i>0;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
