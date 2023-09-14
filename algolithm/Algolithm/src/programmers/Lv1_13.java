package programmers;

class Try13{
	public boolean solution(int x) {
        boolean answer = true;
        String c = "" + x;
        int num = 0;
        int x2 = x;
        for(int i = 0; i < c.length(); ++i) {
        	num += x2 % 10;
        	x2 /= 10;
        }
        
        if(x % num != 0)
        	answer = false;
        return answer;
    }
}

public class Lv1_13 {
	public static void main(String[] args) {
		Try13 T = new Try13();
		System.out.println(T.solution(12));
	}
}