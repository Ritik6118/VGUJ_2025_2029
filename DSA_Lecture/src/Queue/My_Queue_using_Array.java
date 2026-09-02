package Queue;

public class My_Queue_using_Array {
	
	int [] arr;
	int front;
	int last;
	int size;
	
	My_Queue_using_Array(){
		arr=new int [5];
	}
	My_Queue_using_Array(int n){
		arr=new int [n];
	}
	public void add(int n) {
		arr[last]=n;
		last++;
		last%=arr.length;
		size++;
		
	}
	
	public  int poll() {
		int n=arr[front];
		front++;
		front%=arr.length;
		size--;
		return n;
	}
	public boolean isEmpty() {
		return size==0;
	}
	
	public String toString () {
		String s="";
		int idx=front;
		int x=size;
		while(x>0) {
			s+=arr[idx%arr.length]+" ";
			idx++;
			x--;
		}
		
		return s;
	}
//	public void add(int n) {
//		arr[last]=n;
//		last++;
//	}
//	
//	public  int poll() {
//		int n=arr[front];
//		front++;
//		return n;
//	}
	
}
