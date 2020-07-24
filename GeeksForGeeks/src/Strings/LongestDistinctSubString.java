package Strings;

import java.util.HashSet;

public class LongestDistinctSubString {
    
	static int find(String str) {
		int maxLength = 0;
		int count = 0;
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			if(set.contains(str.charAt(i))) {
				
				if(count > maxLength) 
				   maxLength = count;
				
				set.clear();
				set.add(str.charAt(i));
				count = 1;
				
			}
			else {
				set.add(str.charAt(i));
				count+=1;
			}
			
			if(count > maxLength)
				maxLength = count;
		}
		
		return maxLength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdafdbce";
		
		int length = find(str);
		
		System.out.println(length);

	}

}
