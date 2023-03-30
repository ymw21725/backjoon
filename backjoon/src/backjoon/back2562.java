package backjoon;

import java.util.Scanner;

public class back2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int tmp=0;
		
		int[] arrNum;
		arrNum = new int[9];
		
		for(int i=0; i<9;i++) {
			arrNum[i] = sc.nextInt();
			if(arrNum[i]>max) {
				max = arrNum[i];
				tmp = i;
			}
		}
		
		System.out.println(max);
		System.out.println(tmp+1);
		
		
		
	}

}
