import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    public static int minAdjDiff(int arr[], int n) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int minDiff = Math.abs(arr[i] - arr[i + 1]);
            res = Math.min(res, minDiff);
        }
        return Math.min(res, Math.abs(arr[n - 1] - arr[0]));
    }
}

class MinimumAdjacentDifference {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-->0) {
		    int n = Integer.parseInt(br.readLine().trim());
		    
		    int arr[] = new int[n];
		    
		    String inputLine[] = br.readLine().trim().split(" ");

		    for(int i=0; i<n; i++) {
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.minAdjDiff(arr, n));
		}
	}
}
