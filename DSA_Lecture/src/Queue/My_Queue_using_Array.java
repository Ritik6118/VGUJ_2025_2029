package Queue;

public class My_Queue_using_Array {
	
	int [] arr;
	int front;
	int last;
	
	public void add(int n) {
		arr[last]=n;
		last++;
	}
	
	public  int poll() {
		int n=arr[front];
		front++;
		return n;
	}
	
}
