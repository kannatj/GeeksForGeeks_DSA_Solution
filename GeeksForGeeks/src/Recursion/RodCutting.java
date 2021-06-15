package Recursion;

import java.lang.Math;

public class RodCutting {
	int maxcut(int n, int a, int b, int c) {
		if (n == 0)
			return 0;
		if (n < 0)
			return -1;

		int res = (Math.max(maxcut(n - a, a, b, c), Math.max(maxcut(n - b, a, b, c), maxcut(n - c, a, b, c))));  //Math.max will take only two parameters

		if (res == -1)
			return -1;                    //If no cuts
		else
			return res+1;                 //If cut is there it will return 0 so adding 1 to make it count

	}

	public static void main(String[] args) {
		RodCutting r1 = new RodCutting();
		int cuts = r1.maxcut(23, 11, 9, 12);
		System.out.println(cuts);
	}
}
