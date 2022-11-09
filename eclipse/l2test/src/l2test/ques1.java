package l2test;

import java.util.Scanner;

public class ques1 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	System.out.println("enter the size:");
	int n=cin.nextInt();
	int sum=0,k=0;
	String str="";
	int[] arr=new int[n];
	
	System.out.println("enter the array:");
	for(int i=0;i<n;i++) {
		arr[i]=cin.nextInt();
	}
	for(int i=0;i<n;i++) {
		sum=sum*10+arr[i];
	}
	sum+=1;
	str+=sum;
//	System.out.println(str);
	
	int len=str.length();
	
	char[] ch = str.toCharArray();
	for(int i=0;i<len;i++) {
		System.out.print(ch[i]+" ");
	}
	
}
}
