package DoublyLinkedList.Questions;
// Question 1 : Palindrome of the linked list.....
public class Question1 {
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static boolean ispalindrome(Node head) {
        Node temp = head;
        while(temp.next !=null) {
            temp = temp.next;
        }
        Node tail = temp;
        while(head != tail) {
            if(head.val != tail.val) return false;
            head = head.next;
            tail = tail.prev;

        }
        return true;
    }
    public static void main(String args[]) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(1);
//        Node e = new Node(100);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
//        e.prev = d;
//        e.next = null;

        boolean value = ispalindrome(a);
        System.out.print("The given linked list is palindrome : " + value);

    }
}
