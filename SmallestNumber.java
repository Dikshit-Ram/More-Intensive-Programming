/*
 * we search from start the position in array where the next value is less than the present value
 * since the array is sorted, that position will be the least value in array
 * completes in O(n) time
 */
public class SmallestNumber {

	public static int findkthlargest(int [] a)
	{
		int i=1;
		for(i=1;i<a.length;i++)
		{
			if(a[i]<a[i-1])
				break;
		}
		return a[i];
	}
}
