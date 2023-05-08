import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        String tmp = Integer.toString(age);
        String[] arr = tmp.split("");
        for(int i=0;i<tmp.length();i++){
            answer += (char)((char)tmp.charAt(i)+49);
        }
        
      
        return answer;
    }
}