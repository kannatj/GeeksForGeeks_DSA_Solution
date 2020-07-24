package Strings;

import java.util.HashMap;
import java.util.Map;

public class LeftMostRepeatedChar {
	
	static HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	
	static int findRepChar(String str){
		int index = -1;
		int leftMost = Integer.MAX_VALUE;
		
		for(int i=0;i<str.length();i++) {
		      if(map.containsKey(str.charAt(i))) {
		    	  index = map.get(str.charAt(i));
		    	  if(index < leftMost) 
		    		  leftMost = index;
		      }
		      else 
		    	  map.put(str.charAt(i), i);
		      
		}
		
		if(leftMost != Integer.MAX_VALUE)
			return leftMost;
		else 
		    return -1;
	}
	
	
	static char LeftNotRepChar(String str) {
		
		for(int i=str.length()-1;i>=0;i--) {
			
			if(map.containsKey(str.charAt(i)))
			   map.put(str.charAt(i), -1);
			
			else 
				map.put(str.charAt(i), 1);
		
		}
		
		char c = 0;
		for(Map.Entry<Character,Integer> m:map.entrySet()) {
			if(m.getValue() == 1) {
				c = m.getKey();
			}
		}
		
		return c;
		
	}
	
	public static void main(String as[]) {
		
		
		
		//Left Most repeater character
		String s = "aabdhchsdjkos";
		int res = findRepChar(s);
		if(res != -1){
			System.out.println(s.charAt(res));
		}
		else {
			System.out.println("No repeated character Found");
		}
		
		
		
		
		//LeftMostCharacter
		String str = "edaaaabbbbbc";
		char result = LeftNotRepChar(str);
		if(result!=0) {
			System.out.println(result);
		}
		else {
			System.out.println("No repeated character Found");
		}
		
		
		
		
	}

}
