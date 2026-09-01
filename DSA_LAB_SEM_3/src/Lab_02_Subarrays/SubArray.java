package Lab_02_Subarrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-1,-2,-3,-100,-4,-5};
		int sum=arr[0];
//		int [] arr2=new int[5];  // ==>{0,0,0,0,0}
//		System.out.println(arr2.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				print(arr,i,j);
				int s=sum(arr,i,j);
				sum=Math.max(s, sum);
//				if(j-i+1==3) {
//					sum(arr,i,j);
//				}
				
//				if(i%2==0) {
//					sum(arr,i,j);
//				}
			}
		}
		System.out.println(sum);
//		print(arr, 0,3);
		
	}

	private static int sum(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int sum=0;
//		int count=0;
		for(int i=start;i<=end;i++) {
			sum+=arr[i];				
//			if(i%2==0) {
//				sum+=arr[i];				
//			}
//			count++;
		}
//		if(count==3) {
//			System.out.println(sum);			
//		}
		System.out.println(sum);
		return sum;
	}

	private static void print(int [] arr,int start, int end) {
		// TODO Auto-generated method stub
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("-->");
	}

}
