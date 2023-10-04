package programmers.level2;

class Try01{
	public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(String x : s.split(" ")) {
        	max = Math.max(max, Integer.parseInt(x));
        	min = Math.min(min, Integer.parseInt(x));
        }
        
        answer = min + " " + max;
        return answer;
    }
}

public class Lv2_01 {
	public static void main(String[] args) {
		Try01 T = new Try01();
		String s = "-1 -2 -3 -4";
		System.out.println(T.solution(s));
	}
}