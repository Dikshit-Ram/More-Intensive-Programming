/*
 * if the length of rod is zero it returns value zero
 * else we find out the highest value that can be obtained by looking at the various combinations 
 * of given length.
 */
public class BestCut {

	public static int BestCut(int [] price, int n)
	{
		
		if(n==0)				//if n is zero return zero
			return 0;
		int max = price[0];		//initialise max to first value
		for(int i =0;i<n;i++)
		{
			max = Math.max(max, price[i]+ BestCut(price,n-i-1));	//finds the best value for different
		}															//combinations
		return max;
	}
}