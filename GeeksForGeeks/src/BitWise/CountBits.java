package BitWise;

public class CountBits {
	
	public static void countBits(int num) {
		int count = 0;
		
		while(num > 0) {
			if(num%2 != 0 )
				count++;
			num/=2;
		}
		
		System.out.println(count);
	}
	
	public static void countBitsBrianKerningham(int num) {
		int count = 0;
		
		while(num > 0) {
			num &= (num-1);
			count++;
		}
		
		System.out.println(count);
	}
	
	public static void main(String as[]) {
	    countBits(5);
	    countBitsBrianKerningham(5);
	}

}
