package backjoon;

import java.util.Scanner;

public class back10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int[] arrNum;
		int n0;
		int a,b;
		n0 = sc.nextInt();
		n1 = sc.nextInt();
		
		arrNum = new int[n0];
		
		for(int i=0; i < arrNum.length; i++) {
			arrNum[i]=i+1;
		}
		
		for(int i = 0; i < n1;i++) {
			
			a = sc.nextInt()-1;
			b = sc.nextInt()-1;
			
			while(a<b) {
				int temp = arrNum[a];
				arrNum[a++] = arrNum[b];
				arrNum[b--] = temp;
			}
		}
		
		for(int arr:arrNum) System.out.print(arr + " ");
		
	}

}
