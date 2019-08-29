package selectionSort;

public class selectionSort {
	
	
	public static void main(String[] args) {
		
		
		int[] A = new int[] {70,25,13,7,55,11,14,10,9,12,69,8,72,101,53};
		

		//before sorting
		for(int p=0; p<A.length; p++) {
				
			System.out.print(A[p] + " ");
		}
			
		System.out.println();
		System.out.println();

		//for(int i = 0; i<A.length-1; i++) 
		//{
			int min = A[0];
	
			for(int j=1; j<A.length; j++) 
			{
				
				
				if(A[j] < min)
				{
					 int small = A[j];
					//System.out.println("The min. is: " + min);
					
				}
				System.out.println("The min. is: " + min);
			}
			
		//}
		
		
		
		
		//print sorted array
		for(int p=0; p<A.length; p++) 
		{
			
			System.out.print(A[p] + " ");
		}

		
	}
}
