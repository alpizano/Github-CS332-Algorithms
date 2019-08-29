package incrementTest;


	public class incrementTest {
		  
		  public static void main(String[] args) {
		    
		    
		    //int[] hello = new int[9];
		    
		    int[] hello = new int[]{1,2,3,4,5};
		    
		    for(int p =0; p<hello.length; p++) 
		    {
		     
		     System.out.print(hello[p] + " "); 

		    }
		    
		    System.out.println();
		    for(int p =0; p<hello.length; p++) 
		    {

		     System.out.print(hello[p++] + " " ); 

		    
		    }
		    
		    System.out.println();
		       for(int p =0; p<hello.length; p++) 
		       {
		     if(p < 4)
		     System.out.print(hello[p+1] + " "); 
		     
		    }
		   
		    
		  int i = 3;
		  int j = 7;
		  int k = 5;
		  
		  System.out.println();
		  System.out.println(i++);
		  System.out.println(k +1);
		  
		  System.out.println(j++);
		  System.out.println(j + 1);
		  }
		  
		  }

