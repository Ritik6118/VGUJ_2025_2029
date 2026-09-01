package Stack;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		My_Dynamic_Stack st=new My_Dynamic_Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(50);
		System.out.println(st);
//		st.pop();
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		
	}	

}
