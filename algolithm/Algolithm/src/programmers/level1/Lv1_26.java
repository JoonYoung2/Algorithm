package programmers.level1;

class Try26{
	public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = (long)price;
        for(int i = 1; i <= count; ++i) {
        	if(i > 1) {
        		sum += (long)price * (long)i; 
        	}
        }
        if(sum < money) {
        	return 0;
        }
        answer = sum - money;
        return answer;
    }
}

public class Lv1_26 {
	public static void main(String[] args) {
		Try26 T = new Try26();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(T.solution(2500, 1, 2500));
	}
}