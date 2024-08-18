package leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		// result {0,9}
//		String s = "barfoothefoobarman";
//		String[] words = {"foo","bar"};
		
		// result {}
		String s1 = "a";
		String[] words1 = {"a"};
		
		// result {6,9,12}
//		String s2 = "barfoofoobarthefoobarman";
//		String[] words2 = {"bar","foo","the"};
		
//		for(int x : solution.findSubstring(s, words)) System.out.print(x+",");
//		System.out.println();
		for(int x : solution.findSubstring(s1, words1)) System.out.print(x+",");
		System.out.println();
//		for(int x : solution.findSubstring(s2, words2)) System.out.print(x+",");
//		System.out.println();
	}
	
	private static class Solution {
	    public List<Integer> findSubstring(String s, String[] words) {
	    	List<Integer> answer = new ArrayList<>();
	    	if(s.replace(s.charAt(0)+"", "").length() == 0) {
	    		Arrays.sort(words);
	    		if(words[0].equals(words[words.length-1])) {
	    			for(int i = 0; i < s.length() - (words.length * words[0].length()-1); ++i) {
	    				answer.add(i);
	    			}
	    			return answer;
	    		}
	    		
	    	}
	    	
	    	int lt = 0, rt = 0, cnt = 0, ltCheck = -1;
	    	int[] check = new int[words.length];
	    	
	    	while(rt != s.length()) {
	    		boolean isPass = false;
	    		if(cnt == words.length) {
	    			answer.add(lt);
	    			check = new int[words.length];
	    			cnt = 0;
	    			rt = ++lt;
	    		}
	    		for(int i = 0; i < words.length; ++i) {
	    			if(words[i].length() + rt > s.length()) continue;
	    			if(words[i].equals(s.substring(rt, words[i].length() + rt)) && check[i] == 0) {
	    				check[i] = 1;
	    				cnt++;
	    				rt += words[i].length();
	    				isPass = true;
	    				break;
	    			}
	    		}
	    		
	    		if(isPass)
	    			isPass = false;
	    		else {
	    			++lt;
	    			if(ltCheck != lt) {
	    				rt = lt;
	    				check = new int[words.length];
	    				cnt = 0;
	    				ltCheck = lt;
	    			}else {
	    				rt++;
	    				lt = rt;
	    				cnt = 0;
	    				check = new int[words.length];
	    			}
	    		}
	    		
	    		if(rt == s.length() && cnt == words.length) answer.add(lt);
	    	}
	    	
	        return answer;
	    }
	}
}
