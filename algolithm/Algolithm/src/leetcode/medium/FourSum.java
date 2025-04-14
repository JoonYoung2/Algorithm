package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {
		FourSumSolution solution = new FourSumSolution();
		
		// output = [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
		int[] nums = {1,0,-1,0,-2,2};
		int target = 0;
		
		// output = [[2,2,2,2]]
		int[] nums2 = {2,2,2,2,2};
		int target2 = 8;
		
		System.out.println("================================================");
		for(List x : solution.fourSum(nums, target)) {
			for(int i = 0; i < x.size(); ++i) {
				if(i == x.size() - 1) 
					System.out.println(x);
				else
					System.out.print(x.get(i) + ",");
			}
		}
		System.out.println("================================================");
		for(List x : solution.fourSum(nums2, target2)) {
			for(int i = 0; i < x.size(); ++i) {
				if(i == x.size() - 1) 
					System.out.println(x);
				else
					System.out.print(x.get(i) + ",");
			}
		}
	}
	
	private static class FourSumSolution {
		public List<List<Integer>> fourSum(int[] nums, int target) {
			List<List<Integer>> answer = new ArrayList<>();
			nums = numsSort(nums);
			for(int i = 0; i < nums.length - 4; ++i) {
				int sum = nums[i];
				int count = 1;
				List<Integer> list = new ArrayList<>();
				list.add(sum);
				for(int j = i + 1; j < nums.length; ++j) {
					
				}
			}
	        return answer;
	    }
		
		public int[] numsSort(int[] nums) {
			for(int i = 0; i < nums.length - 1; ++i) {
				for(int j = i + 1; j < nums.length; ++j) {
					if(nums[j] < nums[i]) {
						int tmp = nums[i];
						nums[i] = nums[j];
						nums[j] = tmp;
					}
				}
			}
			return nums;
		}
	}
}
