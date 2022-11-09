package imman;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=cin.nextLine();
		int len=str.length();
		int flag=1;
		for(int i=0,j=len-1;i<j;i++,j--) {
			if(str.charAt(i)==str.charAt(j)) {
				flag=1;
			}else {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
