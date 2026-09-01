package Stack;

public class My_Dynamic_Stack extends My_Stack {
	
	@Override
	public void push(int n) {
		if(this.isFull()) {
			grow();
			
		}
		arr[top++]=n;
	}
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<top;i++) {
			s+=arr[i]+" ";
		}
		return s+"<-top";
	}

	private void grow() {
		// TODO Auto-generated method stub
		int [] narr= new int[arr.length*2];
		for(int i=0;i<top;i++) {
			narr[i]=arr[i];
		}
		super.arr=narr;
	}
	
	
	
	
}
