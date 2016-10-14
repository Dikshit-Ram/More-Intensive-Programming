import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
				
		ArrayList<ArrayList<Integer>> result = getPascalTri(5);		
		
		for (int i = 0; i < result.size(); i++)
		{		
			System.out.println(result.get(i).toString());
		}
	}

	public static ArrayList<ArrayList<Integer>> getPascalTri(int nrows)  // function to generate the Pascal Triangle
	{
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();	//create a returning arraylist
		
		if (nrows < 1) return ret;				//if numrows is less than 1 then return empty arraylist
		
		for (int i = 1; i <= nrows; i++)		
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();		//create temporary arraylist
			if(i == 1)												//if it is the first row then add 1
			{														//temporary arraylist
				temp.add(i);
				ret.add(temp);										//then add temp arraylist to returning list
				continue;											//skip the rest of code
			}
			
			ArrayList<Integer> cur = ret.get(i-2);				//create another list cur and add the before row to it
			
			temp.add(cur.get(0));    							//add first row of cur to temp
			
			for (int k = 1; k < cur.size(); k++)
			{
				temp.add(cur.get(k-1) + cur.get(k));			//add elements to temp by adding the previous row 
			}													//same indexed element and the element before it
																//from same row
								
			temp.add(cur.get(cur.size()-1));					//add that to temp
			
			ret.add(temp);										//add this to ret
		}
		return ret;												//return ret
	}	
}
