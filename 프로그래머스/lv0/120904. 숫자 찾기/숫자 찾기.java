class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        String strK = Integer.toString(k);
        
        if(str.indexOf(strK) == -1){
            return -1;
        } else
        
        return str.indexOf(strK)+1;
    }
}