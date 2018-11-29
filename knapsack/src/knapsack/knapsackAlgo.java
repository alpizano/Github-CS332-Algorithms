package knapsack;

public class knapsackAlgo {
	
 static int knapsack(int[] v, int[] w, int W)
 {
    int[] temp;
    int[] notTemp;
    int[] Q;  
    int i;
    int ans;
    int A;  
    
    temp  = new int[v.length];
    notTemp = new int[v.length];      
    Q = new int[W + 1];     

    Q[0] = 0;

    for ( A = 1; A <= W; A++ )
    {
      
       for ( i = 0; i < v.length; i++ )
       {
          if ( A >= w[i] )
             temp[i] = Q[ A-w[i] ];                               		     
          else
	        temp[i] = 0;       
       }

       
       for ( i = 0; i < v.length; i++ )
       {
          if ( A >= w[i] )
	        notTemp[i] = temp[i] + v[i];              
          else
        	  notTemp[i] = 0;       
       }

       Q[A] = notTemp[0];
       
       for ( i = 1; i < v.length; i++ )
          if ( notTemp[i] > Q[A] )
	         Q[A] = notTemp[i];
    }
    
    return Q[W]; 
}
 
 public static void main(String[] args)
 {
     int[] v = {1, 1};
     int[] w = {1, 1};
     int W, ans;

     W = 10;                  
     ans = knapsack(v, w, W);

     System.out.println("Value for W = " + W + " is " + ans);
 }
}
 
