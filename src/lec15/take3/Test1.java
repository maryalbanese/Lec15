package lec15.take3;

import java.util.ArrayList;
import java.util.List;


public class Test1 {

	public static void main(String[] args) {
		BinaryMinTree<String, Integer> pq = new BinaryMinTree<String,Integer>();
		
		//2 5 4 7 8 9 6 14 16 12 17 15 3 1 
		
		pq.enqueue("Apple", 2);
		pq.enqueue("Banana", 5);
		pq.enqueue("Carrot", 4);
		pq.enqueue("Date", 7);
		pq.enqueue("Apple", 8);
		pq.enqueue("Banana", 9);
		pq.enqueue("Carrot", 6);
		pq.enqueue("Date", 14);
		pq.enqueue("Apple", 16);
		pq.enqueue("Banana", 12);
		pq.enqueue("Carrot", 17);
		pq.enqueue("Date", 15);
		pq.enqueue("Apple", 3);
		pq.enqueue("Banana", 1);
		
		
	/*	
		pq.enqueue("Apple", 2);
		pq.enqueue("Banana", 5);
		pq.enqueue("Carrot", 4);
		pq.enqueue("Date", 7);
		pq.enqueue("Apple", 8);
		pq.enqueue("Banana", 9);
		pq.enqueue("Carrot", 6);
		pq.enqueue("Date", 14);
		pq.enqueue("Apple", 16);
		pq.enqueue("Banana", 12);
		pq.enqueue("Carrot", 17);
		pq.enqueue("Date", 15);
		printBreadthFirstArrayListQueue(pq);
		System.out.println();
		pq.enqueue("boo", 1);*/

		
		
		pq.enqueue("Apple", 2);
		pq.enqueue("Banana", 3);
		pq.enqueue("Carrot", 5);
		pq.enqueue("Date", 4);
		pq.enqueue("Date", 7);
		
		
		printBreadthFirstArrayListQueue(pq);
		System.out.println();
		
	//	System.out.println(pq.dequeue());
	//	System.out.println(pq.dequeue());
	//	System.out.println(pq.dequeue());
	//	System.out.println(pq.dequeue());
	}
	
	static void printBreadthFirstArrayListQueue(BinaryMinTree<String,Integer> tree) {
		  
		  

		  List<BinaryMinTree<String,Integer>> l1 = new ArrayList<BinaryMinTree<String,Integer>>();

		  List<Integer> result= new ArrayList<Integer>();
		  l1.add(tree);
		  while (!l1.isEmpty()) {
			  BinaryMinTree<String,Integer> t = l1.remove(0);
			  System.out.print(t._root_value.getPriority()+ " ");
			  result.add(t._root_value.getPriority());

			  BinaryMinTree<String,Integer> left = t.getLeft();
			  BinaryMinTree<String,Integer> right = t.getRight();
			  if (!left.isEmpty())
				  l1.add(l1.size(),t.getLeft());
			  if (!right.isEmpty())
				  l1.add(l1.size(),t.getRight());	
			  
		  }
		  
		  System.out.println("\nNow we show the tree with proper depth");
		  
		  //Now print out the tree showing depth
		  int level=1;
		  int i=0;	  
		  while (i<result.size()) {
			  System.out.print(result.get(i) +" ");
			  // print a newline when i=0,2,6,14,22
              if (i== Math.pow(2,level)-2) {
            	  System.out.println();
            	  level++;
              }
			  i++;
		  }
    	  System.out.println();

	  }
}
