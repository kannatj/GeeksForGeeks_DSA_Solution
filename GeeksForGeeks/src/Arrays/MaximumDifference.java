package Arrays;

public class MaximumDifference {
	
	public static int findMaxDiff(int arr[],int n) {
		int max = 0;
		     
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				 int res = arr[j] - arr[i];
				 if(res > max) {
					 max = res;
				 }
			}
		}
		return max;
	}
	
	
	public static int findMaxDiffEff(int arr[],int n) {
		
		int minVal = arr[0];
		int res = arr[1] - arr[0];
		
		for(int j=1;j<n;j++) {
			res = Math.max(res, arr[j]-minVal);
			minVal = Math.min(minVal, arr[j]);
		}
		
		return res;
	}
	
	
	
	public static void main(String as[]) {
		
		int arr[] = {2,3,10,6,4,8,1};
		int result = findMaxDiffEff(arr,arr.length);
		System.out.println(result);
	}

}
