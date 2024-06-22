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
        
    	long val1 = getValue(l1);
    	long val2 = getValue(l2);
    	
        long sumVal = val1 + val2;
        System.out.println(sumVal);
        ListNode result = setListNode(sumVal);
        while(true) {
        	System.out.print(result.val);
        	if(result.next == null)
        		break;
        	
        	result = result.next;
        }
        return result;
    }
    
    private long getValue(ListNode listNode) {
    	
    	if(listNode.next == null) {
    		return listNode.val;
    	}
    	
    	return getValue(listNode.next) * 10 + listNode.val;
    }
    
    private ListNode setListNode(long sumVal) {
    	if(sumVal / 10 == 0) {
    		return new ListNode((int)sumVal);
    	}
    	ListNode listNode = new ListNode((int)(sumVal % 10), setListNode(sumVal/10));
    	return listNode;
    }
}

public class AddTwoNumbers {
	public static void main(String[] args) {
		AddTwoNumbersSolution solution = new AddTwoNumbersSolution();
		
		ListNode l1 = new ListNode(9);
//		l1 = new ListNode(4, l1);
//		l1 = new ListNode(2, l1);
		
		ListNode l2 = new ListNode(9);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(1, l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		
		while(true) {
			
			if(result.next == null)
				break;
			
			result = result.next;
		}
	}
}
