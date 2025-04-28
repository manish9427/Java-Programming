package LinkedListImpl;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    Node head;

    public void insertFirst(int data){
        Node current  = new Node(data);
        if(head == null){
            head = current;
        }
    }

    public void insertMiddle(int data, int index) {
        Node current = new Node(data);
    
        if (head == null) {
            head = current; // If the list is empty, just make the new node the head
        } else if (index == 0) {
            // Special case: Insert at the beginning
            current.next = head;
            head.prev = current;
            head = current; // Update the head to point to the new node
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    // Handle the case where the index is out of bounds
                    System.out.println("Index out of bounds");
                    return;
                }
                temp = temp.next;
            }
    
            if (temp == null) {
                // Handle the case where the index is out of bounds
                System.out.println("Index out of bounds");
                return;
            }
    
            current.next = temp.next;
            current.prev = temp;
            if (temp.next != null) {
                temp.next.prev = current;
            }
            temp.next = current;
        }
    }

    public void insertLast(int data){
        Node current  = new Node(data);
        if(head == null){
            head = current;
        }else{
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next; 
            }
        }
    }
    

    public void show(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " <--> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public  static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(1);
        list.insertMiddle(0,0);
        list.show();
    }
}
