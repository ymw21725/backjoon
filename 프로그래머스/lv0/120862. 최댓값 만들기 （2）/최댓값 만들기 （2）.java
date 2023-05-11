import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
       
        int low,high;
        
        Arrays.sort(numbers);
      
        low = numbers[0] * numbers[1];
       
            high = numbers[numbers.length-1] * numbers[numbers.length-2];
       answer = Math.max(low,high);
        return answer;
    }
}