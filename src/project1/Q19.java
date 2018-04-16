package project1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q19 {
	
public static boolean isValid(String value)
{
	try{
		new SimpleDateFormat("dd/mm/yyyy").parse(value);
		return true;
	}
	catch(ParseException e)
	{
	return false;
}
	
}
public static void main(String arg[])
{
	System.out.println("result"  + isValid(value));
}
}