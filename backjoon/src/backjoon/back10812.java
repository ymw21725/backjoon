package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class back10812 {

	public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringTokenizer token = new StringTokenizer(br.readLine());
         
         int N = Integer.parseInt(token.nextToken());
         int M = Integer.parseInt(token.nextToken());
		
		int[] firstarr = new int[N];
		int[] secondarr = new int[N];
		
		for(int p=0; p<firstarr.length; p++) {
			firstarr[p] = p+1;
		}
		
		for(int z = 0; z<M; z++) {
			token = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(token.nextToken())-1;
			int j = Integer.parseInt(token.nextToken())-1;
			int k = Integer.parseInt(token.nextToken())-1;
			
			
			int tmp = i;
			
			for(int b = 0; b<j-i+1; b++) {
				if(k+b <= j) {
					secondarr[b+i] = firstarr[k+b];
				} else {
					secondarr[b+i] = firstarr[tmp];
					tmp++;
				} 
			}
			
			for(int c = 0; c<N; c++) {
				if(secondarr[c] != 0) {
					firstarr[c] = secondarr[c];
				}
			}
		
		}
		br.close();
		
		for(int i = 0; i<N;i++) {
			bw.write(firstarr[i]+" ");
		}
		bw.flush();
		bw.close();
	}

}
