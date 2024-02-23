package leetcode.medium;

class ReverseIntegerSolution {
    public int reverse(int x) {
        int answer = 0;
        while(x != 0) {
        	answer = answer * 10 + x % 10;
        	x /= 10;
        }
        return answer;
    }
}

public class ReverseInteger {
	public static void main(String[] args) {
		ReverseIntegerSolution solution = new ReverseIntegerSolution();
		int x = 123;
		
		System.out.println(solution.reverse(x));
	}
}
