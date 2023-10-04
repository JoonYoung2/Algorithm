package programmers.level1;

class Try09{
	public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}

public class Lv1_09 {
	public static void main(String[] args) {
		Try09 T = new Try09();
		System.out.println(T.solution("-1234"));
	}
}