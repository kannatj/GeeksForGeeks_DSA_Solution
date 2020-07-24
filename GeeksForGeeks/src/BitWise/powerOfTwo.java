package BitWise;

public class powerOfTwo {

	public static void powerOfTwoNative(int num) {
		if(num == 0 )
			System.out.println("No");
		
		while(num != 1) {
			if(num %2!=0) {
				System.out.println("No");
			    return;
			}
			
			num/=2;
			
		}
		
		System.out.println("Yes");
	}
	
	
	
	public static void powerOfTwoSetBit(int num) {
		if(num == 0)
			System.out.println("False");
		
		boolean result = ((num & (num-1))==0);
		System.out.println(result);
			
	}
	
	public static void main(String as[]) {
		//powerOfTwoNative(12);
		powerOfTwoSetBit(8);
	}
}
