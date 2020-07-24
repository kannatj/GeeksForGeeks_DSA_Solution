package pattern;


//  aabbcccdeeaaaaa -> a2b2c3d1e2a5

public class countIndividual {

	
	static String count(String str) {
		char arr[ ] = str.toCharArray();
	     int i = 0;
	     int len = arr.length;
	     int count = 1;
	     String result="";
	  
	     while(i < len) {
	    	 
	    	  if(i == len-1) {
	    		   result += Character.toString(arr[i])+Integer.toString(count);
	    		   i++;
	    	   }
	    	  
	    	  else if(arr[i] == arr[i+1]) {
	    		   count++;
	    		   i++; 
	    	   }
	    	  
	    	  else {
	    		   result += Character.toString(arr[i])+Integer.toString(count);
	    		   count = 1;
	    		   i++;
	    	   }
	     }
	     
	     return result;
	}
	
	
	public static void main(String as[]) {
		String result = count("aabbcccdeeaaaaa");
		System.out.println(result);
	}
	
}
