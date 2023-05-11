import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            if(!sb.toString().contains(String.valueOf(arr[i])))
                sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}