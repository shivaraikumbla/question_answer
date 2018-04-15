package project1;

public class Q3 {
	public static void main(String arg[]){
		int[] array={2,3,4,2,3} ;
		int Previous=array[0];
		System.out.println("list list of difference");
		for(int i=0;i<array.length;i++){
			int j=i+1;
			Previous=Previous-array[i];
		
		System.out.println(" "+j+"     " +Previous);
		Previous=array[i];
	
}}}