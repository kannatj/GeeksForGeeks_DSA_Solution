package Arrays;

public class MaximumConsicutive1 {
	
	static int findMaxCons(int arr[],int n) {
		int max = 0;
		int count = 1;
		
		for(int i=0;i<n - 1 ;i++) {
			if(arr[i] == 1 && arr[i+1] == 1) {
				count++;
			}
			else if ((arr[i] == 1 & arr[i+1]!=1) ) {
		               if(count > max) {
		            	   max = count;
		               }
		               count = 1;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,1,1,1,1,1,0,1,1};
		
		int maxCons1 = findMaxCons(arr,arr.length);
		
		System.out.println(maxCons1);

	}

}
