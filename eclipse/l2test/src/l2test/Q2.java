package l2test;

import java.util.Scanner;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class Q2 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=cin.nextInt();
		int arr[]=new int[n];
		String str="";
		System.out.println("enter the array");
		for(int i=0;i<n;i++) {
			arr[i]=cin.nextInt();
		}
		for(int i=0;i<n;i++) {
			str+=arr[i];
		}
		char[] ch = str.toCharArray();
		char[] ch1=new char[n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='*';
				}
			}
		}
		int k=0;
		for(int i=0;i<n;i++) {
			if(ch[i]!='*') {
				ch1[k++]=ch[i];
			}
		}
		int x=k;
		
		
		for(int i=x;i<n;i++) {
			ch1[i]='_';
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(ch1[i]+" ");
		}
		
	}
}
