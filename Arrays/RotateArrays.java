/*
Rotate Array
Given an unsorted array arr[] of size N, rotate it by D elements (counter-clockwise). 

Input: 
The first line of the input contains T denoting the number of testcases. First line of eacg test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output:
For each testcase, in a new line, output the rotated array.

User Task:
The task is to complete the function rotate() which rotates the array by given D elements. The newline is automatically added by the driver code.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
Testcase 2: 2 4 6 8 10 12 14 16 18 20  when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.  
*/



class RotateArray
{
    static void rotateArr(int arr[], int d, int n)
    {
        /* add your code here
        while(d>0){
        int temp = arr[0];
        for(int i= 0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1] = temp;
        d--;*/                             // Takes Longer time
        
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
    }

    static void reverse(int arr[],int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    
}
