// Implement a method to find out the length of a linked List (Iterative and Recursive)
package LinkList;


public class Question_1 {

    public static int lengthByIterative(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
//        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
//        d.next = e;
        int count = 0;
        System.out.println(lengthByIterative(a));




    }
}
