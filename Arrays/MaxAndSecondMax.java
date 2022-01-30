import java.io.*;
import java.util.*;

class Solution{
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        int max = -1, secondMax = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : arr) {
            if (x > max)
                max = x;
        }
        for (int x : arr) {
            if (x > secondMax && x < max) 
                secondMax = x;
        }
        list.add(max);
        list.add(secondMax);
        return list;
    }
}

class MaxAndSecondMax {
  
	public static void main (String[] args) throws IOException{
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
      
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    Solution obj = new Solution();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.largestAndSecondLargest(sizeOfArray, arr);
		    System.out.println(res.get(0) + " " + res.get(1) );
		}
	}
} 
