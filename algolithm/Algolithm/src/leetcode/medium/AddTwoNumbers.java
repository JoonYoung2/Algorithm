package leetcode.medium;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        String tmp = getListNumber(l1) + getListNumber(l2) + "";
        String y = "";
        for(int i = tmp.length()-1; i >= 0; --i) {
        	y += tmp.charAt(i);
        }
        int sum = Integer.parseInt(y);
        
        return getResult(sum);
    }
    
    private int getListNumber(ListNode listNumber) {
    	String tmp = "";
    	while(listNumber != null) {
    		tmp += listNumber.val;
    		listNumber = listNumber.next;
    	}
    	return Integer.parseInt(tmp);
    }
    
    private ListNode getResult(int sum) {
    	ListNode result = new ListNode(sum%10);
    	
    	sum /= 10;
    	
    	while(sum != 0) {
    		result = new ListNode(sum%10, result);
    		
    		sum /= 10;
    	}
    	
    	return result;
    }
}

public class AddTwoNumbers {
	public static void main(String[] args) {
		int[] arr1 = {2,4,3,6,0,9,2}, arr2 = {5,6,4,9,3,1,7,3,2};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		ListNode l1 = new ListNode(arr1[0]);
		ListNode l2 = new ListNode(arr2[0]);
		
		for(int i = 1; i < len1; ++i) {
			l1 = new ListNode(arr1[i], l1);
		}
		
		for(int i = 1; i < len2; ++i) {
			l2 = new ListNode(arr2[i], l2);
		}
		AddTwoNumbersSolution solution = new AddTwoNumbersSolution();
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
