package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Quarter = 25;
		int Dime = 10;
		int Nickel = 5;
		int penny = 1;
		
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			int caseTarget = Integer.parseInt(br.readLine());
			sb.append(caseTarget/Quarter + " ");
			caseTarget %= Quarter;
			sb.append(caseTarget/Dime + " ");
			caseTarget %= Dime;
			sb.append(caseTarget/Nickel + " ");
			caseTarget %= Nickel;
			sb.append(caseTarget/penny + "\n");
			caseTarget %= penny;
			
			
		}
		System.out.println(sb);
		
		
	}

}
