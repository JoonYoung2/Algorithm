package programmers;

class Try14{
	public long solution(int a, int b) {
        long answer = 0;
        if(a > b) {
        	int tmp = a;
        	a = b;
        	b = tmp;
        }
        for(int i = a; i <= b; ++i) {
        	answer += i;
        }
        return answer;
    }
}

public class Lv1_14 {
	public static void main(String[] args) {
		Try14 T = new Try14();
		System.out.println(T.solution(3, 3));
	}
}