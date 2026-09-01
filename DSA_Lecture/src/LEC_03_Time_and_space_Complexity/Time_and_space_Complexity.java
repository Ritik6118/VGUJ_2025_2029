package LEC_03_Time_and_space_Complexity;

import java.util.*;

public class Time_and_space_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int [] arr=new int[n];
//		System.out.println("hello");   // O(1)
		
		
//		System.out.println("hello");   // O(1)
//		System.out.println("hello");   // O(1)
//		System.out.println("hello");   // O(1)
//		System.out.println("hello");   // O(1)
//		System.out.println("hello");   // O(1)
		
//		for(int i=0;i<n;i++) {
//			System.out.println("hello");   // O(1)			
//		}
//		O(n)
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.println("hello");   // O(1)							
//			}//O(n)
//		}
//		O(n^2)
		
//		for(int i=0;i<n;i++) {
//			System.out.println("hello");   // O(1)							
//		}
//		for(int j=0;j<n;j++) {
//			System.out.println("hello");   // O(1)							
//		}
		//O(n+n) => O(2n) -> O(n)
		
//		for(int i=0;i<10;i++) {
//			System.out.println("hello");
//		} O(1)
		
		
//		int []  arr= {1,2,3,4,5,6};//  size n
//		int x=2;
//		while(x<n) {
////			System.out.println("hello");
////			String s=Arrays.toString(arr);
//			String s="[";
//			for(int i=0;i<n;i++) {
//				s+=arr[i]+", ";
//			}
//			s+="]";
//			System.out.println(s);
//			x+=1;
//			
//		}  O(n^2)
//		
		
		
//		for(int i=1;i<=n;i*=2) {
//			System.out.println("hello");
//		}
		
		
		
//		for(int i=1;i<=n;i*=3) {
//			System.out.println("hello");
//		}
		
//		for(int i=1;i<=n;i*=2) {
//			for(int i=1;i<=n;i*=2) {
//				System.out.println("hello");
//			}
//		} (log(n))^2
		
//		for(int i=0;i<n;i++) {
//			for(int j=1;j<=n;j*=2) {
//				System.out.println("hello");
//			}	
//		}n*log(n)
		
		
//		for(int j=1;j<=n;j*=2) {
//			System.out.println("hello");
//		}	
//		for(int j=1;j<=n;j*=2) {
//			System.out.println("hello");
//		}	
		
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				for(int k=0;k<n;k*=2) {
//					// operation  O(1)
//				}
//			}
//		}
	
//		n^2*log(n)
		
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				for(int k=0;k<o;k*=2) {
//					// Operation O(1)
//				}
//			}
//		}
		
		for(int i=n;i>=1;i/=2) {
			System.out.println("hello");
		}
		
//		O(n*m*log(o))
	}	

}
