package programmers;

class Try19{
	public int solution(int[] numbers) {
        int answer = 45;
        for(int i = 0; i < numbers.length; i++) {
        	answer -= numbers[i];
        }
        return answer;
    }
}

public class Lv1_19 {
	public static void main(String[] args) {
		Try19 T = new Try19();
		int[] a = {1,2,3,4,6,7,8,0};
		System.out.println(T.solution(a));
	}
}