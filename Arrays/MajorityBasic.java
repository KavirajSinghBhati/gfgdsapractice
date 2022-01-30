import java.io.*;
import java.util.*;

class MajorityBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr[i] = x;
            }

            int x = sc.nextInt(); 
            int y = sc.nextInt(); 

            Solution obj = new Solution();
            System.out.println(
                obj.majorityWins(arr, n, x, y));
        }
    }
}

class Solution {
    public int majorityWins(int arr[], int n, int x, int y) {
        int countX = 0, countY = 0;
        for (int ele : arr) {
            if (ele == x)
                countX++;
            else if (ele == y)
                countY++;
        }
        if (countX > countY)
            return x;
        else if (countY > countX)
            return y;
        else return Math.min(x, y);
    }
}
