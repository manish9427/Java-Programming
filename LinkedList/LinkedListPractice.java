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
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return ;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int data, int pos){
        if(pos == 0){
            insertAtFirst(data);
        }
        Node newNode = new Node(data);
        Node current = newNode;
        
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
        main.insertAtLast(10);
        main.insertAtPosition(10,1);
        main.display();
    }
}
