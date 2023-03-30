package backjoon;

import java.util.Scanner;

public class back5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target;
		int[] arrNum;
		arrNum = new int[30];
		
		for(int i = 0; i < 28; i++) {
			target = sc.nextInt();
			arrNum[target-1] = target; 
		}
		
		for(int i = 0; i < 30; i++) {
			if(arrNum[i] == 0) {
				System.out.println(i+1);
			}
		}
		
		
		
	}

}
