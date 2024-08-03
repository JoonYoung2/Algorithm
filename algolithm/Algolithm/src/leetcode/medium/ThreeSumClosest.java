package leetcode.medium;

public class ThreeSumClosest {
	public static void main(String[] args) {
		Solution solution = new Solution();
		// result == 2
		int[] nums = {-1,2,1,-4};
		int target = 1;
		
		// result == 0
		int[] nums2 = {0,0,0};
		int target2 = 1;
				
		System.out.println(solution.threeSumClosest(nums, target));
		System.out.println(solution.threeSumClosest(nums2, target2));
	}
	
private static class Solution {
	public int threeSumClosest(int[] nums, int target) {
		int resultSum = 0;
		int closestValue = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length-2; ++i) {
			for(int j = i+1; j < nums.length-1; ++j) {
				for(int k = j+1; k < nums.length; ++k) {
					int sum = nums[i] + nums[j] + nums[k];

					int value = (sum > target) ? sum-target : target - sum;
					if(value < closestValue) {
						closestValue = value;
						resultSum = sum;
					}
					if(closestValue == 0) return resultSum;
				}
			}
		}
        return resultSum;
    }
}
}
