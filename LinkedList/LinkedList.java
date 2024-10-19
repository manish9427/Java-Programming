class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
public class LinkedList{
    Node head;

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
    }

    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " --> ");
            current=current.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.insertAtFirst(1);
        ll.display();
    }
}