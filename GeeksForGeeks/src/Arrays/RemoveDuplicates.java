package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	static int removeDup(int arr[]) {
		Set<Integer> hs = new LinkedHashSet<Integer>();
	
	for(int num : arr) {
		hs.add(num);		
	}
	
	
	Iterator<Integer> itr = hs.iterator();
    while(itr.hasNext()) {
    	System.out.print(itr.next()+" ");
    }
	
	return hs.size();
		
	}
	
  public static void main(String as[]) {
	  int arr[] = {1,8,19,22,28,29,35,39,49,49,54,68,69,82,84,85,89,94,97,100,100};
	  int count = removeDup(arr);
	  System.out.println(count);
  }

}
