class Solution {
    public int solution(int n) {
       int cnt = 0;
        
       if(n%7 == 0){
           cnt = n/7;
       } else {
           cnt = n/7+1;
       }
        
        return cnt;
    }
}