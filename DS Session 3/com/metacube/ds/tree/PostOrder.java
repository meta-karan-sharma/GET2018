package com.metacube.ds.tree;

import java.util.ArrayList;
import java.util.List;

import com.metacube.utils.Node;

/**
 * returns the traversed nodes in post ordered traversal using recursive calling
 * @author Karan
 *
 */
public class PostOrder<T> {
	List<T> traversedPath = new ArrayList<>();
	public List<T> postOrder(Node<T> root) {
		
		if(root.left!=null) {
			postOrder(root.left);
		}
		if(root.right!=null) {
			postOrder(root.right);
		}
		traversedPath.add(root.data);
		return traversedPath;
	}
}
