class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();
        int tmp_p = 0;
        int tmp_y = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p')
                tmp_p++;
            if(s.charAt(i)=='y')
                tmp_y++;
        }
        
        if(tmp_p == tmp_y)
            answer = true;
        else
            answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}