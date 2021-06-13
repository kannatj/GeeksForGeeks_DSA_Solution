package Recursion;

public class PrintN {
	
	/*
	 * Print 1 to n
	 */
	
	public void fun1(int n, int k) {
		if (n == 0)
			return;
		System.out.println(k);
		fun1(n - 1, k + 1); // Tail Recursion way to print 1 to n
	}

	public void fun2(int n) {
		if (n == 0)
			return;
		fun2(n - 1);
		System.out.println(n); // normal recursion way to print 1 to n
	}
	
     /*
      * Print n to 1
      */
	public void fun3(int n) {
		if (n == 0)
			return;
		System.out.println(n); //Recursion way to print n to 1 - Tail recursion
		fun3(n - 1);

	}
	
	public static void main(String[] args) {
		PrintN t1 = new PrintN();
		// t1.fun1(1000, 1);
		//t1.fun2(1000);
		t1.fun3(1000);
	}
}
