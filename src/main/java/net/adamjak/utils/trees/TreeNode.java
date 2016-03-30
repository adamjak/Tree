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
	private final T value;
	private int level;

	TreeNode (T value)
	{
		this.value = value;
	}

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

	TreeNode<T> setNodeType(NodeType nodeType)
	{
		this.nodeType = nodeType;
		if (nodeType == NodeType.ROOT)
		{
			this.level = 0;
		}
		return this;
	}

	TreeNode<T> getParrentNode()
	{
		return this.parrentNode;
	}

	TreeNode<T> setParrentNode (TreeNode<T> parrentNode)
	{
		this.parrentNode = parrentNode;
		this.level = parrentNode.getLevel() + 1;
		return this;
	}

	List<TreeNode<T>> getChildrenNodes()
	{
		return this.childrenNodes;
	}

	TreeNode<T> addGhildrenNode (TreeNode<T> childrenNode)
	{
		this.childrenNodes.add(childrenNode);
		return this;
	}

	public T getValue ()
	{
		return this.value;
	}

	public int getLevel ()
	{
		return this.level;
	}

	@Override
	public String toString ()
	{
		return "TreeNode{" +
				"value=" + value +
				'}';
	}
}
