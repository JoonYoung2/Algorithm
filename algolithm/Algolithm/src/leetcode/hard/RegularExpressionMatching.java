package leetcode.hard;

class RegularExpressionMatchingSolution{
	public boolean isMatch(String s, String p) {
		
		return true;
    }
}

public class RegularExpressionMatching {
	public static void main(String[] args) {
		RegularExpressionMatchingSolution solution = new RegularExpressionMatchingSolution();
		
		String[] s = new String[] {"aa","aa","ab"}, p = new String[]{"a","a*",".*"};
		
		for(int i = 0; i < s.length; ++i) 
			System.out.println(solution.isMatch(s[i], p[i]));
	}
}
