class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL{
    Node head = null;
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data,int pos){
        if(pos<0){
            System.out.println("Negative Number : "+ pos);
            return;
        }
        if(pos == 0){
            insertAtFirst(data);
            return;
        }

        Node newNode  = new Node(data);
        Node  current = head;
        int count = 0;
        while(current!=null && count<pos-1){
            current = current.next;
            count++;
        }
        if(current==null){
            System.out.println("Position out of range: " + pos);
            return; 
        }
        newNode.next=current.next;
        current.next=newNode;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public void removeFromFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }
    

    public void removeFromPosition(int pos) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
    
        if (pos < 0) {
            System.out.println("Negative Number: " + pos);
            return;
        }
    
        // If the position is 0, remove the head node.
        if (pos == 0) {
            head = head.next;
            return;
        }
    
        Node current = head;
        int count = 0;
    
        // Traverse to the node before the desired position
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
    
        // If current is null or current.next is null, position is out of range
        if (current == null || current.next == null) {
            System.out.println("Position Out of Range: " + pos);
            return;
        }
    
        // Remove the node at the desired position by skipping it
        current.next = current.next.next;
    }
    

    public void removeFromLast() {
        // If the list is empty, there's nothing to remove
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
    
        // If there's only one node, remove it by setting head to null
        if (head.next == null) {
            head = null;
            return;
        }
    
        // Traverse to the second-to-last node
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
    
        // Set the next of the second-to-last node to null, removing the last node
        current.next = null;
    }
    
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.insertAtFirst(1);
        ll.insertAtPosition(0,-1);
        ll.insertAtPosition(0, 5);
        ll.insertAtPosition(2, 0);
        ll.insertAtLast(10);
        ll.removeFromFirst();
        ll.removeFromPosition(0);
        ll.removeFromLast();
        ll.display();
    }
}