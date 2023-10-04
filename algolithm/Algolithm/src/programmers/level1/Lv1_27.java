package programmers.level1;

class Try27{
	public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6) {
        	for(int i = 0; i < s.length(); ++i) {
        		String x = ""+s.charAt(i);
        		if(Character.isAlphabetic(s.charAt(i)))
        			return false;
        	}
        }else return false;	
        
        return answer;
    }
}

public class Lv1_27 {
	public static void main(String[] args) {
		Try27 T = new Try27();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(T.solution("1234"));
	}
}