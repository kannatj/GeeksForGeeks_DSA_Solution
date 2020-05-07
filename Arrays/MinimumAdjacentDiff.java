/*


Minimum adjacent difference in a circular array
Given an array Arr of N integers arranged in a circular fashion. Your task is to find the minimum absolute difference between adjacent elements.

Input:
The input line contains T, denoting the number of testcases. Each testcase contains two lines. The first line contains N(size of array). The second line contains N elements of array separated by space.

Output:
For each testcase in new line print the minimum absloute difference.

User Task:
The task is to complete the function minAdjDiff() which returns the minimum difference between adjacent elements in circular array.

Constraint:
1 <= T <= 100
2 <= N <= 106
-106 <= Arr[i] <= 106

Example:
Input:
3
7
8 -8 9 -9 10 -11 12
8
10 -3 -4 7 6 5 -4 -1
8
-1 40 -14 7 6 5 -4 -1

Output:
4
1
0

Explanation:
Testcase 1: The absolute difference between adjacent elements in the given array are as such: 16 17 18  19 21 23 4(first and last). Among the calculated absolute difference the minimum is 4.
Testcase 2: The absolute difference between adjacent elements in the given array are as such: 13 1 11 1 1 9 3 11(first and last). Among the calculated absolute difference, the minimum is 1.
Testcase 3: The absolute difference between adjacent elements in the given array are as such: 41 54 21 1 1 9 3 0(first and last). Among the calculated absolute difference, the minimum is 0.


*/

class Difference{
    
    // Function to find minimum adjacent difference
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
        
        int min = Math.abs(arr[0]-arr[n-1]);
        for(int i=0;i<n-1;i++){
            int res = Math.abs(arr[i]-arr[i+1]);
            if(res < min)
              min = res;
        }
        
        return min;
    }
}
