import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int length = commands.length;
        
        int[] answer = new int[length];
        
        for(int i=0;i<length;i++){
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            int[] tmp = Arrays.copyOfRange(array,a-1,b);
            
            Arrays.sort(tmp);
            answer[i] = tmp[c-1];
        }
        
        
        return answer;
    }
}