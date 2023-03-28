package backjoon;

import java.util.Scanner;

public class back10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0,findNum,count=0;
		int[] arrNum ;
		
		n1 = sc.nextInt();
		arrNum = new int[n1];
		for(int i=0; i<n1;i++) {
			arrNum[i] = sc.nextInt();
		}
		
		findNum = sc.nextInt();
		for(int i=0; i<n1;i++) {
			if(findNum == arrNum[i]) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
