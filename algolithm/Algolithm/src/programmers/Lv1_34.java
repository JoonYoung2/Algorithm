package programmers;

class Try34{
	public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
        for(int i = 0; i < a.length; ++i) {
        	for(int j = 0; j < a[i].length(); ++j) {
        		if(j % 2 == 0 && Character.isAlphabetic(a[i].charAt(j)))
        			answer += ("" + a[i].charAt(j)).toUpperCase();
        		else if(j % 2 == 1 && Character.isAlphabetic(a[i].charAt(j)))
        			answer += ("" + a[i].charAt(j)).toLowerCase();
        		else
        			answer += "" + a[i].charAt(j);
        	}
        	if(i == a.length - 1) break;
        	answer += " ";
        }
        int x = 1;
        while(true) {
        	if(s.charAt(s.length()-x) == ' ') {
        		answer += " ";
        	}else {
        		break;
        	}
        	x++;
        }
        return answer;
    }
}

public class Lv1_34 {
	public static void main(String[] args) {
		Try34 T = new Try34();
		int[] a = {2,2,3,3};
		
//		for(int x : )
		System.out.println(T.solution("  asdfsa aqwerqwrqw   a!@#$QWE aqwer  "));
	}
}