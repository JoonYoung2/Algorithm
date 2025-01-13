package chatgpt.search;

import java.util.Arrays;

/*
 선형 탐색 문제
	배열 [10,20,30,40,50]에서 값 30의 인덱스를 찾으세요.
*/

public class LinearSearch_01 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {10,20,30,40,50};
		int target = 30;
		
		System.out.println(solution.getTargetIndex(nums, target));
	}
	
	private static class Solution {
	    public int getTargetIndex(int[] nums, int target) {
	        for(int i = 0; i < nums.length; ++i) {
	        	if(nums[i] == target) return i;
	        }
	    	return -1;
	    }
	}
}
