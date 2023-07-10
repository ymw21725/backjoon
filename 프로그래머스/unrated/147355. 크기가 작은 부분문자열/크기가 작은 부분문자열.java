class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int cnt = t.length()-p.length()+1;
        String[] arr = new String[cnt];
        
        for(int i=0;i<cnt;i++){
            arr[i] = t.substring(i,p.length()+i);
            if(Long.parseLong(arr[i]) <= Long.parseLong(p)){
                answer++;
            }
        }
        
        
        
        
        return answer;
    }
}