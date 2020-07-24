package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
	
	// O(nlogn)
	static int findKthLargest_Naive(int nums[],int k) {
		
		Arrays.sort(nums);
        
		return nums[nums.length-k];
	}
	
	
	// O(n + klogn)
	static int findKthLargest(int nums[],int k) {
		
		PriorityQueue<Integer>  pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int a : nums) 
		  pq.add(a);
		
		while(--k >0)
		  pq.poll();
		
		return pq.peek();
		
	}
	
	public static void main(String as[]) {
	
		int arr[] = {1,19,3,15,7,2,10};
		
		int result = findKthLargest_Naive(arr,2);
		
		System.out.println(result);
	}

}
