package LinkList.implementation;

public class Insertion {
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

        // Insert the element at the beginning of the linkList
        //  Time Complexity - O(1)
        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if(head == null) {
               head = tail = temp; // head = temp and tail = temp
                // insertAtEnd(val); - socho isake bare me jo uper vali line kam karegi ye function bhi vahi kam karega
            }
            else {
                temp.next = head;
                head = temp;
            }
            size++;
        }


        // Insertion in the End of the Link List
        // Time Complexity - O(1) - if tail is given
        // Time Complexity - O(n) - if tail is not given
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        // Insert the element at any given postion, Here index and value is given
        // Time Complexity -- O(n) and Space Complexity - O(n)
        void insertAtIndex(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()) {
                insertAtEnd(val);
                return;
            }
           else if(idx == 0) {
                insertAtBeginning(val);
                return;
            }
           else if(idx<0 || idx>size()) {
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

        // Delete the node at given index
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

        // This getAt method is used to get the data at given index
        // Time Complexity - O(n)
        int getAt(int idx) {
            Node temp = head;
            for(int i=1; i<=idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Display the link List
        // Time Complexity - O(n)
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }


        // find the size of the Link List
        // Time Complexity - O(n) , here we can use the variable size to get the size that is O(1)
        int size() {
//            Node temp = head;
//            int count  = 0;
//            while(temp != null) {
//                count++;
//                temp = temp.next;
//            }
//            return count;
            return size;
        }
    }
    public static void main(String[] args) {
       LinkList ll = new LinkList();
       ll.insertAtBeginning(4); // 4
       ll.insertAtEnd(5); // 4 -> 5
       ll.insertAtEnd(6); // 4 ->5 ->6
       ll.insertAtBeginning(7); // 7 ->4 ->5->6
       ll.insertAtIndex(3,8); // 7 ->4 ->5->6->8
        ll.display();
//        System.out.print("Delete the element at index 2 that is 5 : -- ");
        ll.deleteAt(2); // 7->4 ->6 ->8
        ll.display();
//        System.out.println( "Tail data is " + ll.tail.data);
//        System.out.println("The element at index 3 is : " + ll.getAt(3));
//        System.out.println();
//        System.out.print("The size of the LinkList is : ");
//        System.out.println( ll.size());



    }
}






