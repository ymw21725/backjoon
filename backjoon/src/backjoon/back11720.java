package backjoon;

import java.util.Scanner;

public class back11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		String str;
		int sum=0;
		
		
		n1 = sc.nextInt();
		str = sc.next();
		
		for(int i=0;i<n1;i++) {
			sum += str.charAt(i)-'0';
			
			
		}
		
		System.out.println(sum);
		

	}

}
