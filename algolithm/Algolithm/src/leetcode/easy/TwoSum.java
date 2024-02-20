package leetcode.easy;

class TowSumSolution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length-1; ++i) {
        	for(int j = i+1; j < nums.length; ++j) {
        		if(nums[i] + nums[j] == target) {
        			return new int[] {i, j};
        		}
        	}
        }
        return null;
    }
}

public class TwoSum {
	public static void main(String[] args) {
		TowSumSolution solution = new TowSumSolution();
		
		int[] nums = {2,7,11,15}; 
		int target = 9;
		
		for(int x : solution.twoSum(nums, target))
			System.out.print(x + ",");
	}
}
