package com.cipheric.datastructure.linkedlist;

public class LinkedList {
	
	private SingleNode head;
	private SingleNode tail;
	private int length=0;
	
	public LinkedList(Object data) {
		SingleNode node = new SingleNode(data);
		this.head = this.tail = node;
		this.length++;
	}
	
	public LinkedList traverse() {
		SingleNode node = this.head;
		StringBuilder buf=new StringBuilder("");
		while(node!=null) {
			buf.append(node.getData());
			node=node.getNext();
			if(node!=null) {
				buf.append(",");
			}
		}
		System.out.println(buf.toString());
		return this;
	}
	
	public LinkedList addAtEnd(Object data) {
		SingleNode node = this.tail;
		this.tail = new SingleNode(data);
		node.setNext(this.tail);
		return this;
	}
	
	public LinkedList addAtFront(Object data) {
		SingleNode node = this.head;
		this.head = new SingleNode(data);
		this.head.setNext(node);
		return this;
	}
	
	public LinkedList deleteFromEnd() {
		SingleNode node = this.head;
		while(node!=null) {
			if(node.getNext().getNext()==null) {
				break;
			} else {
				node=node.getNext();
			}
		}
		node.setNext(null);
		return this;
	}
	
	public LinkedList deleteFromFirst() {
		this.head = this.head.getNext();
		return this;
	}
	
	public int find(Object data) {
		int pos = -1;
		int index=0;
		SingleNode node = this.head;
		while(node!=null) {
			if(node.getData()==data) {
				pos=index;
				break;
			}
			node=node.getNext();
			index++;
		}
		return pos;
	}
	
	public LinkedList getMiddle() {
		if(this.length==0){
			System.out.println("No Data");
		} else {
			SingleNode slowNode = this.head;
			SingleNode fastNode = this.head;
			while(fastNode!=null) {
				fastNode = fastNode.getNext();
				if(fastNode!=null) {
					fastNode = fastNode.getNext();
					slowNode = slowNode.getNext();
				}
			}
			System.out.println("Middle:- "+slowNode.getData());
		}
		return this;
	}
	
	public int size() {
		return this.length;
	}
}
