class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class SinglyLL {
	Node head;
	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;

	}
	public void insertAtPosition(int data, int pos) {
		Node newNode = new Node(data);
		if(pos == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node current = head;
		int count=0;
		while(current != null && count<pos-1) {
			current = current.next;
			count++;
		}
		if(current == null) {
			System.out.println("Positon Out of Range");
			return;
		}
		newNode.next = current.next;
		current.next = newNode;
	}
	public void deleteAtFirst() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
	}
	public void deleteAtLast() {
		if(head == null) {
			head = null;
			return;
		}
		Node current = head;
		if(current.next.next != null) {
			current=current.next;
		}
		current.next = null;
	}
	public void deleteAtPosition(int pos){
	    if(head == null){
	        System.out.println("List is Empty.");
	        return;
	    }
	    if(pos == 0){
	        head = head.next;
	        return;
	    }
	    
	    Node current = head;
	    for(int i=0;current.next != null & i<pos-1;i++){
	        current = current.next;
	    }
	    if(current == null || current.next == null){
	        System.out.println("Position Out of Range");
	        return;
	    }
	    current.next = current.next.next;
	}
	
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("Null");
	}
	public static void main(String[] args) {
		SinglyLL main = new SinglyLL();
		main.insertAtFirst(1);
		main.insertAtLast(2);
		main.insertAtPosition(3,0);
		main.deleteAtFirst();
		main.deleteAtLast();
		main.deleteAtPosition(1);
		main.display();
	}
}
