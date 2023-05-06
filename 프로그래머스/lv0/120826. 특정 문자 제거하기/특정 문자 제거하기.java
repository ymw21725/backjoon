class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String tmp = "";
        
        for(char c : letter.toCharArray()){
            answer = my_string.replace(String.valueOf(c),"");
        }
        
        return answer;
    }
}