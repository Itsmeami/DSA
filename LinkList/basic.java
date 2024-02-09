package LinkList;

public class basic {

    public static void displayByRecursion(Node head) {
        Node temp = head;
        if(temp == null) return;
        System.out.print(temp.data + " ");
        displayByRecursion(temp.next);
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data; // value
        Node next; // Address of the next node
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(8);
        Node d  = new Node(10);
        Node e = new Node(18);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(b.data);
        System.out.println("Display Using Recursion");
        displayByRecursion(a);
        System.out.println();
        System.out.println("Display Using Loop");

        display(a);



    }
}
