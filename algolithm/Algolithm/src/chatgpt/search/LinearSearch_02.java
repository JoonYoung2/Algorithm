package chatgpt.search;

/*
	이를 확장하여 모든 인덱스를 반환하도록 하세요.
	탐색이 없을 때 디버깅용 메시지 추가
	
	값이 없는 경우 "Target not found."를 명시적으로 출력하는 조건을 추가해보세요.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch_02 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {10,20,30,40,50,30};
		int target = 30;
		
		List<Integer> indexList = solution.getTargetIndex(nums, target);
		
		if(indexList.size() > 0) {
			System.out.println(indexList);			
		}else
			System.out.println("Target not found.");
	}
	
	private static class Solution {
	    public List<Integer> getTargetIndex(int[] nums, int target) {
	    	List<Integer> indexList = new ArrayList<>();
	        for(int i = 0; i < nums.length; ++i) {
	        	if(nums[i] == target) {
	        		indexList.add(i);
	        	}
	        }
	    	return indexList;
	    }
	}
}
