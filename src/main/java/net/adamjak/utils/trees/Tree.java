package net.adamjak.utils.trees;

import java.util.*;

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

	/**
	 * Add ned node into tree.
	 *
	 * @param parrentNode parent node in tree
	 * @param newNodeValue value on new node
	 * @return Return uldated tree.
	 */
	public Tree<T> addNode(TreeNode<T> parrentNode,T newNodeValue)
	{
		TreeNode<T> newNode = new TreeNode<T>(newNodeValue);

		TreeNode<T> pn = this.listOfNodes.get(this.listOfNodes.lastIndexOf(parrentNode));

		if (pn.isNodeTypeLeaf())
		{
			pn.setNodeType(NodeType.NODE);
			newNode.setNodeType(NodeType.LEAF);
		}
		else if (pn.isNodeTypeRoot())
		{
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

	public Set<TreeNode<T>> getPathBetweenTwoNodes(TreeNode<T> from, TreeNode<T> to)
	{
		Set<TreeNode<T>> path = new TreeSet<TreeNode<T>>();

		// TODO: 30.3.2016  
		
		return path;
	}

	/**
	 * @return Return root node in tree.
	 */
	public TreeNode<T> getRootNode()
	{
		TreeNode<T> root = null;

		for (TreeNode<T> n : this.listOfNodes)
		{
			if (n.isNodeTypeRoot())
			{
				root = n;
				break;
			}
		}

		return root;
	}

	/**
	 * @return List of leafs in tree.
	 */
	public List<TreeNode<T>> getListOfLeafs ()
	{
		List<TreeNode<T>> leafs = new LinkedList<TreeNode<T>>();

		if (this.listOfNodes.size() == 1)
		{
			leafs.add(this.listOfNodes.get(0));
		}
		else
		{
			for (TreeNode<T> n : this.listOfNodes)
			{
				if (n.isNodeTypeLeaf())
				{
					leafs.add(n);
				}
			}
		}

		return leafs;
	}

	@Override
	public String toString ()
	{
		return "Tree{" +
				"listOfNodes=" + listOfNodes +
				'}';
	}
}
