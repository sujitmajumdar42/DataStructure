package com.cipheric.datastructure.linkedlist;

public class Test {
	
	public static void main(String[] args) {
		testLinkedList();
	}
	
	private static void testLinkedList() {
		LinkedList ls = new LinkedList("a")
				.addAtEnd("b")
				.addAtEnd("c")
				.addAtFront("d")
				.addAtEnd("w")
				.addAtEnd("e")
				.traverse()
				.getMiddle()
				.deleteFromEnd()
				.traverse()
				.deleteFromFirst()
				.traverse()
				.getMiddle();
		System.out.println(ls.find("z"));
	}
}
