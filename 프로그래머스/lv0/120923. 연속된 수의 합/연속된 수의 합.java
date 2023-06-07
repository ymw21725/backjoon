class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int tmp = 0;
        int tmp2 = 0;
        int cnt = 0;
        
        for(int i=1;i<=num;i++){
             tmp += i;
             
        }
        
        tmp2 = total - tmp;
        tmp2 = tmp2/num;
        for(int i=0;i<num;i++){
            answer[i] = tmp2+i+1;
        }
        
        
        return answer;
    }
}