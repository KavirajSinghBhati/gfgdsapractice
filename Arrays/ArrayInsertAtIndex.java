import java.io.*;
import java.util.*;

class ArrayInsertAtIndex {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases-- > 0) {
		    int sizeOfArray = sc.nextInt();
		    int arr[] = new int[sizeOfArray];
		    for(int i = 0; i < sizeOfArray-1; i++) {
		        int x;
		        x = sc.nextInt();
		        arr[i] = x;
		    }
		    int index = sc.nextInt();
		    int element = sc.nextInt();
		    Solution obj = new Solution();
		    obj.insertAtIndex(arr,sizeOfArray,index,element);
		    for(int i = 0; i < sizeOfArray;i++) {
		        System.out.print(arr[i] + " ");   
		    }		    
		    System.out.println();
		}
	}
}

class Solution {
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element) {
        int arrSize = 0;
        for (int x : arr) {
            if (x != 0)
                arrSize++;
        }
        for(int i = arrSize - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
    }
}
