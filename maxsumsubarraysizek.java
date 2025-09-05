/*Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.

Examples:

Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum.
Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Output: 39
Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
Input: arr[] = [100, 200, 300, 400], k = 1
Output: 400
Explanation: arr3 = 400, which is maximum.*/

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int max_sum=0;
        int i;
        int n=arr.length;
        for( i=0;i<k;i++)
        {
            max_sum+=arr[i];
            
        }
        int window_sum=max_sum;
        for( i=k;i<n;i++)
        {window_sum+=arr[i]-arr[i-k];
        max_sum=Math.max(max_sum,window_sum);
            
            
        }
        return max_sum;
    }
}
