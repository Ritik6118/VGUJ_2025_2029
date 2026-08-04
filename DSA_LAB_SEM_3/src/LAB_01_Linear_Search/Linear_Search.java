package LAB_01_Linear_Search;
public class Linear_Search{
	
	public  static void main (String[] args){
		
		//int[] arr=new int [5];

		int [] arr={1,2,3,4,5};

		int target=3;

		// linear search

		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(-1);
			
	}

}