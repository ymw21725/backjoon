package backjoon;

import java.util.Scanner;

public class back2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean[][] arr = new boolean[101][101];
		int cnt=0;
		for(int i=0;i<n;i++) {
			int left = sc.nextInt();
			int bot = sc.nextInt();
			
			for(int z=left;z<left+10;z++) {
				for(int y = bot;y<bot+10;y++) {
					if(!arr[z][y]) {
						arr[z][y] = true;
						cnt++;
					}
				}
			}
			
			
		}
		System.out.println(cnt);
	}

}
