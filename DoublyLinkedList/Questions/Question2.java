package DoublyLinkedList.Questions;
// Question 2 : Two sum in doubly linked list.....
// Given : sorted list in non-descreasing order.... and target


public class Question2 {

    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static boolean twosum(Node head , int  target) {
        Node temp = head;
        boolean value = false;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node tail = temp;
        while(head.val < tail.val) {
            if(head.val + tail.val == target) {
                System.out.print("The target is equal to : " + head.val + " " + " + " + " " + tail.val);
                 value = true;
                break;
            }
            else if(head.val + tail.val < target) {
                head = head.next;
            }
            else tail = tail.prev;
        }
        return value;

    }
    public static void main(String args[]) {
       Node a = new Node(4);
       Node b = new Node(6);
       Node c = new Node(8);
       Node d = new Node(13);
       Node e = new Node(100);


        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        int target = 16;

       boolean value =  twosum(a,target);
       if(value == false) {
           System.out.println("The indexes were not found");
       }

    }
}
