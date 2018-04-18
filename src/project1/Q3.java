package project1;

public class Q3 {
	public static void main(String arg[]){
		int diff;
		int[] array={2,1,3,5};
		diff=MaxDiff(array);
	System.out.println("diff" +MaxDiff(array));
	}
		//int Previous=array[0];
		//System.out.println("list list of difference");
		//for(int i=0;i<array.length;i++){
			//int j=i+1;
			//Previous=Previous-array[i];
		
		//System.out.println(" "+j+"     " +Previous);
		//Previous=array[i];
		public static int MaxDiff(int[] array){
		int diff=0;
		
		for(int i=0;i<=array.length;i++){
			if(i==array.length){
				diff=Math.abs(array[i]-array[0]);
				
			}
			else{
				diff=Math.abs(array[i]-array[i+1]);
			}
		}
		return diff;
	
	}}