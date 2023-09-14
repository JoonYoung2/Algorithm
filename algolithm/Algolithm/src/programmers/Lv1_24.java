package programmers;

class Try25{
	public String solution(String s) {
        String answer = "";
        char[] a = s.toCharArray();
        for(int i = 0; i < a.length; ++i) {
        	for(int j = i; j < a.length; ++j) {
        		if(a[i] < a[j]) {
        			char tmp = a[i];
        			a[i] = a[j];
        			a[j] = tmp;
        		}
        	}
        	answer += a[i];
        }
        return answer;
    }
}

public class Lv1_24 {
	public static void main(String[] args) {
		Try25 T = new Try25();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(T.solution("Zbcdefg"));
	}
}