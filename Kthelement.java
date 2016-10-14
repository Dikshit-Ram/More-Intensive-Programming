/*
 * I tried to select a pivot and then partition array using it
 * and after partitioning it checks if thats the position of element we want
 * if not then one half of array is discarded and the process continues recursively
 */
public class Kthelement {

	
	
	public static int findkthlargest(int [] a,int first, int last, int k)
	{
		int pivot = a[last];
		int l= first;
		int r = last;
		int temp;
		int pos =0;
		if(k>a.length)				//if k is greater than array length , then return -1
			return -1;
		while(l <=r)				//partitioning of array by selecting a pivot
		{
			while(a[l]<pivot && l <r)		//find l greater than pivot
			{
				l++;
			}
			while(a[r]>=pivot && l<r)		//find r less than pivot
			{
				r--;
			}
			if(l==r)
			{
				break;
			}
			else						//swap them
			{
				temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				
			}
		}
		
		
		if(k==l+1)
			return pivot;			//if k is the pivot 
		else if(k< l+1)
			return findkthlargest(a,first,l-1,k);	//discard right half
		else 										
			return findkthlargest(a,l+1,last,k);	//discard left half
		
		
	}
	
	
}
