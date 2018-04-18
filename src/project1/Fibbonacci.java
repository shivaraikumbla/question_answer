package project1;

import java.util.Scanner;
import java.util.*;

public class Fibbonacci {
	public static void main(String arg[])
	

	{
		int n,a=1,b=1,sum=a+b;
		System.out.println("enter fibbonacci series");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		
		for( int i=2;i<n;i++){
			int temp=a+b;a=b;b=temp;
			sum=sum+temp;}
	System.out.println("sum"+sum);	
	}
	}
		
	
	
//*
