package Arrays;

public class MedianOfTwoSorttedArrays {

	
  static double findMedian(int arr1[],int arr2[]) {
	
	  int m=0,n=0;
	  int i = len(arr1);
	  int j = arr2.length;
	  int len =i+j;
	  
	  int result[] = new int[len];
	  int k=0;
	  
	  while(m<i && n <j ) {
		  
		      if(arr1[m]<arr2[n]) 
				result[k++] = arr1[m++];
		      
			  else
				  result[k++] = arr2[n++];     			  
	  }
	  
	  while(m<i) 
		  result[k++] = arr1[m++];
	  
	  while(n<j)
		  result[k++] = arr2[n++];
	  
	  
	  int mid = (result.length-1)/2;
	  
	  if((len)%2==0) 
		  return (((double)result[mid]+(double)result[mid+1])/2);
	  else 
		  return result[mid];
  }
  
  
    static int len(int arr[]) {
    	int i = 0;
    	int len = 0 ;
    	while(arr[i++] !='\0') {
    		len++;
  
    	}
    	
    	return len;
    }
  
  public static void main(String as[]) {
	 
	  int arr2[] = {1,3,4,6};
	  int arr1[] = {2,5,7,8};
	  
	  double result = findMedian(arr1,arr2);
	  
	  System.out.println();
	  
	  System.out.println(result);
  }
}
