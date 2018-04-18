package project1;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) 
	{
		int rev=0,sum=0;
		int op[]=new int[10];
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int n1=sc.nextInt();
		System.out.println("Enter the second number :");
		int limit=sc.nextInt();
		for(int i=n1;i<=limit;i++){
			n1=i;
			while(n1>0){
				int b=n1%10;
				
				rev=rev*10+b;
				n1=n1/10;
				
				
						
			}
			if(rev==i){
			System.out.println(i+"");
			op[k]=i;
			k++;
			
				
			}
			rev=0;
		}
		for(int s:op){
			sum=sum+s;
		}
		
		System.out.println("Addition :"+sum);
	
		}
	}
