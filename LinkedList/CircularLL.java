class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class CircularLL {
	Node head;
	Node tail;
	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head =newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			newNode.next = head;
			head = newNode;
			tail.next =head;
		}
	}
	public void display() {
		Node current = head;
		do {
			System.out.print(current.data + " --> ");
			current = current.next;
		} while(current != head);
		System.out.println("Head");
	}
	public static void main(String[] args) {
		CircularLL main = new CircularLL();
		main.insertAtFirst(1);
		main.display();
	}
}
