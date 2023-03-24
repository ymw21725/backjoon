package backjoon;

import java.util.Scanner;

public class back2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h,m,tmp;
		int zz;
		h = sc.nextInt();
		m = sc.nextInt();
		System.out.println();
		tmp = sc.nextInt();
		
		zz = 60 * h + m;
		zz +=tmp;
		
		int hour = (zz/60)%24;
		int minute = zz%60;
			
		System.out.println(hour + " " + minute);
		
		
	}

}
