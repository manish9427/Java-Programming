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
public class Daily5 {
    static Node head;
    static void Show(){
        System.out.println("data: "+head.data);
    }
    public static void main(String args[]){
        Daily5.Show();
    }
}
