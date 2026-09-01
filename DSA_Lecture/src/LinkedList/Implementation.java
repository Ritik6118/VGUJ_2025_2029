package LinkedList;

public class Implementation {

	public static void main(String [] args) {
		my_LL ll=new my_LL();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(6);
		ll.addAtIndex(8, 2);
		ll.removeAtIntex(2);
		ll.removeFirst();
		ll.removeLast();
		// how to iterate over this structre
		Node temp=ll.head;
		
		while(temp!=null) {
			System.out.println(temp.data+ " ->>"+temp);
			temp=temp.next;
			
		}
	}

}
