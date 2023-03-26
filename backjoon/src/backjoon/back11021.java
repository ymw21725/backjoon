package backjoon;

import java.util.Scanner;

public class back11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp,n1,n2;
		
		tmp = sc.nextInt();
		
		for(int i=0; i < tmp; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			System.out.printf("Case #%d: %d\n",i+1,n1+n2);
		}
		
	}

}
