package LinkedList;

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



    // Check if value exists (returns boolean)
    public boolean contains(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev to current
            current = next;      // Move to next node
        }
        head = prev; // Update head to new first node
    }

    public void middle(){
        Node slow = head;
        Node fast = head;
        if(head != null){
            while(fast != null && fast.next != null){
                slow = slow.next; // Move slow by 1
                fast = fast.next.next; // Move fast by 2
            }
            System.out.println("Middle element is: " + slow);
            // System.out.println(slow.data);
        }else{
            System.out.println("List is empty");
        }
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
        // Test operations
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.show(); // 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
        System.out.println();

        list.insertAt(5, 0);
        list.show(); // 5 -> 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
        System.out.println();

        list.remove(20);
        list.show(); // 5 -> 10 -> 30 -> 40 -> 50 -> 60 -> null
        System.out.println();

        list.insert(10);
        list.insert(10);
        list.removeAll(10);
        list.show(); // 5 -> 30 -> 40 -> 50 -> 60 -> null
        System.out.println();

        System.out.println("Contains 30? " + list.contains(30)); // true
        System.out.println("Contains 99? " + list.contains(99)); // false
        System.out.println();
        list.show(); // 5 -> 30 -> 40 -> 50 -> 60 -> null
        System.out.println();
        list.reverse();
        System.out.print("Reversed list: ");
        list.show(); 
        System.out.println(); // 60 -> 50 -> 40 -> 30 -> 5 -> null
        list.middle(); 
    }
}