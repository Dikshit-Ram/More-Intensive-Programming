/*
 * I just tried to construct a table and fill it using the base values I have
 * and from the step 5 I need only 4 values before that array index and by using
 * recursion function I filled all the array index.
 */
import java.util.*;
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(climbingStairsDP(20));		//function called
	}

	
	public static long climbingStairsDP(int n)	
	{
		
		long arr [] = new long [n];				//creating array of n length
		
		arr[0] = 1;								//filling the base cases in appropriate index
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 8;
		
		for(int i =4 ; i<n; i++)				//filling remaining indexes using recursion formula
		{
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3]+arr[i-4];
		}
		
		return arr[n-1];
	}
}
