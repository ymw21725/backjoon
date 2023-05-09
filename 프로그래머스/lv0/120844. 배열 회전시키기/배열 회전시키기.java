class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int ltmp = numbers[0];
        int rtmp = numbers[numbers.length-1];
        
        if(direction.equals("left")){
            for(int i=1;i<=numbers.length-1;i++){
                answer[i-1] = numbers[i];
            } 
            answer[numbers.length-1] = ltmp;
        }
        
        if(direction.equals("right")){
           for(int i=numbers.length-1;i>=1;i--){
               answer[i] = numbers[i-1];
           }
            answer[0] = rtmp;
        }
        return answer;
    }
}