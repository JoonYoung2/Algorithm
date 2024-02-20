package leetcode.medium;

class LongestPalindromicSubstringSolution {
    public String longestPalindrome(String s) {
        String answer = "";
        int length = s.length();
        int cnt = 1;
        while(true) {
        	for(int i = 0; i < cnt; ++i) {
        		answer = s.substring(i, length+i);
        		if(palindromicCheck(s.substring(i, length+i)))
        			return answer;
        	}
        	length--;
        	cnt++;
        	if(length == 1)
        		break;
        }
        
        return answer.charAt(0)+"";
    }
    
    private boolean palindromicCheck(String s) {
    	boolean check = true;
    	int start = 0;
    	int end = s.length()-1;
    	
    	while(start < end){
    		
    		if(s.charAt(start) != s.charAt(end))
    			return false;
    		
    		start++;
    		end--;
    		
    	}
    	return check;
    }
}

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		LongestPalindromicSubstringSolution solution = new LongestPalindromicSubstringSolution();
		//answer = bab or aba
//		String s = "babad";
		
		//answer = bb
//		String s = "cbbd";
		
		String s = "sdfgmkoeiurtyqlss";
		
		System.out.println(solution.longestPalindrome(s));
	}
}
