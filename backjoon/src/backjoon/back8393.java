package backjoon;

import java.util.Scanner;

public class back8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			sum +=i;
		}
		System.out.println(sum);
		

	}

}
