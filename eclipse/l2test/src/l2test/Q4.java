package l2test;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=cin.nextInt();
		int arr[]=new int[n];
		System.out.println("ente the array:");
		for(int i=0;i<n;i++) {
			arr[i]=cin.nextInt();
			
		}
		System.out.println("enete the sum to be pair:");
		int sum=cin.nextInt();
		
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			}
		
		int k=0;
		int[] temp1 = new int[n];
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp1[k++]=arr[i];
			}
		}
		temp1[k++] = arr[n - 1];
		
//		for(int i=0;i<k;i++) {
//			System.out.print(temp1[i]+" ");
//		}
		
		for(int i=0;i<k;i++) {
			for(int j=i+1;j<k;j++) {
				if(temp1[i]+temp1[j]==sum||temp1[i]+temp1[j]==(-sum)) {
					System.out.print("("+temp1[i]+","+temp1[j]+") ");
				}
			}
		}
	}

}
