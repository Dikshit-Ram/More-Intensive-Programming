
public class TestKthLargest {

	public static void main(String[] args)
	{
		int a [] ={1,2,4,11,15,25};
		int k = 6;				//kth largest
		int res = a.length-k+1;
		int first = 0;
		int last = a.length-1;
		int r = Kthelement.findkthlargest(a,first,last,res);
		System.out.println(r);
	}
}
