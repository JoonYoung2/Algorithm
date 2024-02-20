package leetcode.hard;

import java.util.Arrays;

class MedianOfTwoSortedArraysSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer = 0;
        
        int totalLength = nums1.length + nums2.length;
        int halfLength = totalLength/2;
        int[] nums = new int[totalLength];
        
        int index = 0;
        for(int num : nums1)
        	nums[index++] = num;
        for(int num : nums2)
        	nums[index++] = num;
        
        Arrays.sort(nums);
        
        answer = (totalLength % 2 == 0) ? ((double)nums[halfLength] + nums[halfLength-1])/2 : nums[halfLength];
        
        return answer;
    }
}

public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		MedianOfTwoSortedArraysSolution solution = new MedianOfTwoSortedArraysSolution();
		
		// answer == 2.00000
		int[] nums1 = new int[] {1,3};
		int[] nums2 = new int[] {2};
		
		
		//answer == 2.50000
//		int[] nums1 = new int[] {1,2};
//		int[] nums2 = new int[] {3,4};
		
		System.out.println(solution.findMedianSortedArrays(nums1, nums2));
	}
}
