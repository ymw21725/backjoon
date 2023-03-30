package backjoon;

import java.util.Scanner;

public class back10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basket;
		int m;
		int n1, n2;
		
		int[] arrNum;
		basket = sc.nextInt();
		m= sc.nextInt();
		
		arrNum = new int[basket];
		
		for(int i=0; i<basket; i++) {
			arrNum[i] = i+1;
		}
		
		for(int i=0,tmp;i<m;i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			tmp = arrNum[n1-1];
			arrNum[n1-1] = arrNum[n2-1];
			arrNum[n2-1] = tmp;
		}
		
		
		
		for(int a:arrNum) {
			System.out.print(a + " ");
		}
		

	}

}
