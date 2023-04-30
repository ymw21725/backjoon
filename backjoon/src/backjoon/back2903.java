package backjoon;

import java.util.Scanner;

public class back2903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int first = 3;
		int[] arr = new int[16];
		for(int i=1;i<arr.length;i++) {
			arr[i] = first * first;
			first = first + first-1;
		}
		System.out.println(arr[n]);
		
		
	}

}
