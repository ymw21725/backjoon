import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                list.add(i);
                if(n/i != i)
                    list.add(n/i);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).sorted().toArray();
        
        return answer;
    }
}