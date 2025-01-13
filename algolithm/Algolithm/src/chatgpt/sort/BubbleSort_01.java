package chatgpt.sort;
/* 
	입력 배열을 변경하며 결과를 확인해보세요.
		입력 배열: [7,1,5,2,4]
	도전 과제:
		버블 정렬을 내림차순으로 정렬하도록 수정해 보세요.
 */

public class BubbleSort_01 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {7,1,5,2,4};
		
		for(int x : solution.bubbleSortDescending(nums)) System.out.print(x + "\t");
	}
	
	private static class Solution {
	    public int[] bubbleSortDescending(int[] nums) {
	        for(int i = 0; i < nums.length - 1; ++i) {
	        	boolean changeCheck = false;
	        	for(int j = 0; j < nums.length - 1 - i; ++j) {
	        		if(nums[j] < nums[j+1]) {
	        			int tmp = nums[j];
	        			nums[j] = nums[j+1];
	        			nums[j+1] = tmp;
	        			changeCheck = true;
	        		}
	        	}
	        	if(!changeCheck) break;
	        }
	    	return nums;
	    }
	}
}
