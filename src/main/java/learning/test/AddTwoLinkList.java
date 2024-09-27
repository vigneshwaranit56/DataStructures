package learning.test;

public class
AddTwoLinkList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode l1Prev = null;
		ListNode l2Prev = null;

		while (l1 != null || l2 != null) {
			if (l1 != null) {

				ListNode l1Temp = new ListNode(l1.val);
				l1Temp.next = l1Prev;
				l1Prev = l1Temp;

				l1 = l1.next;

			} else if (l2 != null) {
				ListNode l2Temp = new ListNode(l2.val);
				l2Temp.next = l2Prev;
				l2Prev = l2Temp;

				l2 = l2.next;
			}
		}

		ListNode result = null;
		int quotient = 0;

		while (l1Prev != null || l2Prev != null) {

			int addition = 0 + quotient;

			if (l1Prev != null) {
				addition += l1Prev.val;

			}
			if (l2Prev != null) {
				addition += l2Prev.val;
			}

			if (addition > 9) {
				int remainder = addition % 10;
				quotient = addition / 10;
				addition = remainder;

			} else {
				quotient = 0;
			}

			result = new ListNode(addition, result);

			if (l1Prev.next != null)

				l1Prev = l1Prev.next;

			if (l2Prev.next != null)
				l2Prev = l2Prev.next;

		}

		l1Prev = null;

		while (result != null) {
			l1Prev = new ListNode(result.val, l1Prev);

			result = result.next;
		}

		return l1Prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	 public ListNode addTwoNumbersV1(ListNode l1Prev, ListNode l2Prev) {


			
			ListNode result = new ListNode(0);
	        ListNode curr = result;
			
	        int quotient = 0;

			while (l1Prev != null || l2Prev != null) {
				
	                
	                int a = (l1Prev != null) ? l1Prev.val : 0 ;
	                int b = (l2Prev != null) ? l2Prev.val : 0;

			        int addition =  quotient + a+b;


			
					int remainder = addition % 10;
					quotient = addition / 10;
					addition = remainder;

				
	            curr.next= new ListNode(addition);
				curr = curr.next;

				if (l1Prev != null)

					l1Prev = l1Prev.next;

				if (l2Prev != null)
					l2Prev = l2Prev.next;

			}
			
	        if(quotient>0){
	            curr.next = new ListNode(quotient);
	        }

			return result.next;
		}
}
