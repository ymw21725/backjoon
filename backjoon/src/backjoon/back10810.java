package backjoon;

import java.util.Scanner;

public class back10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basket;
		int m;
		int first, second, target;
		
		int[] arrNum;
		basket = sc.nextInt();
		m= sc.nextInt();
		
		arrNum = new int[basket];
		
		for(int i=0; i<m; i++) {
			first = sc.nextInt();
			second = sc.nextInt();
			target = sc.nextInt();
			
			for(int j = first-1; j<second;j++) {
				if(arrNum[j] !=0) {
					arrNum[j] = 0;
				}
					arrNum[j] = target;
			}
			
		}
		
		for(int a:arrNum) {
			System.out.print(a + " ");
		}
		

	}

}
