package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		ListNode head = ListUtil.sampleList();
		ListUtil.printList(head, "list before reverse ");
		ReverseLinkedList obj = new ReverseLinkedList();
		ListNode newHead = obj.reverseList(head);
		ListUtil.printList(newHead, "List after reverse");
	}

	


    ListNode newHead = null;
    public ListNode reverseList(ListNode A) {
        reverseUtil(A);
        return newHead;
    }

    private ListNode reverseUtil(ListNode node)
    {
        if(node == null)
        {
            return null;
        }
        ListNode temp = reverseUtil(node.next);

        if(temp == null)
        {
            newHead = node;
            return node;
        }

        temp.next = node;

        node.next = null;
        return node;
    }
}
