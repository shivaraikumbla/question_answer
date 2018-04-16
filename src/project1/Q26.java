package project1;

public class Q26 {
	public static void main(String arg[]){
		String str="hiioogfd";
		int count=0;
		char[] inp=str.toCharArray();
		System.out.println("duplicate character are:");
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(inp[i] == inp[j]){
					System.out.println(inp[j]);
					count++;
					break;
				}
			}
		}
	}

}
