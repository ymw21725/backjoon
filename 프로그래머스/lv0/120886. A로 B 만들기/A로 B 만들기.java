import java.util.*;
class Solution {
    public int solution(String before, String after) {
       int answer = 0;
        
        char[] beforeC = before.toCharArray();
        char[] afterC = after.toCharArray();
        
        Arrays.sort(beforeC);
        Arrays.sort(afterC);
        
        String tmp1 = new String(beforeC);
        String tmp2 = new String(afterC);
        
        if(tmp1.equals(tmp2))
            answer = 1;
        else
            answer = 0;
        
        return answer;
    }
}