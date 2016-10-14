import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		//System.out.println(arr[2][1]);
		rotateMatrix(arr,3);
	}

	public static void rotateMatrix(int [][] a, int n)
	{
		int top = 0,bottom = n-1,left =0,right =n-1,temp;
		while(top< bottom && left < right)
		{
			for(int i =0; i<n-1;i++)
			{
				temp = a[top][i];
				a[top][i] = a[n-1-i][left];
				a[n-1-i][left]= a[bottom][n-1-i];
				a[bottom][n-1-i]= a[i][right];
				a[i][right] = temp;
			}
			top++;left++;bottom--;right--;
		}
		System.out.println(Arrays.deepToString(a));
	}
}
