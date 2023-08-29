package linkedlist;

public class ListUtil {
	
	public static void printList(ListNode head, String message)
	{
		if(message != null && message.length()>0)
		{
			System.out.println("\n"+message);
		}
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		while(head != null)
		{
			System.out.print(head.val);
			if(head.next !=null)
				System.out.print(" -> ");
			head = head.next;
		}
	}
	
	public static ListNode sampleList()
	{
		ListNode head = new ListNode(1);
		ListNode curr = head;
		
		for(int i=2;i<=10;i++)
		{
			curr.next = new ListNode(i);
			curr = curr.next;
		}
		
		return head;
	}

}
