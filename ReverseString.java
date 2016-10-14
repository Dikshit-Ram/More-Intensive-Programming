/*
 * base case here is if it is the first character then print out
 * recursive case is call recursion by sending the same string but decreasing the length by one
 */
public class ReverseString {

	public static char reverseString(String str, int l)
	{
		if(l==0)
			return str.charAt(0);		//prints char at that point
		else							//recursive function
		{
			System.out.print(str.charAt(l-1));
			return reverseString(str,l-1);
		}
	}
}
