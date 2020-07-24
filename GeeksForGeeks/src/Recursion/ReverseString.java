package Recursion;

public class ReverseString {

	public static char[] revString(char[] arr,int i) {
		if(i < 0)
			return arr;
		
		System.out.println(arr[i]);
		
	    return revString(arr,i-1);
	 
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr = {'k','a','n','n','a'};
		int len = arr.length;
		char result[] = revString(arr,len-1);
		
		/*for(char c : result) {
			System.out.println(c);
		}*/

	}

}
