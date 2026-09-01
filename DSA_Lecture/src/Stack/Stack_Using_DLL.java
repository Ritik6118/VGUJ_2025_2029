package Stack;

public class Stack_Using_DLL {
	private Dnode tail;
	
	public void push(int n) {
		Dnode nn=new Dnode(n);
		tail.next=nn;
		tail=nn;
	}
	
	public void pop() {
		Dnode prev = tail.prev;
		prev.next=null;
		tail=prev;
	}
	public int peek() {
		return tail.data;
	}
	public boolean isEmpty() {
		return tail==null;
	}
	
}

class Dnode{
	Dnode prev;
	int data;
	Dnode next;
	
	Dnode(){
		
	}
	Dnode(int n){
		data=n;
	}
}