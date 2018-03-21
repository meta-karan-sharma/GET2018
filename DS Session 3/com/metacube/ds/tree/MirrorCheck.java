package com.metacube.ds.tree;

import com.metacube.utils.Node;

/**
 * Checks the mirror image of tree by comparing the left sub child of one tree
 * with right sub child of the other
 * @author Karan
 *
 * @param <T>
 */
public class MirrorCheck<T> {

	/**
	 * recursive method to check if the data of the node is not null and data of the node is 
	 * similar to one another
	 * @param leftTree
	 * @param rightTree
	 * @return
	 */
	public boolean compareMirrorTree(Node<T> leftTree, Node<T> rightTree){
		
		if( (leftTree != null && rightTree != null) && (leftTree.data == rightTree.data) ){
			if ( compareMirrorTree(leftTree.left, rightTree.right) ){ //checks left of first and right of second
				if( compareMirrorTree(leftTree.right, rightTree.left) ) {	// checks right of first and left of second
					return true;
				}
			}
		} else if(leftTree == null && rightTree == null){
			return true;
		}
		return false;
		
	}
}
