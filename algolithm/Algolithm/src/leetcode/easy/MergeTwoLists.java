package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {
	public static void main(String[] args) {
		MergeTwoListsSolution solution = new MergeTwoListsSolution();
		ListNode list1 = new ListNode(4);
		list1 = new ListNode(2, list1);
		list1 = new ListNode(1, list1);
		
		ListNode list2 = new ListNode(4);
		list2 = new ListNode(3, list2);
		list2 = new ListNode(1, list2);
		
		ListNode answer = solution.mergeTwoLists(list1, list2);
		
		while(true) {
			System.out.println(answer.val);
			if(answer.next != null)
				answer = answer.next;
			else {
				
				break;
			}
			
			
		}
	}
	
	private static class MergeTwoListsSolution {
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        List<Integer> list = new ArrayList<>();
	        boolean first = true;
	        boolean second = true;
	        
	        if(list1 == null)
	        	first = false;
	        if(list2 == null)
	        	second = false;
	        if(!first && !second)
	        	return null;
	        
	        ListNode listNode = new ListNode();
	        
	        while(true) {
	        	int x = 999;
	        	int y = 999;
	        	
	        	if(first) {
	        		x = list1.val;
	        	}
	        	
	        	if(second) {
	        		y = list2.val;
	        	}
	        	
	        	if((x != 999 && y != 999) && (!first && !second)) {
	        		list.add(Math.min(x, y));
	        		list.add(Math.max(x, y));
	        		break;
	        	}else if(x <= y) {
	        		list.add(x);
	        		if(list1.next == null) {
	        			first = !first;
	        		}else
	        			list1 = list1.next;
	        	}else {
	        		list.add(y);
	        		if(list2.next == null) {
	        			second = !second;
	        		}else
	        			list2 = list2.next;
	        	}
	        	
	        	if(!first && !second)
	        		break;
	        }
	        for(int i = list.size() - 1; i >= 0; --i) {
	        	if(i == list.size() - 1)
	        		listNode.val = list.get(i);
	        	else 
	        		listNode = new ListNode(list.get(i), listNode);
	        }
	        return listNode;
	    }
	}
	
	private static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
