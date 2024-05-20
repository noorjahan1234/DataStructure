
class Node{
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}
public class SortedListMerger {

	public static Node mergeSortedLists(Node l1, Node l2) {
		if(l1 == null) {
			return l2;
		}
			if(l2 == null) {
				return l1;
			}
			//Initialize mergedList with a dummy node
			Node dummy = new Node(-1);
			Node current = dummy;
			while(l1 != null && l2 != null) {
				if(l1.data < l2.data) {
					current.next=l1;
					l1=l1.next;
				}
				else {
					current.next=l2;
					l2=l2.next;
				}
				current =current.next;
			}
			if(l1 != null) {
				current.next = l1;
			}
			if(l2 != null) {
				current.next = l2;
			}
		return dummy.next;
	}
	public static void main(String[] args) {
		Node l1=new Node(1);
		l1.next=new Node(3);
		l1.next.next=new Node(5);
		
		Node l2=new Node(2);
		l2.next=new Node(4);
		l2.next.next=new Node(6);

		Node meregedList = mergeSortedLists(l1,l2);
		System.out.println("Mereged List: ");
		while(meregedList != null) {
			System.out.println(meregedList.data+" ");
			meregedList = meregedList.next;
		}
	}

}
