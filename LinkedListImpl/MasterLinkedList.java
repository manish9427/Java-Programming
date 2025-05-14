package LinkedListImpl;


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
        // this will work for the first Value
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }

        Node current  = head;
        while(current.next != null && current.next.data != data){
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
        }
    }

    public Node reverse(){
        Node prev = null, curr = head;
        while(curr!=null){
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        head = prev;
        return head;
    }

    public Node Middle(){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public boolean hasCycle(){
        Node slow = head,fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
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
        // list.show();
        // list.delete(20);
        // list.reverse();
        // Middle will return the middle node
        // How can i print Middle node
        System.out.println(list.Middle().data);
        System.out.println(list.hasCycle());
        list.show();

    }
}
