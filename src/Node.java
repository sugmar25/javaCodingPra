
public class Node {
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next =null;

    }

    static class LinkedList {
        Node head;
        public void insert(int data){
            Node newnode =new Node(data);
            if(head == null){
                head = newnode;
                return;
                }
            Node current = head;
            while(current.next !=null){
                current = current.next;
            }
            current.next=newnode;
            }

        public void reverseLinkedList(){
            Node prev =null;
            Node current = head;
            Node next=null;

            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head = prev;
        }

        public void printList(){
            Node current = head;
            while(current !=null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

    }
    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original List:");
        list.printList();

        list.reverseLinkedList();

        System.out.println("Reversed List:");
        list.printList();


    }
}
