package com.metacube.ds.tree;

import java.util.ArrayList;
import java.util.List;

import com.metacube.utils.Node;

/**
 * returns the traversed nodes in pre ordered traversal using recursive calling
 * @author Karan
 *
 */
public class PreOrder<T> {
	List<T> traversedPath = new ArrayList<>();
	public List<T> preorder(Node<T> root) {
		
		traversedPath.add(root.data);
		if(root.left != null) {
			preorder(root.left);
		}
		if(root.right != null) {
			preorder(root.right);
		}
		return traversedPath;
	}
}