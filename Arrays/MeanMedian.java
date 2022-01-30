import java.io.*;
import java.util.*;
class MeanMedian {    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
		    Solution obj=new Solution();
		    int N;
		    N=sc.nextInt();
		    int a[]=new int [N];
		    for(int i=0;i<N;i++) {
		        int x=sc.nextInt();
		        a[i]=x;
        }
		    System.out.println(obj.mean(a,N)+" "+obj.median(a,N));  
		}	
	}
}

class Solution {
  public int median(int A[],int N) {
       Arrays.sort(A);
       if (N % 2 != 0) 
          return A[N / 2];
       else
          return (int)Math.floor((A[(N - 1) / 2] + A[N / 2]) / 2);
    }
    public int mean(int A[],int N) {
       int sum = 0;
       for (int x : A) 
           sum += x;
       return sum / N;           
    }
}
