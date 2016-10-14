import java.util.ArrayList;
import java.util.StringTokenizer;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hey what are";
		System.out.println(removeSpaces(s));
	}

	public static String removeSpaces(String s)
	{
		ArrayList<String> str = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			str.add(st.nextToken());
		}
		String res = "";
		for(int i =0; i<str.size();i++)
		{
			if(i==str.size()-1)
				res += str.get(i);
			else
				res += str.get(i)+"%20";
		}
		return res;
	}
}
