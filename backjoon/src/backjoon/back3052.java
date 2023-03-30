package backjoon;

import java.util.Scanner;

public class back3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int cnt=0;
		boolean[] arrNum;
		arrNum = new boolean[42];
		
		for(int i=0; i<10; i++) {
			n1 = sc.nextInt();
			arrNum[n1%42] = true;
		}
		for(boolean value:arrNum) {
			if(value) cnt++;
			
		}
		
		System.out.println(cnt);
		
	}

}
