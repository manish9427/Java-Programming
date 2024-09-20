class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListPractice {
    Node head;
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtLast(int data){
        
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -->  ");
            current = current.next;
        }
        System.out.println("Null");

    }
    public static void main(String args[]){
        LinkedListPractice main = new LinkedListPractice();
        main.insertAtFirst(1);
        main.display();
    }
}
