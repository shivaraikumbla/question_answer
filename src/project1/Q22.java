package project1;

import java.util.Arrays;

public class Q22 {
	
public static void main(String arg[]){
	
	int[] array1={111,112,113,114};
	int[] array2={111,112,115,114};
	int count=0;
	System.out.println("array 1:" +Arrays.toString(array1));
	System.out.println("array 2:" +Arrays.toString(array2));
for( int i=0;i<array1.length;i++)
{
	
	for(int j=0;j<array2.length;j++)
	{
		
		if(array1[i] == array2[j])
		{
			System.out.println("same element" +(array1[i]));
		count++;
		}

}
}
System.out.println("number of elment" +count);

}
}
