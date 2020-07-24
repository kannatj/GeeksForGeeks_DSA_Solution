package Strings;

public class KMPAlgo {
    public static void findPattern(String text,String pat) {
    	
    	int m = pat.length();
    	int n = pat.length();
    	
    	int lps[] = new int[m];
    	
    	LPS(pat,m,lps);
    	
    	
    	int j = 0; // Index of Pattern
    	int i = 0; // Index of Text
        while(i<n) {
        	
        	if(pat.charAt(j) == text.charAt(i)) {
        		j++;
        		i++;
        	}
        	
        	if(j == m) {
        		System.out.println("Found Pattern at Index "+(i-j));
        		j = lps[j-1];
        	}
        	
        	else if( i<n && pat.charAt(j) != text.charAt(i)) {
        		if(j!=0) 
        			j = lps[j - 1];   //NOT Incrementing i
        		     
        		else
        			i+=1;
        	}
    		
    	}
    	
    }
    
	public static void LPS(String pat,int m,int lps[]) {
		
		int len = 0;
		int i = 1;
		lps[0] = 0;
		
		while(i<m) {
			if(pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else {
				if(len !=0) {
					len = lps[len-1];
				}
				else {
					lps[i] = len;
					i+=1;
				}
			}
		}
		
	}
	public static void main(String as[]) {
		
		findPattern("abcdfesabc","abc");
		
	}
}
