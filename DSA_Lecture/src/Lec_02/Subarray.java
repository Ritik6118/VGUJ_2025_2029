package Lec_02;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				print(arr,i,j);
				
			}
		}
		print(arr, 0,3);
		
	}

	private static void print(int [] arr,int start, int end) {
		// TODO Auto-generated method stub
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
