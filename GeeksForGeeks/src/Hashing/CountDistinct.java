package Hashing;

import java.util.HashSet;

public class CountDistinct {
	
	public static void findFreq(int arr[],int k) {
		
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		int n = arr.length;
		int i=0,j=0;
		int wind=0;
		
		while(i<=n-k && wind<k) {
			
			set.add(arr[j]);
			
			if(wind == k-1) {
			   System.out.println(set.size());
			   set.clear();
			   wind=0;
			   i++;
			   j=i;
			   
			}
			else {
				
				j++;
				wind++;
				
			}
		}
		
	}
	
	public static void main(String as[]) {
		int arr[] = {10,10,5,3,10,5,5,5,2,43,2,5,1,2,2};
		findFreq(arr,3);
	}

}
