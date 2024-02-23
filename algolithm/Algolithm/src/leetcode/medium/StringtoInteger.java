package leetcode.medium;

class StringtoIntegerSolution {
    public int myAtoi(String s) {
        int answer = 0;
        String convert = "";
        s = s.replace(" ", "");
        
        if(s.charAt(0) == '-') {
        	convert += "-";
        	s = s.replace("-", "");
        }
        
        int cnt = 0;
        if(s.length() > 0) {
        	while(s.charAt(cnt) >= '0' && s.charAt(cnt) <= '9') {
        		convert += s.charAt(cnt++);
        		if(cnt == s.length())
        			break;
        	}        	
        }
        
        if(convert.length() > 0) {
        	if(convert.length() == 1 && convert.equals("-"))
        		return answer;
        	answer = Integer.parseInt(convert);
        }
        
        return answer;
    }
}

public class StringtoInteger {
	public static void main(String[] args) {
		StringtoIntegerSolution solution = new StringtoIntegerSolution();
		String s = "42";
		String s1 = "-42";
		String s2 = "    -";
		System.out.println(solution.myAtoi(s));
		System.out.println(solution.myAtoi(s1));
		System.out.println(solution.myAtoi(s2));
	}
}
