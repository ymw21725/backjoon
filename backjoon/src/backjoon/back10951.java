package backjoon;

import java.util.Scanner;

public class back10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		while(sc.hasNext()) {
			n1=sc.nextInt();
			n2=sc.nextInt();
			if(n1==0 && n2==0) break;
			else System.out.println(n1+n2);
		}
	}

}
