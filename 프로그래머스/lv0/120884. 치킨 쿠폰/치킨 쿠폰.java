class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int tmp = 0;
        
        while(chicken>=10){
            int coupon = chicken % 10;
            tmp += chicken/10;
            chicken = coupon + chicken/10;
        }
        
        return tmp;
    }
}