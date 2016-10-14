
public class CombineList {

	public static void main(String[] args)
	{
		ListNode head1 = new ListNode(1);			//create head
		ListNode n1_1 = new ListNode(3);			// and add nodes and link them
		head1.next = n1_1;
		ListNode n1_2 = new ListNode(5);
		n1_1.next = n1_2;
		ListNode n1_3 = new ListNode(6);
		
		ListNode head2 = new ListNode(4);			//create second linked list with head2
		ListNode n2_1 = new ListNode(7);			//add nodes to it
		head2.next = n2_1;
		ListNode n2_2 = new ListNode(8);
		n2_1.next = n2_2;
		
		Combine(head1,head2);						//call method to combine them
		
		
		ListNode dummies = head1;					//print the linkedlist
		while(dummies!=null)
		{
			System.out.print(dummies.val+"=>");
			dummies = dummies.next;
		}
	}
	
	
	
	
	public static ListNode Combine(ListNode head1, ListNode head2)
	{
		ListNode dummy1 = new ListNode(-1);			//add dummy in front to list 1
		dummy1.next = head1;				
		ListNode dummy2 = new ListNode(-1);			//add dummy in front to list 2
		dummy2.next = head2;
		
		ListNode list1 = head1;						//add reference to head1
		ListNode list1_ref = dummy1;				//another reference to dummy1
		
		ListNode list2 = head2;						//add references to head2 and dummy2
		ListNode list2_ref = dummy2;



		while(list1 != null && list2 !=null)		
		{
			if(list1.val < list2.val)					//while list1 nodes are smaller than list nodes
			{
				list1 = list1.next;						//travel the list1 with both references
				list1_ref = list1_ref.next;
			}
			
			else if(list1.val > list2.val)				//if any node is greater than node in list 2
			{
				dummy2.next = list2.next;				//then add the node in list 2 between two references
				list1_ref.next = list2;					//in list 1
				list2.next = list1;
				list1_ref = list1_ref.next;
				list2_ref = dummy2;						//and update the references to correct places
				list2 = dummy2.next;
			}
			
		}
		
		if(list1 == null)								//if we reach end of list1
		{
			list1_ref.next = list2;						// attach the list2 to end of list1
		}
		
		else if(list2 == null)							//if we reach end of list 2 then add the list 1 to 2
		{
			list1_ref.next = list2_ref;
			list2_ref.next = list1;
		}
		
		return dummy1.next;
	}
}
