package l2test;

import java.util.Scanner;

public class Q3 {
	public static void main(String Args[]) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=cin.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=cin.nextInt();
		}
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
		
		for(int i=0,j=n-1;i<j;i++,j--) {
			System.out.print(arr[i]);
			System.out.print(" ");
			System.out.print(arr[j]+" ");
		}
		if(n%2==1) {
			int mid=n/2;
			System.out.print(arr[mid]);
		}

	}

}
