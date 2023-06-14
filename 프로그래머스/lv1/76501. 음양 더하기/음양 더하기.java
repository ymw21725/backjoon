class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] tmp = new int[absolutes.length];
        
        for(int i=0;i<tmp.length;i++){
            if(signs[i] == true){
                tmp[i] = absolutes[i];
            }else if(signs[i] == false){
                tmp[i] = -absolutes[i];
            }
            answer+= tmp[i];
        }
        
        
        
        
        return answer;
    }
}