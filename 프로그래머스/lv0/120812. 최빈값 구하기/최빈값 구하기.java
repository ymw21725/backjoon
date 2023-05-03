

class Solution {
    public int solution(int[] array) {
       
        int answer = 0;
        int arr_max = 0;
        
        for(int i=0;i<array.length;i++){
            if(array[i] >arr_max){
                arr_max = array[i];
            }
        }
        
        int[] cnt = new int[arr_max +1];
        int max = 0;
        
        int n = 0;
        int mode = 0;
        
        for(int i=0;i<array.length;i++){
            cnt[array[i]]++;
        }
        
        for(int i=0;i<cnt.length;i++){
            if(cnt[i] > max){
                max = cnt[i];
                answer = i;
            }
        }
        
        for(int i=0;i<cnt.length;i++){
            mode++;
            
            if(cnt[i] == max){
                n++;
            }
        }
        
        if(n>1) answer = -1;
        return answer;
    }
}