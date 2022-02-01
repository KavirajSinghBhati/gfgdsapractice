# Notes for some particular problems

## Maximum occured integer in n ranges : HashMap solution

``` java
import java.io.*;
import java.util.*;
import java.lang.*;

class Main {

    	public static void main (String[] args) throws IOException{
    	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int L[] = new int[n];
		    int R[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    for(int i=0; i<n; i++){
		        L[i]=Integer.parseInt(inputLine[i]);
		    }
        
		    inputLine = br.readLine().trim().split(" ");
		    int maxx = Integer.MIN_VALUE;
		    for(int i=0; i<n; i++){
		        R[i]=Integer.parseInt(inputLine[i]);
		        if(R[i] > maxx){
		            maxx=R[i];
		        }
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.maxOccured(L, R, n, maxx));
		}
	}
	
}

class Solution{
    public static int maxOccured(int L[], int R[], int n, int maxx){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = L[i]; j <= R[i]; j++) {
                hm.put(j, hm.getOrDefault(j, 0) + 1);
            }
        }
        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            maxFreq = Math.max(maxFreq, e.getValue());
        }
        return maxFreq;
    }
}

```
