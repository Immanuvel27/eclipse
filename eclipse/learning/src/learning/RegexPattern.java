package learning;
import java.util.Scanner;
import java.util.regex.*; 

public class RegexPattern {



	public static void main(String[] arg) {
		Scanner cin=new Scanner(System.in);



		System.out.println("enter the string");
		String s=cin.next();
		s=s.toLowerCase();
		System.out.println("enter the pattern");
		String p=cin.next();
		p=p.toLowerCase();


		boolean result_third = Pattern.matches(p, s); 




		System.out.println(result_third); 

	}

}