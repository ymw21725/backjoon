class Solution {
    public int solution(int balls, int share) {
     
        return fact(balls,share);
    }
    public static int fact(int balls, int share){
        if(balls == share || share == 0) return 1;
        return fact((balls-1),(share-1))+fact(balls-1,share);
    }
   
}