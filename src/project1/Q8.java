package project1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Q8 {
	public static void main(String [] args) throws ParseException{
		Scanner sc=new Scanner(System.in);
		
	
		
		System.out.println("enter the date :");
		String s1=sc.next();
		
		
		SimpleDateFormat sd1=new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sd2=new SimpleDateFormat("MMMM");
		 Date d1=sd1.parse(s1);
		 String s=sd2.format(d1);
		 System.out.println(s);
		 
	}}

//*