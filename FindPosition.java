/*
 * the recurssion continues until we get two elements in which one is greater and other is less than
 * in that time the following cases occur
 * it discards half array at one time
 * if it is the first element then just return left index
 * if it is right most index then return right index
 * if it is in between two then return left+1 index
 */


public class FindPosition {

	
	public static int positionFind(int a[],int left, int right,int tar)
	{
		int pos;
		
		//int finalval = a[right];
		if(left-right==0 && tar <= a[right])		//this means the element is less than max element in array											
			return left;
		
		else if(left-right==0 && tar > a[right])	//when the target is larger than all elements
			return left+1;
		else if(tar == a[(left+right)/2])			//when tar is equal to mid element
			return a[(left+right)/2];
		else if(tar < a[(left+right)/2])			//discard right half of array
			return positionFind(a,left,(left+right)/2,tar);
		else if(tar > a[(left+right)/2])			//discard bottom half of array
			return positionFind(a,(left+right)/2+1,right,tar);
	
		
		
		
		
			return -1;				// because it prompts me to use a return statement
	}

}
