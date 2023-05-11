import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char c : my_string.toCharArray()){
           if(c>=97 && c<=122){
               answer += (char)(c-32);
           }else {
               answer += (char)(c+32);
           }
        }
        
        return answer;
    }
}