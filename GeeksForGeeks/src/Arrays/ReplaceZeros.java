package Arrays;

public class ReplaceZeros {
	public static void convertfive(int num) {
       
		
		if(num == 0) {
			System.out.println("Invalid input");
			return;
		}
		
	   int result = 0;
	   int count = 1;
		
       while(num!=0) {
    	  int rem = num % 10;
    	  num = num/10;
    	  
    	  if(rem == 0)
    		 result += count*5;
    	  else
    		 result += count*rem;
    	  
    	  count *= 10;
       }
       
       System.out.println(result);
        
       
    }
	
	public static void main(String as[]) {
		convertfive(10);
	}
}
