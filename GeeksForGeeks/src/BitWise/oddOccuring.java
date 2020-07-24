package BitWise;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class oddOccuring {
	
	
	public static void oddOccr(int arr[]) {
		Arrays.sort(arr);
		int len = arr.length;
		int i = 0;
		
        List<Integer> res = new ArrayList<Integer>();
		
		while(i<len-1) {
		   
		   if(arr[i] == arr[i+1]) {
			   i+=2;
		   }
		   else {
			  res.add(arr[i]);
			  i+=1;
		   }
		   
		   if(i == len-1)
			   res.add(arr[i]);
		}
		
		Iterator<Integer> itr = res.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	
	public static void oneOddUsingBit(int arr[]) {
		
	}
	

	public static void main(String as[]) {
		int[] arr = {1,1,2,3,4,4,4,4,5,5,6,7,8,8};
		oddOccr(arr);
	}
	
}
