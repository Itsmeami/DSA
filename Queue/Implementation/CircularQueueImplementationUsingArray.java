package Queue.Implementation;
//<-----Circular Queue Implementation Using Array------>
public class CircularQueueImplementationUsingArray {
    public static class CqA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];
        //<----Insert the element in Queue----->
        public void add(int x) throws Exception {
            if(size == arr.length) {
                throw new Exception("Queue is Full");
            }
            if(size == 0) {
                front = rear = 0; // agar kahi bich me front queue ke barabar ho jata hai tb
                arr[0] = x;
            }
            else if(rear<arr.length-1) {
                arr[++rear] = x;
            }
            else if(rear == arr.length-1) {
                rear = 0;
                arr[0]  = x;
            }
            size++;
        }
        //<----Remove the element from the Queue---->
        public int remove() throws Exception {
            if(size == 0) {
                throw new Exception("Queue is Empty!");
            }
            else {
                int val = arr[front];
                if(front == arr.length-1) {
                    front = 0;
                }
                else front++;
                size--;
                return val;
            }
        }

        //<----Return the fornt element form the Queue----->
        public int peek() throws Exception {
            if(size == 0) {
                throw new Exception("Queue is Empty!");
            }
            else return arr[front];
        }

        //<-----Check the is Empty or not---->
        public boolean IsEmpty() {
            if(size == 0) return true;
            else return false;
        }

        //<----Display the Queue Element---->
        public void display()   {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return;
            }
            else if(front<=rear) {
                for(int i=front; i<=rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            else { // rear < front
                // 2 loop lagege yeha pe ek loop hoga front se leke arr.length-1 tak aur ek loop hoga 0 se leke rear tak
                for(int i=front; i<arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for(int i=0; i<=rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception{
        CqA q = new CqA();
//        q.IsEmpty();
//        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.display();
        System.out.println("Remove element is : " + q.remove());
        q.add(9);
        System.out.println("Queue is :- ");
        q.display();
        System.out.println("Array is :- ");
        for(int i=0; i<q.arr.length; i++) { // jb hm prviate key word ka use karate hai tb hm arrr ko class ke bahar bhi use kar sakate hai
            System.out.print(q.arr[i] + " ");
        }
        System.out.println();
        q.add(10);


    }
}
