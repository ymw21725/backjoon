package backjoon;

public class pro_120808_boonsuAdder {
	class Solution {
	    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        int[] answer = {0,0};
	        
	        int up = denom1 * numer2 + numer1 * denom2;
	        int down = denom1 * denom2;
	        
	        int tmp = 1;
	        
	        for(int i = 1; i<=up && i<=down; i++){
	            if(down%i==0 && up%i==0){
	                tmp = i;
	            }
	        }
	       answer[0] = up/tmp;
	        answer[1] = down/tmp;
	        
	        return answer;
	    }
	}

}
