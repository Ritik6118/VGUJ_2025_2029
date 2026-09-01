package Stack;

public class My_Stack {
	protected int [] arr;
	protected int top;
	
//	My_Stack(){
//		
//	}
	
	My_Stack(int size){	
		arr=new int [size];
		top=0;
	}
	
	My_Stack(){
		arr=new int[5];
		top=0;
		
	}
	
	public void push(int n) {
		arr[top]=n;
		top++;
	}
	
	public int pop() {
		top--;
		return arr[top];
	}
	
	public int peek() {
		return arr[top-1];
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public boolean isFull() {
		return top==arr.length;
	}
	
	public int size() {
		return top;
	}
	
	
}
