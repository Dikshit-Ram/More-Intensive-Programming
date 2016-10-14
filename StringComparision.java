
public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ab";
		System.out.println(compare(s));
	}

	public static String compare(String s)
	{
		int [] arr = new int[26];
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)-97]++;
		}
		String res ="";
		for(int i=0;i<26;i++)
		{
			if(arr[i]==0)
				continue;
			res += (char)(97+i)+""+arr[i];
		}
		
		if(res.length()<=s.length())
			return res;
		else 
			return s;
	}
}
