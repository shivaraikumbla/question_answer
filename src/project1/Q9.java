package project1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class Q9 {
	public static void main(String[] args) 
	{
		LocalDate d1=LocalDate.of(2012,Month.DECEMBER,03);
		LocalDate d2=LocalDate.of(2012,Month.JULY,03);
		Period p1=Period.between(d2,d1);
		System.out.println("diff  :"+p1.getMonths());
		
	}

		
	
}
