package programmers.level1;

class Try55{
	public int solution(int n, int m, int[] section) {
        int answer = 0;
        int location = Integer.MIN_VALUE;
        for(int i = 0; i < section.length; ++i) {
        	if(location < section[i]) {
        		location = section[i] + m - 1;
        		++answer;
        	}
        }
        return answer;
    }
}

public class Lv1_55 {
	public static void main(String[] args) {
		Try55 T = new Try55();
		int[] section = {1, 2, 3, 4};
		System.out.println(T.solution(4, 1, section));	
	}
}
