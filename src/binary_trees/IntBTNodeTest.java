package binary_trees;

public class IntBTNodeTest {
	
	public static void main(String[] args) {
		IntBTNode  numberTree = new IntBTNode(1, 
                
                new IntBTNode(2, new IntBTNode(4, null, null),
                              new IntBTNode(5, null, null)
                             ),
                
                new IntBTNode(3, new IntBTNode(6, null, null),
                              new IntBTNode(7, null, null)
                             )
          );
		
		numberTree.preorderPrint();
        
	     numberTree.print(0);
		
		
	}

}
