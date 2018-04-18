package project1;

import java.util.Scanner;

public class Q15 {
	
public static void main(String arg[]){
	String str;
	System.out.println("enter the string to reverse");
	Scanner scanner=new Scanner(System.in);
	str=scanner.next();
	String reverse="";
	for(int i =str.length()-1;i>=0;i--){
		reverse=reverse+ "-"+str.charAt(i);
	}
	System.out.print("revese string" +reverse);
	
}
}
