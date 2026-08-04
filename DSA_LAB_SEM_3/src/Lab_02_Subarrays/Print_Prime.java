package Lab_02_Subarrays;

import java.util.*;

public class Print_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(chekPrime(i)==true) {
				System.out.println(i);
			}
		}
//		boolean b=chekPrime(10);
//		System.out.println(b);
		
	}

	public static boolean chekPrime(int n) {
		// TODO Auto-generated method stub
		//         i<=n-1
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}	

}
