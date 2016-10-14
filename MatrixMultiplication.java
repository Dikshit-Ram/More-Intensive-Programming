import java.util.*;
public class MatrixMultiplication {


	public static void main(String[] args)
	{
		int A[][] = {{1,2},
					 {3,4}};					//initialize one array
		int B[][] = {{2,2},
					  {2,2}};					//initialize second array
		
		
		int C[][] = new int[A[0].length][A.length];	//create an array to store the matrix multiplication
		
		int row = 0;								//initialise row variable
		int column = 0;								//initialise column variable
		
		
		while(row < A.length)						//performs action in the loop for each row
		{
			while(column < B.length)				//performs action in the loop for each column
			{
				int sum = 0;							//initialise sum to zero
				for(int ri = 0; ri < A[0].length; ri++)	
				{
					sum += A[row][ri]*B[ri][column];	//multiplication matrix logic
				}
				C[row][column] = sum;					//store the sum in element
				column++;								//increase to next column
			}
			row++;										//increase row variable
			column = 0;									
		}	
		
		System.out.println(Arrays.deepToString(C));		//prints array
	}
}

