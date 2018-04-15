package project1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Day {
	
		
		public static void main(String arg[]){
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter a date");
			int date=scanner.nextInt();
			System.out.println("enter a month");
			int month=scanner.nextInt();
		System.out.println("enter a year");
			int year=scanner.nextInt();
			Date date1=(new GregorianCalendar(year,month,date)).getTime();
			SimpleDateFormat f= new SimpleDateFormat();
			String day=f.format(date);
			System.out.println(day);
		}
	}


