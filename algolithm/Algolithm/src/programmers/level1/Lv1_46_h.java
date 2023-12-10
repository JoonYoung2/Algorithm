package programmers.level1;

// 지문이해하기 힘들어서 정확하게 풀기 어려웠던 문제. 독해력을 기르자

class Try46{
	public int solution(int a, int b, int n) {
        int answer = 0;
        int left = 0;
        while(n / a > 0) {
        	left = n % a;
        	answer += (n/a)*b;
        	n = (n / a) * b + left;
        }
        
//        int answer = 0;
//        while(n/a>0) {
//            answer+=(n/a)*b;
//            n=(n/a)*b+n%a;
//        }
//
//        return answer;
        return answer;
    }
}

public class Lv1_46_h {
	public static void main(String[] args) {
		Try46 T = new Try46();

		System.out.println(T.solution(2, 1, 20));
	}
}
