package programmers;

class Try08{
	public int[] solution(long n) {
		String length = ""+n;
		System.out.println(length);
        int[] answer = new int[length.length()];
        for(int i = 0; i < length.length(); ++i) {
        	answer[i] = (int)(n % 10);
        	n /= 10;
        }
        return answer;
    }
}

public class Lv1_08 {
	public static void main(String[] args) {
		Try08 T = new Try08();
		long e = 10000000000L;
		for(int x : T.solution(e)) System.out.println(x);
	}
}