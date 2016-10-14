

public class PartitionList {
	
	
	public static void main(String[] args)
	{
		ListNode head = new ListNode(1);		//creating list with nodes
		ListNode n1 = new ListNode(4);
		head.next = n1;
		ListNode n2 = new ListNode(3);
		n1.next = n2;
		ListNode n3 = new ListNode(2);
		n2.next = n3;
		ListNode n4 = new ListNode(5);
		n3.next = n4;
		ListNode n5 = new ListNode(2);
		n4.next = n5;
		
		
		
		
		ListNode dummies = head;    				// create dummy node
		
		while(dummies!=null)						//printing list before change
		{
			System.out.print(dummies.val+"=>");
			dummies = dummies.next;
		}
		
		ListNode dummie = partition(head,3);  		//calling function
		
		
		System.out.println();
		
		while(dummie!=null)							//printing list after change
		{
			System.out.print(dummie.val+"=>");
			dummie = dummie.next;
		}

	}
	

	 public static ListNode partition(ListNode head, int x) {
	     
		  ListNode dummy1 = new ListNode(-1);    // the dummy head of nodes less than x
	      ListNode dummy2 = new ListNode(-1);    // the dummy head of nodes no less than x
	      ListNode head1 = dummy1;
	      ListNode head2 = dummy2;
	      while (head != null)					
	      {
	          if(head.val < x)					//if the node is less than x then attach to list 1
	          {
	              head1.next = head;
	              head1 = head1.next;
	          }
	          else								//if the node is greater than x then attach to list 2
	          {
	              head2.next = head;
	              head2 = head2.next;
	          }
	          head = head.next;					//now move head to next node and continue the process
	      }
	      
	      head1.next = dummy2.next;  			// finally bring the two sub lists together
	      head2.next = null;					//reference the end of list 2 to null
	      
	      return dummy1.next;					//return the head of list 1
	    }
}
