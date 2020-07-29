package Sorting;

public class QuickSort {

	public static void main(String as[]) {
		int arr[] = {10,2,4,11,9,14,46,12,43,23,13};
		int low =0;
		int high = arr.length-1;
		
		sort(arr,low,high);
		
		for(int a: arr)
		System.out.print(a+" ");
		

	}

  static void sort(int arr[], int low, int high) 
    { 
		
		Lumuto l = new Lumuto();
		
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = l.partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 

}
