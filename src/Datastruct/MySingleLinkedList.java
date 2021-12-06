package Datastruct;

public class MySingleLinkedList<T> {//
	
	public Node<T> head;
	public int size;
	
	public MySingleLinkedList() {
		head = null;
		size = 0;
	}
	public void addFirst(T items) {
		//T:type parameter
		Node<T> newNode = new Node<T>(items);
		
		newNode.next = head;
		head = newNode; 
		size++;
		
	}
	
	public void add( int index, T items) {
		
	}
	
	public void remove(int index) {
		
	}
	
	public int indexOf(T item) {
		return -1;
	}
	public T get(int insex) {
		return null;
	}
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<String>();
		list.add(0, "sunday");
		list.add(1, "friday");
		list.add(0, "Truewiday");
		list.add(2, "Monewiday");
		
		String str = list.get(2);
		list.remove(2);
		int pos = list.indexOf("sumday");
	}
}
