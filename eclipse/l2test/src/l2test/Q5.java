package l2test;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("ente the size of the array:");
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
		
		int max=1;
		
			max=arr[n-1]*arr[n-2]*arr[n-3];
			
			System.out.println("maxproduct:"+max+"\n");
			System.out.print("("+arr[n-1]+","+arr[n-2]+","+arr[n-3]+")");
		
	}

}
