package backjoon;

import java.util.Scanner;

public class back2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m;
		int tmp;
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(m<45) {
			h--;
			m = 60 - (45 - m);
			if(h<0) {
				h = 23;
			}
			System.out.println(h + " "+ m);
		} else {
			System.out.println(h + " " + (m-45));
		}
		

	}

}
