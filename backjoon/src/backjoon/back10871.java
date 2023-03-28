package backjoon;

import java.util.Scanner;

public class back10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,x;
		int tmp = 0;
		int[] arrNum;
		int[] tmpNum;
		
		num = sc.nextInt();
		x = sc.nextInt();
		arrNum = new int[num];
		tmpNum = new int[num];
		
		for(int i=0;i<num;i++) {
			arrNum[i] = sc.nextInt();
			if(x > arrNum[i]) {
				tmpNum[tmp++] = arrNum[i];
			}
		}
		
		for(int a:tmpNum) {
			if(a !=0) {
				System.out.print(a + " ");				
			}
		}
		
		
		
	}

}
