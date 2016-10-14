/*
 * the base cases here is that we can get to final step by taking 1 or 2 or 3 or 4 steps
 * so the ways to get to final step if we take 1 or 2 or 3 or 4 is base case
 * recursive function is adding the ways of 1 step or 2 steps or 3 or 4
 */
public class ClimbStairs {

	public static long getSteps(int number)
	{
		
		if(number == 1||number == 2 )			//if number is 1 or 2 then return 1 or 2 respectively
		{
			
			return number;
		
		}
		else if (number == 4)
		{
			return 8;
		}
		else if( number ==3)					//if it is 3 then return 4
		{
			
			return 4;
		}	
		else									//for bigger iterations use recursion
		{
			
			return getSteps(number-1)+getSteps(number-2)+getSteps(number-3)+getSteps(number-4);
			 
		}
	}
}
