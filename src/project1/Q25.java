package project1;

import java.util.Scanner;

public class Q25 {
	public static void main(String arg[]){
		String str,rev="";
		System.out.println("enter a string");
		Scanner s1=new Scanner(System.in);
		str=s1.next();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+str.charAt(i);
			if(str.equals(rev)){
				System.out.println("palindrome" +str);
			}else{
			System.out.println("not palindrome" +str);
			}
			System.out.println("vowels in string::"+count_vowels(str));

		
	}
	
	
	public static int count_vowels(String str)
	{
		boolean b=true;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
			{
				count++;
			}

		}
		return count;
	}
}
//*
