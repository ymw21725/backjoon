package backjoon;

import java.util.Scanner;

public class back10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int arr[] = new int[26];
		str = sc.next();
			
		for(int i=0;i<26;i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(arr[ch-'a'] == -1) {
				arr[ch-'a'] = i;
			}
		}
		
		for(int tmp:arr) {
			System.out.print(tmp + " ");
		}
		

	}

}
