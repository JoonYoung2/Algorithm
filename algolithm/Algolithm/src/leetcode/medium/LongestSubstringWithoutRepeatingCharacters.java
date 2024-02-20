package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharactersSolution {
    public int lengthOfLongestSubstring(String s) {
    	int answer = 0;
    	Set<Character> set = new HashSet<>();
    	for(int i = 0; i < s.length(); ++i) {
    		int cnt = 0;
    		for(int j = i; j < s.length(); ++j) {
    			if(set.contains(s.charAt(j))) {
    				if(cnt > answer) {
    					answer = cnt;
    					cnt = 0;
    					set.removeAll(set);
    					break;
    				}else {
    					cnt = 0;
    					set.removeAll(set);
    					break;
    				}
    			}else {
    				set.add(s.charAt(j));
    				cnt++;
    				if(j == s.length()-1) {
    					return (cnt > answer) ? cnt : answer;
    				}
    			}
    		}
    	}
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
