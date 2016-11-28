package adt.linkedlist;

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	public LinkedList(){
		
	}
	
	public void addNode(Node<T> node){
		if(head == null){
			head = node;
			head.setNext(null);
			tail = head;
		}
		else if(head == tail){
			setTail(node);
			head.setNext(tail);
		}else{
			tail.setNext(node);
			setTail(node);
		}
	}
	
	private void setTail(Node<T> node) {
		this.tail = node;
	}

	public int size(){
		if(head == null)return 0;
		Node<T> aux = head;
		int counter = 0 ;
		while(aux !=  null){
			counter++;
			aux = aux.getNext();
		}
		return counter;
	}
	
//	//method implemented to solve hackerrank problem
//	public void Print(Node head){
//		if(head == null) return;
//		Node aux = head;
//		while(aux != null){
//			System.out.println(aux.data);
//			aux = aux.next;
//		}
//	}
	
	@Override
	public String toString(){
		String result = "";
		Node<T> aux = head;
		while(aux != null){
			result += aux.toString();
			aux = aux.getNext();
		}
		return result;
	}
}
