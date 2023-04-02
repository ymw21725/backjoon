package backjoon;

import java.util.Scanner;

public class back27866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch;
		int target;
		
		ch = sc.next();
		target = sc.nextInt();
		
		System.out.println(ch.substring(target-1,target));
		
		
	}

}
