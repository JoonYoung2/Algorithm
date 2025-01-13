package chatgpt.search;

/*
	정렬된 배열 [2,4,6,8,10]에서 값 8의 인덱스를 찾으세요.
 */

public class BinarySearch_01 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {2,4,6,8,10};
		int target = 8;
		
		System.out.println(solution.getTargetIndex(nums, target));
	}
	
	private static class Solution {
	    public int getTargetIndex(int[] nums, int target) {
	    	int start = 0;;
	    	int end = nums.length - 1;
	    	
	    	while(start <= end) {
	    		int mid = (start + end) / 2;
	    		if(nums[mid] == target)
	    			return mid;
	    		else if(nums[mid] < target) 
	    			start = mid + 1;
	    		else
	    			end = mid - 1;
	    	}
	    	
	    	return -1;
	    }
	}
}
