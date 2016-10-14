/*
 Each element of String array is checked and if it is not an operator
 then it is pushed to stack
 when an operand(+,/,-,*) comes then the elements are popped out doing the mathematical calculation
 */


import java.util.Stack;

public class RPN {

	
	
	public static double RPN(String[] a)
	{
		
		String plus = "+";
		String div = "/";
		String neg = "-";
		String mul = "*";
		
		
		Stack<Double> st = new Stack<Double>();
		
		int l;
		double val =0 ;
		for(int i=0;i<a.length;i++)
		{
			l = st.size();
			if(a[i].equalsIgnoreCase(plus))
			{
				val = 0;
				for(int j = 0; j <l; j++)
				{
					
					val += st.pop();
				}
				st.push(val);
				l = st.size();
			}
			else if(a[i].equalsIgnoreCase(neg))
			{
				val = 0;
				for(int j = 0; j <l; j++)
				{
					
					val = val- st.pop();
				}
				st.push(val);
				l = st.size();
			}
			else if(a[i].equalsIgnoreCase(mul))
			{
				val = 0;
				double c,b;
				
					c = st.pop();
					b = st.pop();
					val = b*c;
					
				
				st.push(val);
				l = st.size();
			}
			else if(a[i].equalsIgnoreCase(div))
			{
				val = 0;
				double c,b;
				
					
					c = st.pop();
					b = st.pop();
					val = b/c;
				
				st.push(val);
				l = st.size();
			}
			else
			{
				st.push(Double.parseDouble(a[i]));
				l = st.size();
			}
			
		}
		
		
		
		return val;
	}

}
