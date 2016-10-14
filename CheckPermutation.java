
public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="abc";
		String t = "acb";
		System.out.println(checkPermutated(s,t));
	}
/*
 * create 26 size int array
 * then increase value at respected index for first string and decrease for second string
 * at last check if the array has any non zero value if it doesnt have then its permutation of first one
 */
	public static boolean checkPermutated(String s, String t)
	{
		if(s.length()!=t.length()) return false;
		
		int [] arr = new int [26];
		for(int i=0; i<s.length();i++)
		{
			arr[s.charAt(i)-97]++;
			arr[t.charAt(i)-97]--;
		}
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]!=0) return false;
		}
		return true;
	}
}
