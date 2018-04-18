package project1;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String arg[])
	{	
		int sum=0;
	System.out.println("enter a number");
	Scanner scanner=new Scanner(System.in);
	 int num1=scanner.nextInt();
	sum=addDigit(num1);
	System.out.println(+sum);
	System.out.println(checkValue(sum));
	}
	
	public static int addDigit(int num1){
		 int sum=0;

	while(num1>0){
	int	i=num1%10;
	if(i%2!=0){
sum+=i;
		}
	num1=num1/10;
	
	
			}

return sum;
	
	}
	
	
	public static int checkValue(int sum){
		if(sum%2==0){
			return -1;}
		else{return +1;}
		
	}
	
	}
	
	
	

//**
	