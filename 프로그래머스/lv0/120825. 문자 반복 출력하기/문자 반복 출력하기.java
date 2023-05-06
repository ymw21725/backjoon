class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
       
        for(int z=0;z<my_string.length();z++){
            for(int i=0;i<n;i++){
              
                answer+= my_string.charAt(z);
            }
        }
        return answer;
    }
}