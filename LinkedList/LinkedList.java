class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList{
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
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("Null");
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
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.insertAtFirst(1);
        ll.insertAtPosition(0,-1);
        ll.insertAtPosition(0, 5);
        ll.insertAtLast(10);
        ll.display();
    }
}