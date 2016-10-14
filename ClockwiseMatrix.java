import java.util.Arrays;

public class ClockwiseMatrix {

	
	public static void main(String[] args)
	{
		int n = 2;						//give the array size
		printArray(n);					//printArray method called
	}
	
	public static void printArray(int n)	
	{	
		int arr[][] = new int[n][n];		// creates array with nxn size
		
		int left = 0;						//give references left, right, top, bottom
		int right = arr[0].length;			// which point to edges of matrix
		int top = 0;
		int bottom = arr.length;
		int num = 1;						//take a variable and initialise it to one
		
		while(left < right && top < bottom) //continue till condition satisfies
		{
			for(int i = left; i<right;i++)		//sets array values in top row from left to right
			{
				arr[top][i]= num;
				num++;							// increment the variable 
			}
			top++;								// now that first row is created increase top row reference	
			if(top >= bottom)					//if top reference meets bottom then skip the execution
				break;
			
			
			for(int i=top; i<bottom;i++)		//set array values from top to bottom in the right line
			{
				arr[i][right-1]= num;			
				num++;							//increase the num
			}
			right--;							//decrease right reference since its values are already set.
			if(left >= right) 					
				break;
			
			
			for(int i = right-1; i>=left;i--)		//sets values of bottom line
			{
				arr[bottom-1][i]=num;
				num++;
			}
			bottom--;								// decrease the bottom most row index
			if(top >= bottom) 
				break;
			
			
			for(int y = bottom-1;y>=top;y--)		//sets values of right line
			{
				arr[y][left]= num;
				num++;
			}
			left++;
		}
	
		System.out.println(Arrays.deepToString(arr)); 	//print array
	}
}
