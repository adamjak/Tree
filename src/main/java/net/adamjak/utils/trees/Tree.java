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

	public Tree (T rootNodeValue)
	{
		TreeNode<T> rootNode = new TreeNode<T>(rootNodeValue).setNodeType(NodeType.ROOT);
		this.listOfNodes = new LinkedList<TreeNode<T>>();
		this.listOfNodes.add(rootNode);
	}

	public Tree<T> addNode(TreeNode<T> parrentNode,T newNodeValue)
	{
		TreeNode<T> newNode = new TreeNode<T>(newNodeValue);

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

	public boolean isValueInTree(T value)
	{
		for (TreeNode<T> tn : this.listOfNodes)
		{
			if (tn.getValue().equals(value)) return true;
		}

		return false;
	}

	public TreeNode<T> getTreeNodeByValue(T value)
	{
		for (TreeNode<T> tn : this.listOfNodes)
		{
			if (tn.getValue().equals(value))
			{
				return tn;
			}
		}

		throw new TreeException("Can't find node by value.");
	}

	@Override
	public String toString ()
	{
		return "Tree{" +
				"listOfNodes=" + listOfNodes +
				'}';
	}
}
