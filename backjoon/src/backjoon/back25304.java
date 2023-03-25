package backjoon;

import java.util.Scanner;

public class back25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total;
		int category;
		int price;
		int num;
		int tmp=0;
		total = sc.nextInt();
		category = sc.nextInt();
		
		for(int i=0; i < category;i++) {
			price = sc.nextInt();
			num = sc.nextInt();
			tmp += (price*num);
		}
		
		if(total == tmp) System.out.println("Yes");
		else System.out.println("No");
		
		
	}

}
