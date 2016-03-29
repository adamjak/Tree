package net.adamjak.utils.trees;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tomas Adamjak on 29.3.2016.
 * Copyright 2016, Tomas Adamjak
 * License: The BSD 3-Clause License
 */
public class TreeNode<T>
{
	private NodeType nodeType = NodeType.NODE;
	private TreeNode<T> parrentNode;
	private List<TreeNode<T>> childrenNodes = new LinkedList<TreeNode<T>>();

	NodeType getNodeType ()
	{
		return this.nodeType;
	}

	boolean isNodeTypeRoot()
	{
		if (this.nodeType == NodeType.ROOT)
		{
			return true;
		}

		return false;
	}

	boolean isNodeTypeLeaf()
	{
		if (this.nodeType == NodeType.LEAF)
		{
			return true;
		}

		return false;
	}

	void setNodeType(NodeType nodeType)
	{
		this.nodeType = nodeType;
	}

	TreeNode<T> getParrentNode()
	{
		return this.parrentNode;
	}

	void setParrentNode (TreeNode<T> parrentNode)
	{
		this.parrentNode = parrentNode;
	}

	List<TreeNode<T>> getChildrenNodes()
	{
		return this.childrenNodes;
	}

	void addGhildrenNode (TreeNode<T> childrenNode)
	{
		this.childrenNodes.add(childrenNode);
	}
}
