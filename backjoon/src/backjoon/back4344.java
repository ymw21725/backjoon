package backjoon;

import java.util.Scanner;

public class back4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int C = sc.nextInt();
		
		for(int i=0; i<C;i++) {
			int N = sc.nextInt();
			arr = new int[N];
			double sum = 0;
			
			for(int j=0; j<N;j++) {
				int grade = sc.nextInt();
				arr[j] = grade;
				sum+= grade;
			}
			
			double avg = (sum / N);
			double cnt = 0;
			
			for(int k = 0; k < N; k++) {
				if(arr[k] > avg) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n",(cnt/N)*100);
			
		}
		
		sc.close();
	}

}
