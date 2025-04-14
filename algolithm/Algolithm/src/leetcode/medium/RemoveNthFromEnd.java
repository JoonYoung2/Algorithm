package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthFromEnd {
	public static void main(String[] args) {
		RemoveNthFromEndSolution solution = new RemoveNthFromEndSolution();
		ListNode listNode = new ListNode(2);
		listNode = new ListNode(1, listNode);
//		listNode = new ListNode(3, listNode);
//		listNode = new ListNode(2, listNode);
//		listNode = new ListNode(1, listNode);

		ListNode answerNode = solution.removeNthFromEnd(listNode, 1);
		
		while(true) {
			if(answerNode == null)
				break;
			System.out.println(answerNode.val);
			answerNode = answerNode.next;
			if(answerNode.next == null) {
				System.out.println(answerNode.val);
				break;
			}
		}
	}
	
	private static class RemoveNthFromEndSolution {
		public ListNode removeNthFromEnd(ListNode head, int n) {
			List<Integer> list = new ArrayList<Integer>();
			int count = 0;
			ListNode listNode = new ListNode();
			while(true) {
				if(head.next == null) {
					list.add(head.val);
					break;
				}
				
				list.add(head.val);
				head = head.next;
			}
			
			if(list.size() == 1)
				return null;
			
			for(int i = list.size() - 1; i >= 0; --i) {
				if(++count == n)
					continue;
				if(i == list.size() - 1)
					listNode = new ListNode(list.get(i));
				else if(n == 1 && count == 2) {
					listNode = new ListNode(list.get(i));
				}else
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
