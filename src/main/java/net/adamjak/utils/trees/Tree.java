package net.adamjak.utils.trees;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tomas Adamjak on 29.3.2016.
 * Copyright 2016, Tomas Adamjak
 * License: The BSD 3-Clause License
 */
public class Tree<T>
{
	private List<TreeNode<T>> listOfNodes;

	public Tree (TreeNode<T> rootNode)
	{
		rootNode.setNodeType(NodeType.ROOT);
		this.listOfNodes = new LinkedList<TreeNode<T>>();
		this.listOfNodes.add(rootNode);
	}

	public Tree<T> addNode(TreeNode<T> parrentNode, TreeNode<T> newNode)
	{
		TreeNode<T> pn = this.listOfNodes.get(this.listOfNodes.lastIndexOf(parrentNode));

		if (pn.isNodeTypeLeaf())
		{
			pn.setNodeType(NodeType.NODE);
			newNode.setNodeType(NodeType.LEAF);
		}

		pn.addGhildrenNode(newNode);
		newNode.setParrentNode(parrentNode);

		this.listOfNodes.add(newNode);

		return this;
	}

	public Tree<T> removeNode(TreeNode<T> node)
	{
		this.listOfNodes.get(this.listOfNodes.indexOf(node)).getParrentNode().setNodeType(NodeType.LEAF);
		this.listOfNodes.remove(node);

		return this;
	}
}
