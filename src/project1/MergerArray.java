package project1;

public class MergerArray {
	public static void main(String arg[]){
			int[] arr1={4,3,5,6};
			int[] arr2={6,5,7};
			int sum=0;
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{ sum=sum+arr1[i];
						
					System.out.println(arr1[i]);
						
					}
					
				}
			}	System.out.println(sum);
			
			}
			
	}


//*