/*
 * here we are sending intial and final positions
 * now in each step we use recursion 
 * we add those positions to list from where we can go to final position
 * and then find positions to go that positions.
 * similarly we add before position to reach that position and finally we call print() method.
 */
import java.util.*;

public class UniquePathFollowUp {
	static ArrayList<String> paths = new ArrayList<String>();

	public static long getUnique(int m, int n, int i, int j, String pathlist)
    {

        pathlist += ("(" + i + ", " + (j) + ") => ");

        if(m == i && n == j)
        {       
            paths.add(pathlist);  //adds position to list
        }

        if( i > m || j > n)
        {
            return 0;               
        }

        return getUnique(m, n, i+1, j, pathlist)+getUnique(m, n, i, j+1, pathlist); 	//recursive case

    }
	
	public static void print()
	{
		for (int i = paths.size()-1; i>=0; i--)
        {
         System.out.println( "  " + paths.get(i)); 	//print paths
        }

	}
}
