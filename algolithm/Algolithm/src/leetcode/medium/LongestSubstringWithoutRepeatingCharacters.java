package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharactersSolution {
    public int lengthOfLongestSubstring(String s) {
    	int answer = 0;
    	int cnt = 0;
    	int lt = 0, rt = 0;
    	
    	Set<Character> set = new HashSet<>();
    	
    	char[] c = s.toCharArray();
    	
    	for(int i = 0; i < c.length; ++i) {
    		if(set.contains(c[rt])) {
    			answer = Math.max(answer, set.size());
    			while(c[rt] != c[lt]) {
    				set.remove(c[lt++]);
    			}
    			lt++;
    			rt++;
    		}else {
    			set.add(c[rt]);
    			rt++;
    		}
    	}
    	answer = Math.max(answer, set.size());
        return answer;
    }
}

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharactersSolution solution = new LongestSubstringWithoutRepeatingCharactersSolution();
		String s = "abcabcbb"; 	// result 3
		String s1 = "bbbbb";	// result 1
		String s2 = "pwwkew";	// result 3
		String s3 = "asjhiahaivnsdjkafhuiwhauifwfwvnjiasifhaihfiwaehfiuhifhwefaddfafasfsafdasdfdsafsdfwiuhuihihfhiwfiqwertyuiopasdfghjklzxcvbnm";
		
		System.out.println(solution.lengthOfLongestSubstring(s3));
	}
}
