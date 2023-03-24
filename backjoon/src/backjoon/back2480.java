package backjoon;

import java.util.Scanner;

public class back2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1,d2,d3;
		int max = 0;
		
		d1=sc.nextInt();
		d2=sc.nextInt();
		d3=sc.nextInt();
		
		if(d1 != d2 && d2 != d3 && d1 != d3) {
			if(d1>d2) {
				if(d3>d1) {
					max = d3;
				} else {
					max = d1;
				}
			}
			
			else {
				if(d3>d2) {
					max = d3;
				} else {
					max = d2;
				}
			}
			System.out.println(max*100);
		}
		
		else {
			if(d1==d2 && d1==d3) {
				System.out.println(10000+d1*1000);
			} else {
				if(d1==d2 || d1 == d3) {
					System.out.println(1000+d1*100);
				} else {
					System.out.println(1000+d2*100);
				}
			}
		}

	}

}
