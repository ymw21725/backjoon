package backjoon;

import java.util.Scanner;

public class back2745 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		int sum = 0;
		int tmp = 1;
		
		for(int i=N.length()-1; i>=0;i--) {
			char ch = N.charAt(i);
			
			if('A'<= ch && ch<='Z') {
				sum += (ch-'A'+10)*tmp;
			} else {
				sum += (ch-'0')*tmp;
			}
			tmp *= B;
		}
		System.out.println(sum);
		
	}

}
