package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSum {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		// result = [[-1,-1,2],[-1,0,1]]
		int[] nums = {-1,0,1,2,-1,-4};
		
		// result = []
		int[] nums2 = {0,1,1};
		
		// result = [[0,0,0]]
		int[] nums3 = {0,0,0};
		
		for(List<Integer> list : solution.threeSum(nums)) {
			for(Integer num : list) {
				System.out.print(num + ",");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(List<Integer> list : solution.threeSum(nums2)) {
			for(Integer num : list) {
				System.out.print(num + ",");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(List<Integer> list : solution.threeSum(nums3)) {
			for(Integer num : list) {
				System.out.print(num + ",");
			}
			System.out.println();
		}
	}
	
	private static class Solution {
		public List<List<Integer>> threeSum(int[] nums) {
			List<List<Integer>> resultList = new ArrayList<List<Integer>>();
			Set<String> set = new TreeSet<>();
			Arrays.sort(nums);
			
			for(int i = 0; i < nums.length-2; ++i) {
				if(nums[i] + nums[i+1] > 0) return resultList;
				for(int j = i+1; j < nums.length-1; ++j) {
					int sum = nums[i] + nums[j];
					Integer tmp = getNum(sum, j+1, nums);
					if(tmp != null && !set.contains(nums[i] + "" + nums[j] + "" + tmp)) {
						set.add(nums[i] + "" + nums[j] + "" + tmp);
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(tmp);
						
						resultList.add(list);
					}
				}
			}
			return resultList;
	    }
		private Integer getNum(int sum, int start, int[] nums) {
			int end = nums.length - 1;
			int mid = (start + end) / 2;
			
			while(start < end) {
				if(nums[start] + sum > 0 || nums[end] + sum < 0) return null;
				if(sum + nums[mid] == 0) {
					return nums[mid];
				}
				
				if(sum + nums[mid] > 0) {
					end = mid-1;
				}else {
					start = mid+1;
				}
				
				mid = (start + end) / 2;
			}
			if(sum + nums[start] == 0) {
				return nums[start];
			}
			return null;
		}
	}
}
