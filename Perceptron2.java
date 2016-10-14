
public class Perceptron2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double initial_weight1 = 0.4;
		double initial_weight2 = 0.8;
		double coefficient = 0.5;
		double threshold = 2;
		double[][] input = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
		double [] or = {0,1,1,1} ;
		//perceptron(or,input, initial_weight1, initial_weight2, coefficient, threshold);
		
		initial_weight1 = 0.9;
		initial_weight2 = 0.2;
		coefficient = 0.5;
		threshold = 2;
		double [] and = {0,0,0,1};
		//perceptron(and,input, initial_weight1, initial_weight2, coefficient, threshold);
		
		initial_weight1 = 1.4;
		initial_weight2 = 0.7;
		coefficient = 0.5;
		threshold = 2;
		double [] nor1 = {1,0,0,0};
		//perceptron(nor1,input, initial_weight1, initial_weight2, coefficient, threshold);
		
		initial_weight1 = 1.4;
		initial_weight2 = 0.7;
		coefficient = 0.5;
		threshold = -2;
		double [] nor2 = {1,0,0,0};
		perceptron(nor2,input, initial_weight1, initial_weight2, coefficient, threshold);
		
		
	}

	public static void perceptron(double [] tar, double [][] a, double w1, double w2,double coeff, double threshold)
	{
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
