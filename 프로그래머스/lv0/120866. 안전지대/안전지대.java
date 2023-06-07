class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int[][] tmpboard = new int[board.length][board.length];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == 1){
                    mine(i,j,tmpboard);
                }
            }
        }
        
        answer = countmine(tmpboard);
        
        return answer;
    }



void mine(int i, int j, int[][] tmpboard){
    int overX = tmpboard.length;
    int overY = tmpboard[0].length;

    tmpboard[i][j] = 1;
    if(i > 0) tmpboard[i-1][j] =1;
    if(i < overX-1) tmpboard[i+1][j] =1;
    if(j < overY-1) tmpboard[i][j+1] =1;
    if(j > 0) tmpboard[i][j-1] =1;
    if(i > 0 && j>0) tmpboard[i-1][j-1] =1;
    if(i < overX-1 && j>0) tmpboard[i+1][j-1] =1;
    if(i > 0 && j<overY-1) tmpboard[i-1][j+1] =1;
    if(i < overX-1 && j<overY-1) tmpboard[i+1][j+1] =1;
}

int countmine(int[][] board){
    int count =0 ;
        for(int i=0 ; i< board.length; i++){
            for(int j=0 ; j< board[i].length; j++){
                   if(board[i][j]==0){
                        count++;
                 }            
            }
        }
        return count;
}
}


