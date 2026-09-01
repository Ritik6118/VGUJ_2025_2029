package Stack;
import LinkedList.my_LL;

public class Stack_using_LL {
	private my_LL ll;
	Stack_using_LL(){
		ll=new my_LL();
	}
	
	public  void push(int n) {
		ll.addFirst(n);
	}
	public  int pop() {
		return ll.removeFirst();
	}
	public int peek() {
		return ll.getFirst();
		
	}
	
	
	
	
}

