package leetcode.medium;

class ContainerWithMostWaterSolution {
    public int maxArea(int[] height) {
        int answer = 0;
        
        for(int i = 0; i < height.length - 1; ++i) {
        	for(int j = (i+1); j < height.length; ++j) {
        		int high = (height[i]>height[j]) ? height[j] : height[i];
        		int width = j - i;
        		answer = (high * width > answer) ? high * width : answer;
        	}
        }
        
        return answer;
    }
}

public class ContainerWithMostWater {
	public static void main(String[] args) {
		
		ContainerWithMostWaterSolution solution = new ContainerWithMostWaterSolution();
		
		int[] height = {1,8,6,2,5,4,8,3,7};
		int[] height2 = {1,1};
		
		System.out.println(solution.maxArea(height));
		System.out.println(solution.maxArea(height2));
		
	}
}
