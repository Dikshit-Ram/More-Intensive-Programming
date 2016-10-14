/*
 * fill first row and column with value 1 because if the target is in first row or column
 * it would take just one step to reach it
 * for others fill table with values such that for [i][j] will have value [i-1][j]+[i][j-1]
 * this is nothing but recusrion formula only.
 */
public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(robot(4,4));			//calling function
	}

	public static int robot(int m, int n)
	{
		int [][] arr = new int[m][n];			//array is created to fill values
		for(int i =0;i<arr[0].length;i++)		//fill first row and column with value 1
		{
			arr[i][0] = 1;
			arr[0][i] = 1;
		}
		for(int i=1;i<arr[0].length;i++)		//fill other values correspondingly 
		{										//using recursion function
			for(int j=1;j<arr.length;j++)
			{
				arr[i][j] = arr[i-1][j]+arr[i][j-1];
			}
		}
		return arr[m-1][n-1];
	}
}
