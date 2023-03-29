package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class back10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int max = 0;
		int min = 100;
		int[] arrNum;
		n1 = sc.nextInt();
		
		arrNum = new int[n1];
		
		for(int i=0; i<n1; i++) {
			arrNum[i] = sc.nextInt();

		}
		
		Arrays.sort(arrNum);
		System.out.print(arrNum[0] + " " + arrNum[n1-1]);

	}

}
