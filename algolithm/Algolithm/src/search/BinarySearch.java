package search;

class BinaryImpl{
	public int solution(int[] arr, int target) {
		int answer = -1;
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			
			if(arr[mid] == target)
				return mid;
			
			if(arr[mid] < target) 
				left = mid + 1;
			else 
				right = mid - 1;
		}
		
		return answer;
	}
}

public class BinarySearch {
	public static void main(String[] args) {
		BinaryImpl search = new BinaryImpl();
		int[] arr = {2, 5, 9};
		int target = 9;
		
		int result = search.solution(arr, target);
		if(result != -1)
			System.out.println("index num : " + result);
		else
			System.out.println("index num : null");
	}
}
