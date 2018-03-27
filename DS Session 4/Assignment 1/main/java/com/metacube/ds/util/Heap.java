package main.java.com.metacube.ds.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Heap Class (Implemented using ArrayList)
 * 
 * @author Karan
 *
 * @param <T>
 */
public class Heap<T> {

	private List<T> heapTree = new ArrayList<T>();
	
	/**
	 * appends the incoming item to the end of array
	 * and calls heapify to sort it
	 * 
	 * @param item
	 */
	public void addItem (T item) {
		heapTree.add(item);
		heapify(heapTree.size()-1);
	}
	
	/**
	 * Sorts the Heap from bottom to top using MaxHeap property
	 * 
	 * @param position
	 */
	public void heapify(int position) {
		if(position != 0 && compare( heapTree.get( position ), heapTree.get( ( position - 1 ) / 2 ) ) > 0) {
			swapItems(position, (position - 1 ) / 2);
			heapify( ( position - 1 ) / 2);
		}
	}
	
	/**
	 * compare method, used to compare two items, using either the compareTo method implemented
	 * by the calling class, or converting the item to string
	 * 
	 * @param item1
	 * @param item2
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int compare(T item1, T item2){
		if(item1 instanceof Comparable){
			return ((Comparable) item1).compareTo(item2);
		}
		else{
			return item1.toString().compareTo(item2.toString());
		}
	}
	
	/**
	 * swap method
	 * 
	 * @param position1
	 * @param position2
	 */
	public void swapItems(int position1, int position2) {
		T item = heapTree.get(position1);
		heapTree.set(position1,heapTree.get(position2));
		heapTree.set(position2,item);
	}
	
	/**
	 * removes the item from top, then copies the last element to root and then reheapifies the tree
	 * 
	 * @return
	 */
	public T removeMax() {
		T element = heapTree.get(0);
		heapTree.set(0, heapTree.get(heapTree.size() - 1));
		heapTree.remove(heapTree.size() - 1);
		reHeapify(0);
		return element;
	}
	
	/**
	 * sorts the tree from top to bottom after removal of the node using maxHeap property
	 * 
	 * @param node
	 */
	private void reHeapify(int node) {
		if(node < heapTree.size()) {
			int left = 2 * node + 1;
			int right = 2 * node + 2;
			if(left < heapTree.size() && right < heapTree.size() && compare( heapTree.get(left), heapTree.get(right) ) < 0 ) {
				checkParent(node, right);
			} else if(left < heapTree.size() ) {
				checkParent(node, left);
			}
		}
	}
	
	/**
	 * compares the parent and child, if the child is greater, reheapifies after swapping the two
	 * 
	 * @param parent
	 * @param child
	 */
	private void checkParent(int parent, int child) {
		if(compare(heapTree.get(parent), heapTree.get(child)) < 0 ) {
			swapItems(parent, child);
			reHeapify(child);
		}
	}
	
	/**
	 * returns true if tree is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return heapTree.size() == 0;
	}
	
}
