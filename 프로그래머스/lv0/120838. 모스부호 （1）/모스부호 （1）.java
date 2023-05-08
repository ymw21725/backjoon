class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse_list = { 
    ".-","-...","-.-.","-..",".","..-.",
    "--.","....","..",".---","-.-",".-..",
    "--","-.","---",".--.","--.-",".-.",
    "...","-","..-","...-",".--","-..-",
    "-.--","--.."
            };
        String[] morse;
        morse = letter.split(" ");
        
        for(String s : morse){
            for(int i=0;i<morse_list.length;i++){
                if(s.equals(morse_list[i])){
                    answer += Character.toString(i+'a');
                }
            }
        }
        
        return answer;
    }
}