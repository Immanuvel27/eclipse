package learning;

import java.util.Scanner;

public class sum3 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=cin.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array:");
		for(int i=0;i<n;i++) {
			a[i]=cin.nextInt();		
		}
		System.out.println("enter the target");
		int target=cin.nextInt();
		int sum=0,close1=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(Math.abs(a[i]+a[j]+a[k]-target)<close1) {
						close1=Math.abs(sum-target);
						sum=a[i]+a[j]+a[k];
					}
					
				}
			}
		}
		System.out.println(sum);
	}



}
