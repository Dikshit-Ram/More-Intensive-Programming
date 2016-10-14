import java.util.Stack;

public class AscendingOrderStack {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);	st.push(8); st.push(5);st.push(7);
		System.out.println(st.toString());
		asc(st);
		
	}


	public static void asc(Stack<Integer> s1)
	{
		if(s1.isEmpty()) return;
		int cmp1,cmp2;
		Stack<Integer> s2 = new Stack<Integer>();
		while(s1.size()>1)
		{
			cmp1 = (int) s1.pop();
			cmp2 = (int) s1.peek();
			if (cmp1 <= cmp2)	
				{
				s2.push(cmp1);
				}
			else	
				{
				s2.push(s1.pop());
				}
			
		}
		System.out.println(s2.toString());
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		System.out.println(s1.toString());
	}

}
