package Arrays;

public class MaximumSubArray {
	
	public static int maxSubArr(int arr[],int n) {
		
		int sum ,max = arr[0];
		
		for(int i=0;i<n;i++) {
			sum = 0;
			
			for(int j=i;j<n;j++) {
				sum+=arr[j];

				//System.out.println(sum);
				
				if(sum>max)
					max = sum;
			}
		}
		
		return max;
	}
	
	
	public static int kadanesAlgo(int arr[],int n) {
		
		int res = arr[0];
		int maxEnding = arr[0];
		
		for(int i =1;i<n;i++) {
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			res = Math.max(res, maxEnding);
		}
		
		return res;
	}
	
	
	public static void main(String as[]) {
		//int arr[] = {2,3,-8,7,-1,2,3,4};
		//int arr[] = {5,8,3};
		//int arr[] = {-3,8,-2,-24,-5,26};
		  int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		//int result = kadanesAlgo(arr,arr.length);
		
		  int result = maxSubArr(arr,arr.length	);
		  
		System.out.println(result);
	}

}
