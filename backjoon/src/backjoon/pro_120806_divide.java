package backjoon;

public class pro_120806_divide {
	public int solution(int num1, int num2) {
        int answer = 0;
        
        if(num1>0 && num1 <=100 && num2>0 && num2<=100){
            float num3 = (float)num1/num2 * 1000;
            answer = (int)num3;
        }
        
        
        return answer;
    }
}
