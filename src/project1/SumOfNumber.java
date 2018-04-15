package project1;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String arg[]){	
	int num1,sum=0;
	System.out.println("enter a number");
	Scanner scanner=new Scanner(System.in);
	num1=scanner.nextInt();
	
	while(num1>0){
		sum=sum+num1 % 10;
		num1/=10;
	}
	
System.out.println("sum of number" +sum);
if(sum % 2==0)
{
	System.out.println("number is even");
	
}
else
{
	System.out.println("even number");

}

}}
