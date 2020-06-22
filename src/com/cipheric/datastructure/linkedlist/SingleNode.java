package com.cipheric.datastructure.linkedlist;

public class SingleNode {
	
	private SingleNode next;
	private Object data;
	
	public SingleNode(Object data) {
		this.data = data;
		this.next=null;
	}
	
	public SingleNode getNext() {
		return next;
	}
	public void setNext(SingleNode next) {
		this.next = next;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
