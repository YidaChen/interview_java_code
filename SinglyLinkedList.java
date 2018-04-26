package test;

public class SinglyLinkedList {
	Node head = null;
	
	class Node {
		int key;
		Node next;
		Node(int data){
			key = data;
			next = null;
		}
	}
	void addFirst(int data) 
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	boolean remove(int searchKey) 
	{
		Node temp = head;
		Node prev = null;
		if(head != null && head.key == searchKey) {//移除第一個node
			head = head.next;
			return true;
		}
		while(temp != null && temp.key != searchKey) 
		{
			prev = temp;
			temp = temp.next;
		}
		if(temp != null) 
		{
			prev.next = temp.next;
			return true;
		}
		return false;
	}
	void printList() 
	{
		Node temp = head;
		while(temp != null) 
		{
			System.out.print(temp.key + ", ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.addFirst(1);
		linkedList.addFirst(2);
		linkedList.addFirst(3);
		linkedList.addFirst(4);
		linkedList.printList();
		linkedList.remove(3);
		linkedList.printList();
		linkedList.remove(4);
		linkedList.printList();
	}
}