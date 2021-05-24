package lec15.take3;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BinaryMinTree<String, Integer> pq = new BinaryMinTree<String,Integer>();
		
		pq.enqueue("Apple", 3);
		pq.enqueue("Banana", -4);
		pq.enqueue("Carrot", 100);
		pq.enqueue("Date", 32);
		pq.enqueue("Apple", 3);
		pq.enqueue("Banana", -4);
		pq.enqueue("Carrot", 100);
		
		
		System.out.println(pq.dequeue());
		System.out.println(pq.dequeue());
		System.out.println(pq.dequeue());
		System.out.println(pq.dequeue());
	}
	
	static void printBreadthFirstArrayListQueue(BinaryMinTree<String,Integer> tree) {
		  
		  

		  List<BinaryMinTree<String,Integer>> l1 = new ArrayList<BinaryMinTree<String,Integer>>();

		  l1.add(tree);
		  while (!l1.isEmpty()) {
			  BinaryMinTree<String,Integer> t = l1.remove(0);
			  System.out.print(t._root_value.getPriority()+ " ");

			  BinaryMinTree<String,Integer> left = t.getLeft();
			  BinaryMinTree<String,Integer> right = t.getRight();
			  if (!left.isEmpty())
				  l1.add(l1.size(),t.getLeft());
			  if (!right.isEmpty())
				  l1.add(l1.size(),t.getRight());	
			  
		  }
		  
	  }
}
