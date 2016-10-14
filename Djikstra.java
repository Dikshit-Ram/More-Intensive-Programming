public class Djikstra {

	public static int minVal(int [] col,int [] row, int [][] S, int count)
	{
		int min = 9999;
		
		for(int i =0;i<count;i++)
		{
			if(row[i]==0)
			{
				for(int j=0; j<S[i].length;j++)
				{
					if(col[j]==0 && min > S[i][j])
					{
						min = S[i][j];
						
					
					}
				}
		
			}
		}
		System.out.println("next minimum value"+min);
		return min;
	}
	
	public static int position(int [] col,int []row, int [][] S, int count)
	{
		
		int min = 9999;
		int pos = 999;
		for(int i =0;i<count;i++)
		{
			if(row[i]==0)
			{
				for(int j=0; j<S[i].length;j++)
				{
					if(col[j]==0 && min > S[i][j])
					{
						min = S[i][j];
						pos = j;
					
					}
				}
		
			}
		}
			//System.out.println("pos"+pos);
			return pos;
		
	}
	
	public static char nextNode(int pos)
	{
		char nn = 'A';
		if(pos == 0){
			nn = 'A';	
		}
		else if(pos == 1){
			nn = 'B';	
		}
		else if(pos == 2){
			nn = 'C';	
		}
		else if(pos == 3){
			nn = 'D';	
		}
		else if(pos == 4){
			nn = 'E';	
		}
		else if(pos == 5){
			nn = 'F';	
		}
		System.out.println("corresponding node selected is: "+ nn);
		return nn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int S[][] = {{999,8,13,5,999,999},
				{8,999,2,2,3,999},
				{13,2,999,9,8,1},
				{5,2,9,999,11,999},
				{999,3,8,11,999,2},
				{999,999,1,999,2,999}};
		
		//int res[][] = new int [6][6];
        
        char sp = 'A';
        System.out.println("Starting node = A");
        int count = 1;
        int min = 0;
        int [] col = {0,0,0,0,0,0};
        int [] row = {1,1,1,1,1,1};
        col[0] = 1;
        int pos;
        
        
    		
    	
        while (count < 6)
        {
        	if(sp=='A')
        	{
        		col[0] = 1;
        		row[0] = 0;
        		
        		for(int i=0;i<6;i++)
        		{
        			S[0][i] = S[0][i]+min;
        		}
        		min = minVal(col,row,S,count);
        		pos = position(col,row,S,count);
        		sp = nextNode(pos);
        	}
        	else if(sp == 'B')
        	{
        		col[1] = 1;
        		row[1]=0;
        		for(int i=0;i<6;i++)
        		{
        			S[1][i] = S[1][i]+ min;
        		}
        		min = minVal(col,row,S,count);
        		pos = position(col,row,S,count);
        		sp = nextNode(pos);
        	}
        	else if(sp == 'C')
        	{
        		col[2] = 1;
        		row[2]=0;
        		for(int i=0;i<6;i++)
        		{
        			S[2][i] = S[2][i]+min;
        		}
        		min = minVal(col,row,S,count);
        		pos = position(col,row,S,count);
        		sp = nextNode(pos);
        	}
        	else if(sp == 'D')
        	{
        		col[3] = 1;
        		row[3]=0;
        		for(int i=0;i<6;i++)
        		{
        			S[3][i] = S[3][i]+min;
        		}
        		min = minVal(col,row,S,count);
        		pos = position(col,row,S,count);
        		sp = nextNode(pos);
        	}
        	else if(sp == 'E')
        	{
        		col[4] = 1;
        		row[4]=0;
        		for(int i=0;i<6;i++)
        		{
        			S[4][i] = S[4][i]+min;
        		}
        		min = minVal(col,row,S,count);
        		pos = position(col,row,S,count);
        		sp = nextNode(pos);
        	}
        	else if(sp == 'F')
        	{
        		col[5] = 1;
        		
        		row[5]=0;
        		for(int i=0;i<6;i++)
        		{
        			S[5][i] = S[5][i]+min;
        		}
        		min = minVal(col,row, S,count);
        		pos = position(col,row, S,count);
        		sp = nextNode(pos);
        	}
        	count++;
        }
	}

}
