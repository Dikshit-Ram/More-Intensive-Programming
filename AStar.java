import java.util.*;
import java.lang.*;

public class AStar {
        
	//finding minimum f(n) 
	
	public static double minValue(double [] F_value, int [] gn)
	{
		double min =  F_value[0];
		boolean flag = false;
		for(int i =0; i< F_value.length;i++)
		{
			double F_present_value =  F_value[i];			//selects node that has min f(n) value out of non
			for(int j = 0;j<gn.length;j++)					//selected nodes
			{
				if(gn[j]==i)
				flag = true;
			}
			if(min >= F_present_value && flag==false)		//gets us the minimum f(n) value for the list
			{
				min = F_present_value;
			}
			flag = false;
		}
		
		return min;
	}
	
	//finding the minimum f(n) position in the array
	//we use a flag to check if the node is already visited
	//and is only selected when it is not visited
	public static int minValuePosition(double [] F_value, double min, int [] generatedNodes)
	{
		int position=0;
		double F_present_value =  F_value[0]; 
		boolean flag = false;
		
		for(int i = 0;i<F_value.length;i++)
		{
			F_present_value =  F_value[i]; 	//parsing into double
			for(int j = 0;j<generatedNodes.length;j++)
			{
				if(generatedNodes[j]==i)
					flag = true;
			}
			if(F_present_value == min && flag==false)						//finding minimum f(n) node
			{
				position = 0;
				position = i;
				break;
			}
			flag = false;
		}	
		return position;
	}
	
	public static char selectNode(int position)
	{
		
		char Node ='F';
		if (position%6==0)											//selecting the next node
		{
			Node = 'S';
			
		}	
		else if(position%6==1)
		{
			Node = 'B';
			
		}
		else if (position%6==2)
		{
			Node = 'C';
			
		}
			
		else if(position%6==3)
		{
			Node = 'D';
		}
				
		else if(position%6==4)	
		{
			Node = 'E';
			
		}		
		else if(position%6==5)
		{
			Node = 'G';
			
		}
		return Node;
		
	}
        public static void main(String[] args) {
                
                double S[] = {999,8,13,5,999,999};	//keeping 999 to out of reach nodes and
                double B[] = {8,999,2,2,3,999};	//999 distance from node to node itself
                double C[] = {13,2,999,9,8,1};
                double D[] = {5,2,9,999,11,999};
                double E[] = {999,3,8,11,999,2};
                double G[] = {999,999,1,999,2,999};
                
                double H[] = {0,0,0,0,0,0};
                
               
                int gn [] = new int [15];
                double F []= new double [100];
                int round = 0;
                double val = 0;
                int gc = 0;
                
                boolean flag = false;
                char NS = 'S';
                System.out.println("Starting NODE -"+NS+"\n");
                
                int pos = 0;
                double min = 0;
                
                for(int i=0;i<F.length;i++)
                {
                	F[i] = 9999;
                }
                
                for(int i =0;i<gn.length;i++)
                {
                	gn[i] = 99999;
                }
                
                
                while(NS!= 'G' )
                {
                	
                if(NS=='S')
                {
                        
                        //adding
                        for(int i = round ;i<S.length+round;i++)
                        {
                            if(i%6==pos%6)
                            	F[i] = 999;
                        	F[i] = H[i%6]+S[i%6]+val;                                
                        }
                       
                	
                        min = minValue(F,gn);
                        pos = minValuePosition(F,min,gn);
                	
                        gn[gc]=pos;
                        
                        NS = selectNode(pos);
                        
                        
                        System.out.println("NODE Selected-"+NS+"\nf(n) = g(n)+h(n)\n\t="+min);
                        val = min-H[pos%6];
                }
                
                             
                else if(NS=='B')
                {
                    
                    //adding
                    for(int i = round ;i<B.length+round;i++)
                    {
                    	if(i%6==pos%6)
                        	F[i] = 999;    
                    	F[i]= H[i%6]+B[i%6]+val;
                    }
                    
                    
                    min = minValue(F,gn);
                    pos = minValuePosition(F,min,gn);
                    gn[gc]=pos;
                    NS = selectNode(pos);
                    System.out.println("NODE Selected-"+NS+"\nf(n) = g(n)+h(n)\n\t="+min);
                    val = min-H[pos%6];
            }
                
                
                else if(NS=='C')
                {
                    
                    //adding
                    for(int i = round ;i<C.length+round;i++)
                    {
                    	if(i%6==pos%6)
                        	F[i] = 999;    
                    	F[i] = H[i%6]+C[i%6]+val;
                    }
                                        
                    min = minValue(F,gn);
                    pos = minValuePosition(F,min,gn);
                    gn[gc]=pos;
                    NS = selectNode(pos);
                    
                    System.out.println("NODE Selected-"+NS+"\nf(n) = g(n)+h(n)\n\t="+min);
                    val = min-H[pos%6];
            }
                
               
                else if(NS=='D')
                {
                    for(int i = round ;i<D.length+round;i++)
                    {
                    	if(i%6==pos%6)
                        	F[i] = 999;
                    	F[i] = H[i%6]+D[i%6]+val;
                    }
                    
                    
                    
                    min = minValue(F,gn);
                    pos = minValuePosition(F,min,gn);
                    
                    gn[gc]=pos;
                    NS = selectNode(pos);
                    
                    System.out.println("NODE Selected-"+NS+"\nf(n) = g(n)+h(n)\n\t="+min);
                    val = min-H[pos%6];
            }
                
               
                else if(NS=='E')
                {
                    
                    //adding
                    for(int i = round ;i<E.length+round;i++)
                    {
                    	if(i%6==pos%6)
                        	F[i] = 999;    
                    	F[i]= H[i%6]+E[i%6]+val;
                    }
                    min = minValue(F,gn);
                    pos = minValuePosition(F,min,gn);
                    
                    gn[gc]=pos;
                    NS = selectNode(pos);
                    
                    System.out.println("NODE Selected-"+NS+"\nf(n) = g(n)+h(n)\n\t="+min);
                    val = min-H[pos%6];
            }

                  
                else if(NS=='G')
                {
                    
                    												//adding f(n) values
                    for(int i = round ;i<G.length+round;i++)
                    {
                    	if(i%6==pos%6)
                        	F[i] = 999;    
                    	F[i]= H[i%6]+G[i%6]+val;
                    }
                    
                    
                    min = minValue(F,gn);							//finding min value
                    pos = minValuePosition(F,min,gn);				//finding position of min value
                    
                    gn[gc]=pos;
                    NS = selectNode(pos);							//selecting next node
                    
                    System.out.println("NODE Selected-"+NS+"\nf(n) = g(n)+h(n)\n\t="+min);
                    val = min-H[pos%6];
            }
                
                
                
                round = round +6;
                gc++;
               
                }
               
        }
}