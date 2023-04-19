package backjoon;


import java.util.Scanner;

public class back1157 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String sb = sc.next().toUpperCase();
        int[] arr = new int[26];
        
       for(int i=0;i<sb.length();i++) {
    	   int num = sb.charAt(i)-'A';
    	   arr[num]++;
       }
       
       int max = 0;
       char tmp = '?';
       
       for(int i=0; i<arr.length;i++) {
    	   if(max<arr[i]) {
    		   max = arr[i];
    		   tmp = (char)(i+'A');
    	   } else if(max==arr[i]){
    		   tmp = '?';
    	   }
       }
       
       System.out.println(tmp);

	}

}
