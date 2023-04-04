package backjoon;

import java.util.Scanner;

public class back9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String s1;
		num = sc.nextInt();
		
		
		for(int i=0;i<num;i++) {
			s1 = sc.next();
			int tmp = s1.length();
			
			String first = s1.valueOf(s1.charAt(0));
			String last = s1.valueOf(s1.charAt(tmp-1));
			System.out.println(first + last);
			
		}
		sc.close();
		
		
		
		
		

	}

}
