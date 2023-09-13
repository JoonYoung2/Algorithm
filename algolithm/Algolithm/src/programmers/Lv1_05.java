package programmers;

class Try05{
	public int solution(int n) {
        int answer = 0;
        while(n > 0) {
        	answer += n % 10;
        	n /= 10;
        }
        return answer;
    }
}

public class Lv1_05 {
	public static void main(String[] args) {
		Try05 T = new Try05();
		int arr = 987;
		System.out.println(T.solution(arr));
	}
}
