package LinkedListImpl;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList{
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
   }

   public void insertAt(int data, int position) {
    Node newNode = new Node(data);

    // Case 1: Insert at head (position = 0)
    if (position == 0) {
        newNode.next = head;  // New node points to old head
        head = newNode;      // Update head to new node
        return;
    }

    // Case 2: Insert at middle or end
    Node current = head;
    for (int i = 0; i < position - 1 && current != null; i++) {
        current = current.next;  // Move to node before target position
    }

    if (current == null) {
        System.out.println("Position out of bounds!");
        return;
    }

    newNode.next = current.next;  // New node points to next node
    current.next = newNode;       // Previous node points to new node
}

   public void remove(int data){
    if (head == null) return;
    if(head.data == data){
        head = head.next;
        return;
    }
    Node current = head;
    while(current.next != null && current.next.data != data){
        current = current.next;
    }
    if(current.next != null){
        current.next =  current.next.next;
    }
   }

    public void removeAll(int data) {
        while (head != null && head.data == data) {
            head = head.next; // Remove from head
        }
        
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; // Bypass the node
            } else {
                current = current.next; // Move forward
            }
        }
    }

    public void contains(int target){
        Node current  = head;
        while(current != null){
            if(current.data == target){
               System.out.println(target + " is present in LinkedList"); 
            }
            current = current.next;
        }
        System.out.println(target + " is Not present in LinkedList");
    }


    public void show(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(0);
        list.insert(1);
        list.insertAt(2,0);
        list.contains(56);
        list.show();
    }
}