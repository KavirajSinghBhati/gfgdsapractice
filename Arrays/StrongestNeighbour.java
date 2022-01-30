import java.io.*;
import java.util.*;

class Solution {
    static void maximumAdjacent(int sizeOfArray, int arr[]) {
        for (int i = 1; i < sizeOfArray; i++) {
            int max = arr[i] > arr[i - 1] ? arr[i] : arr[i - 1];
            System.out.print(max + " ");
        }
    }
}

class StrongestNeighbour {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0) {
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++)  {
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    Solution obj = new Solution();
		    obj.maximumAdjacent(sizeOfArray, arr);
		    System.out.println();
		}
	}
}
