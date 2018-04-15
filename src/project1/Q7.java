package project1;

import java.util.Scanner;

public class Q7 {
public static void main(String arg[]){
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=scanner.nextInt();
int sum=1,i,count=0,sub;
for(i=3;i<=n;i=i+2){
	count++;
	if(count==2){
		sub=sum-i;
		
	sum=sub;
	count=0;
	}
sum=sum+i;

}
System.out.println("result" +sum);
}
}
