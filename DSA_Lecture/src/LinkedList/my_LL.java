package LinkedList;

public class my_LL {
	Node head;
	
	public void addFirst(int n) {
		Node nn=new Node(n);
		nn.next=head;
		head=nn;
		
	}
	public void addLast(int n) {
		Node nn=new Node(n);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=nn;
		
	}
	public void addAtIndex(int n,int idx) {
		if(idx==0) {
			addFirst(n);
			return;
		}
		Node curr=getIndex(idx);
		Node prev=getIndex(idx-1);
		
		Node nn=new Node(n);
		prev.next=nn;
		nn.next=curr;
	}
	
	private Node getIndex(int idx) {
		if(idx<=0) {
			return null;
		}
		Node temp=head;  // pointer at 0 index
		for(int i=0;i<idx;i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	public int removeFirst() {
		int n=head.data;
		Node next=head.next;
		head.next=null;
		head=next;
		return n;
		
	}
	public int removeLast() {
		Node temp=head;
		Node prev=null;
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		return temp.data;
	}
	public int removeAtIntex(int idx) {
		Node curr=getIndex(idx);
		Node prev=getIndex(idx-1);
		Node next=curr.next;
		
		prev.next=next;
		curr.next=null;
		return curr.data;
	}
	public int getFirst() {
		return head.data;
	}
	
}


class Node{
	
	int data;
	Node next;
	
	Node(){
	}
	Node(int d){
		data=d;
	}
	
}