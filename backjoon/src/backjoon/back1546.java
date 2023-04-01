package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class back1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		
		double sum=0;
		
		double[] arrNum;
		cnt = sc.nextInt();
		arrNum = new double[cnt];
		
		for(int i=0; i < cnt;i++) {
			arrNum[i] = sc.nextDouble();	
		}
		Arrays.sort(arrNum);
		
		for(int i=0;i<arrNum.length;i++) {
			
			sum += (arrNum[i]/arrNum[arrNum.length-1])*100;
			
			
		}
		
		
		System.out.println(sum/arrNum.length);
		
		

	}

}
