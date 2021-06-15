package Recursion;

/*
 * Steps:
 * including [] [A]
 * including [] [B] [A] [AB]
 * including [] [C] [B] [BC] [AC] [AB] [ABC]
 */

public class GenerateSubsets {

	void subsets(String str, String cur, int n) {
		
		int len = str.length();
		
		if(len == n) {
			System.out.println(cur);
		    return;
		 }
		
		 subsets(str, cur, n+1);                 //Not including
		 subsets(str, cur+str.charAt(n), n+1);   //Including
	}

	public static void main(String[] args) {
      GenerateSubsets G1 = new GenerateSubsets();
      G1.subsets("ABC", " ", 0);                 //Starting from 0 -> n-1  A,B,C
	}
}
