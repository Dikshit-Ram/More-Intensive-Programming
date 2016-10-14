import java.lang.*;
public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdep";
		System.out.println(checkUnique(str));
	}
/*
 * create array of size 26 and assume that the string has all small letters
 * fill the array index by increasing the array value at places where an alphabet is discovered
 * and after filling the string in array now go through array to see if there is any 2 in the string
 * if there is any place with 2 then an alphabet is repeated
 */
	public static boolean checkUnique(String s)
	{
		int [] arr = new int [26];
		for(int i=0; i<s.length(); i++)
		{
			arr[s.charAt(i)-97]++;
			if(arr[s.charAt(i)-97]==2) return false;
		}
		
		return true;
	}
}
