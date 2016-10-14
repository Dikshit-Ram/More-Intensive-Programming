/*
 * If the goal is in the same row or column as initial row then it is just one way
 * else it is the sum of ways to get to row-1 and column-1
 */
public class UniquePath {

	public static int getUnique(int m,int n)
	{
		if(m==1 || n ==1)
			return 1;
		else
			return getUnique(m,n-1) + getUnique(m-1,n);   	//find ways to get to above and left of box
	}
}
