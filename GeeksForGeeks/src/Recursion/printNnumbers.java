package Recursion;

public class printNnumbers {
	
	public static void printNnos(int N) {
		 
		if(N == 0)
			return;
		
		System.out.println(N);
		printNnos(N-1);
		
	}
	
	
	
	public static void printNrev(int N) {
		if(N == 0)
			return; 
		System.out.print(" "+N);
		printNrev(N-1);
		//System.out.print(" "+N);
		
	}
	
	public static void main(String as[]) {
		//printNrev(5);
		
		printNnos(5);
	}

}
