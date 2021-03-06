import java.util.Arrays;

public class Perceptron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double initial_weight1 = 0.4;
		double initial_weight2 = 0.8;
		double coefficient = 0.5;
		double threshold = 2;
		double[][] input = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
		String or = "OR";
		//perceptron(or,input, initial_weight1, initial_weight2, coefficient, threshold);
		
		initial_weight1 = 0.9;
		initial_weight2 = 0.2;
		coefficient = 0.5;
		threshold = 2;
		String and = "AND";
		//perceptron(and,input, initial_weight1, initial_weight2, coefficient, threshold);
		
		initial_weight1 = 1.4;
		initial_weight2 = 0.7;
		coefficient = 0.5;
		threshold = 2;
		String nor1 = "NOR";
		//perceptron(nor1,input, initial_weight1, initial_weight2, coefficient, threshold);
		
		initial_weight1 = 1.4;
		initial_weight2 = 0.7;
		coefficient = 0.5;
		threshold = -2;
		String nor2 = "NOR";
		perceptron(nor2,input, initial_weight1, initial_weight2, coefficient, threshold);
		
		
	}

	public static void perceptron(String condition, double [][] a, double w1, double w2,double coeff, double threshold)
	{
		int [] tar = new int [4];
		
		//target output is filled by checking respective conditions
		if(condition.equals("OR"))
		{
			for(int k = 0;k<4;k++)
			{
				if(a[k][0]==1||a[k][1]==1)
					tar[k] = 1;
				else
					tar[k] = 0;
			}
		}
		
		if(condition.equals("AND"))
		{
			for(int k = 0;k<4;k++)
			{
				if(a[k][0]==1 && a[k][1]==1)
					tar[k] = 1;
				else
					tar[k] = 0;
			}
		}
		if(condition.equals("NOR"))
		{
			for(int k = 0;k<4;k++)
			{
				if(a[k][0]==1||a[k][1]==1)
					tar[k] = 0;
				else
					tar[k] = 1;
			}
		}
		
		double w;							//Wji calculated and is stored in w
		double [] aop = new double [4];		//actual output is stored in this array
		//double [] tar = {0,1,1,1} ;			//these are the target output values
		int count = 0;
		int i = 0; 
		boolean check = true;
		
			while(count<64 )				//we run the iteration for a maximum of 16 epochs and
			{								//each epoch has 4 iterations
				
					check = true;
					
					//Wji is calculated
					w = (w1*a[i][0])+(w2*a[i][1]);
					
					
					System.out.println("weights are ("+w1+", "+w2+")");
					System.out.println("Threshold is "+threshold+" and W is "+w);
					
					
					//The actual output is calculated for the weights given with respective inputs
					if(threshold > w)
						aop[i] = 0;
					else
						aop[i] = 1;
					System.out.println("Actual output : "+Arrays.toString(aop));
					//change the weights when target and actual outputs dont match
					if(tar[i]!=aop[i]);
					{
						w1 = w1 + (coeff*(tar[i] - aop[i])*a[i][0]);
						w2 = w2 + (coeff*(tar[i] - aop[i])*a[i][1]);
					}
				
					i++;
					
					//after each epoch we see if the there are any actual outputs that are different
					//from target outputs and we proceed to next epoch only if there are any differences
					
					if(i==4)
					{
						i = 0;
						System.out.println("\n");
						for(int j=0;j<tar.length;j++)
						{
							//check = check + tar[j]-aop[j];
							if(tar[j]-aop[j]!=0)
								check = false;
						}
						if(check == true)
							count = 65;
					}
					count++;
				}
	}

}
