package getChange;

public class getChange {
	package getChangeAlgorithm;

	public class getChange {
		
		int[] table = new int[10];
		double[] coins = new double[10];
		
		int minCoins(int coins[], int m, int V)
		{
			
		// table[i] will store the minimum number of coins required for I value.
		 table[V + 1];
		// Base case (If V = 0)
		table[0] = 0;
		
		// Initialize the table values to be infinity
		for(int i=1; i<=V; i++)
			table[i] = Integer.MAX_VALUE;
		
		// Calculate the minimum number of coins for all values 1 to V
		for(int i=1; i<=V; i++)
		{
			
		// iterate thru coins smaller than j
			
		for(int j=0; j<m; j++)
		if(coins[j] <= i)
		{
		int sub_prob = table[i – coins[j]];
		if (sub_prob != Integer.MAX_VALUE && sub_prob + 1 < table[i])
		table[i] = sub_prob + 1;
		}
		}
		return table[V]; // return the minimum # of coins to make value “V” that was input by
		
		}
	}


}
