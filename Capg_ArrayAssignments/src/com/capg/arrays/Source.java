package com.capg.arrays;
import java.util.*;

public class Source {
	// A recursive binary search
    // function. It returns location
    // of x in given array arr[l..r]
    // is present, otherwise -1
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r < l)
            return -1;
 
        int mid = l + (r - l) / 2;
 
        // If the element is present
        // at the middle itself
        if (arr[mid] == x)
            return mid;
 
        // If element is smaller than
        // mid, then it can only be
        // present in left subarray
        if (arr[mid] > x)
            return binarySearch(arr, l,
                                mid - 1, x);
 
        // Else the element can
        // only be present in
        // right subarray
        return binarySearch(arr, mid + 1, r, x);
    }
 
    // Returns number of times x
    // occurs in arr[0..n-1]
    static int findElementCount(int arr[],
                                int n, int x)
    {
        int ind = binarySearch(arr, 0,
                               n - 1, x);
 
        // If element is not present
        if (ind == -1)
            return 0;
 
        // Count elements on left side.
        int count = 1;
        int left = ind - 1;
        while (left >= 0 &&
               arr[left] == x)
        {
            count++;
            left--;
        }
 
        // Count elements
        // on right side.
        int right = ind + 1;
        while (right < n &&
               arr[right] == x)
        {
            count++;
            right++;
        }
 
        return count;
    }
 
 
    // Driver code
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++) {
        	arr[i] = sc.nextInt();
        }
        int n = arr.length;
        int x = sc.nextInt();
        System.out.print(findElementCount(arr, n, x));
    }
}
