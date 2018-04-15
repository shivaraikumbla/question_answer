package project1;

import java.util.Scanner;
import java.util.*;

public class Fibbonacci {
	public static void main(String arg[])
	{
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int  n=s.nextInt();
		System.out.println( "sum of fib:" +sumOfFib(n));
		}
public static int sumOfFib(int n){
		int n1=-1,n2=1,n3=0,n4=0;
		for( int i=0;i<=n;i++){
			n1=n2;
			n2=n3;
			n3=n1+n2;
			n4+=n3;
		}
		 return n4;		
	}

	
		
	
	}

