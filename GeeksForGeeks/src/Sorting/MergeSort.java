package Sorting;

public class MergeSort {

	public static void sort(int arr[], int l, int n) {
		if (l < n) {
			int mid = l + (n - l) / 2;
			sort(arr, l, mid);
			sort(arr, mid + 1, n);
			merge(arr, l, mid, n);
		}
	}

	public static void merge(int arr[], int l, int m, int r) {

		int len1 = m - l + 1;
		int len2 = r - m;

		int L[] = new int[len1];
		int R[] = new int[len2];

		for (int i = 0; i < len1; i++)
			L[i] = arr[l+i];

		for (int j = 0; j < len2; j++)
			R[j] = arr[m+j+1];
		
		int i=0,j=0;
		int k = l;
		
		while(i<len1 && j<len2){
			if(L[i]<=R[j]) {
				arr[k++] = L[i++];
			}
			else {
				arr[k++] = R[j++];
			}
		}
		
		while(i<len1) {
			arr[k++] = L[i++];
		}
		
		while(j<len2) {
			arr[k++] = R[j++];
		}

	}
	
	
	public static void main(String as[]) {
		int arr[] = {10,2,34,4,8,11,12};
		int len = arr.length-1;
		
		sort(arr,0,len);
		
		for(int i: arr) 
			System.out.println(i);
	
	}
}
