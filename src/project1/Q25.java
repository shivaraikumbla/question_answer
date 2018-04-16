package project1;

import java.util.Scanner;

public class Q25 {
	public static void main(String arg[]){
		String s,rev="";
		System.out.println("enter a string");
		Scanner s1=new Scanner(System.in);
		s=s1.next();
		int length=s.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+s.charAt(i);
			if(s.equals(rev)){
				System.out.println("palindrome" +s);
			}else{
			System.out.println("not palindrome" +s);
			}
		
		
	}

}
