package Arrays;

public class MaximumEvenOddSubArray {
    
	public static int findMaxEvenOdd(int arr[],int n) {
		
		int count = 1;
		
		for(int i =0;i<n-1;i++) {
			if((arr[i]%2 == 0 && arr[i+1]%2!=0) || (arr[i]%2 != 0 && arr[i+1]%2==0)) {
				   count++;
			}
		
			else{
				count = 1;
			}
		}
		
	
		
		return count;
	}
	
	
	public static void main(String as[]) {
		int arr[] = {5,10,20,6,3,8};
	
		int result = findMaxEvenOdd(arr,arr.length);
		
		System.out.println(result);
	}
}
