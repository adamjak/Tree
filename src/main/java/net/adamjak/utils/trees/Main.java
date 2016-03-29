package net.adamjak.utils.trees;

/**
 * Created by Tomas Adamjak on 29.3.2016.
 * Copyright 2016, Tomas Adamjak
 * License: The BSD 3-Clause License
 */
public class Main
{
	public static void main(String args[])
	{
		Tree<Character> tree = new Tree<Character>('K');
		tree.addNode(tree.getTreeNodeByValue('K'),'G');
		tree.addNode(tree.getTreeNodeByValue('K'),'T');

		System.out.println(tree);
	}
}
