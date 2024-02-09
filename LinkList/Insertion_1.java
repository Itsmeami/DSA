package LinkList;

import LinkList.implementation.Insertion;

public class Insertion_1 {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class LinkList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertionAtbeginning(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail =  temp;
                return;
            }
            else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
                return;
            }
            else {
                tail.next = temp;

            }
            temp = tail;
            size++;
        }

//        void insertAtIndex(int idx, int val) {
//            Node t = new Node(val);
//            Node temp = head;
//            if(idx == size) {
//                insertAtEnd(val);
//                return;
//            }
//            else if(idx == 0) {
//                insertionAtbeginning(val);
//                return;
//            }
//            else if(idx > size+1 || idx < 0) {
//                System.out.println("WRONG INPUT");
//                return;
//            }
//
//                for(int i=1; i<idx; i++) {
//                    t = t.next;
//                }
//                t.next = temp.next;
//                temp.next = t;
//
//
//            size++;

//        }

        void insertAtIndex(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if(idx == size) {
                insertAtEnd(val);
                return;
            }
            else if(idx == 0) {
                insertionAtbeginning(val); 
                return;
            }
            else if(idx<0 || idx>size) {
                System.out.println("WRONG INPUT");
                return;
            }
            for(int i=1; i<idx; i++) {  // for loop ko dhyan se samajna
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx) {
            Node temp = head;
            for(int i=1; i<idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

//        void delete(int idx) {
//            Node temp = head;
//            for(int i=1; i<idx; i++) {
//                temp = temp.next;
//            }
//            temp.next = temp.next.next;
//            temp = tail;
//            size--;
//        }

        void deleteAt(int idx) {
            Node temp = head;
            if(idx == 0) {
                head = head.next;
                size--;
                return;
            }
            for(int i=1; i<=idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp = tail;
            size--;
        }

        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insertionAtbeginning(5);
        ll.insertAtEnd(6);
        ll.insertAtIndex(2,7);
        ll.deleteAt(2);
        ll.display();
        System.out.println(ll.getAt(3));

    }
}
