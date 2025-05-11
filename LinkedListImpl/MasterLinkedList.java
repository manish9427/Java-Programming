package LinkedListImpl;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MasterLinkedList {
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(int data){
        if(head == null){
            return;
        }
        
    }

    public void show(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public static void main(String args[]){
        MasterLinkedList list = new MasterLinkedList();
        list.insert(10);
        list.insert(20);
        list.show();
    }
}
