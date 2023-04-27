package backjoon;

import java.util.Scanner;

public class back25206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열로 하기.
		double scoreSum = 0.0;
		double totalSum = 0.0;
		String[] gradeArr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "P", "F"};
		double[] gradeArrScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		
		for(int i=0; i<20;i++) {
			String name = sc.next();
			double score = sc.nextDouble();
			String grade = sc.next();
			
			for(int j=0; j<10;j++) {
				if(grade.equals(gradeArr[j])) {
					totalSum += score * gradeArrScore[j];
					if(j!=8) {
						scoreSum += score;
					}
				} 
				
			}
		}
		
		double avg = totalSum/scoreSum;
		System.out.printf("%6f",avg);
		
	}

}
