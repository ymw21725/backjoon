import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int result = nums.length/2;
        
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        
        if(result >= set.size()) answer = set.size();
        else answer = result;
       
        
        return answer;
    }
}