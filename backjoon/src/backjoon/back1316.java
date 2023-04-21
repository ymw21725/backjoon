package backjoon;

import java.util.Scanner;

public class back1316 {
	static Scanner sc = new Scanner(System.in);
	
	public static boolean check() {
		boolean[] check = new boolean[26];
		int back = 0;
		String str = sc.next();
		
		for(int i=0;i<str.length();i++) {
			int now = str.charAt(i);
			
			if(back != now) {
				if(check[now-'a'] == false) {
					check[now-'a'] = true;
					back = now;
				}
				
				else {
					return false;
				}
			}
			
			else {
				continue;
			}
			
		}
		
		
		return true;
		
	}

	public static void main(String[] args) {
		int num = sc.nextInt();
		int cnt=0;
		
		for(int i=0; i<num;i++) {
			if(check()==true) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	

}
