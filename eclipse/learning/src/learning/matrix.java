package learning;

import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		int temp;
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the NxN:");
		Integer n=cin.nextInt();
		Integer[][] arr=new Integer[n][n];
		System.out.println("enter the array");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=cin.nextInt();
			}
		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				temp=arr[i][j];
//				arr[i][j]=arr[j][i];
//				arr[j][i]=temp;
//			}
//		}
		System.out.println("the array is:\n");
		
		
		for(int j=0;j<n;j++) {
			for(int i=n-1;i>=0;i--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}
