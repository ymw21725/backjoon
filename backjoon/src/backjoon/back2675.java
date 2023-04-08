package backjoon;

import java.util.Scanner;

public class back2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		n1 = sc.nextInt();
		for (int z = 0; z < n1; z++) {

			String str;
			n2 = sc.nextInt();
			str = sc.next();

			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < n2; j++) {
					System.out.print(str.charAt(i));
				}

			}
			System.out.println();
		}
	}

}
