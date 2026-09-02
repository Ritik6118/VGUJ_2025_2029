package Queue;

public class Implement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Queue_using_Array q=new My_Queue_using_Array();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
//		System.out.println("hello");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
