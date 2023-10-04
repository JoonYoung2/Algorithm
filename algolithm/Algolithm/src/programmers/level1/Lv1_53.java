package programmers.level1;

class Try53{
	public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; ++i) {
        	for(int j = i+1; j < nums.length - 1; ++j) {
        		for(int k = j+1; k < nums.length; ++k) {
        			int sum = nums[i] + nums[j] + nums[k];
        			int cnt = 0;
        			for(int l = 2; l <= sum/2; ++l) {
        				if(sum % l == 0) {
        					++cnt;
        					break;
        				}
        			}
        			if(cnt == 0)
        				++answer;
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_53 {
	public static void main(String[] args) {
		Try53 T = new Try53();
		int[] nums = {1,2,7,6,4};

		System.out.println(T.solution(nums));	
	}
}
