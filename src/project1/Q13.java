package project1;

import java.util.Scanner;

public class Q13 {
	public static void main(String arg[]){
		int temp=0,reverse=0,num1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		num1=scanner.nextInt();
		temp=num1;
		while(num1>0){
				
			reverse=reverse*10+num1%10;
			num1/=10;
			}
		if(reverse==temp){
			System.out.println(" palindrome");
		}
		else{
			System.out.println("not palindrome");
		}}
	

}
