package Queue.Implementation;
//<----Implementation using Array ----->
// In the queue we insert the element in rear side and delete the element from the front side
public class ImplementationUsingArray {
    public static class queueArray{
        int r = -1; //real
        int f = -1; // front
        int size = 0;
        int[] arr = new int[100];

        // <-----Add the element in  queue----->
        public  void add(int val) {
            if(size == arr.length-1) {
                System.out.println("Queue is Full");
                return;
            }
            if(f==-1) {
                f = r = 0;
                arr[r] = val;
            }
            else {
                arr[++r] = val; // arr[r+1] = val and r++
            }
            size++;
        }
        //<-----Remove the element from Queue---->
        public int remove() {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        //<----Get Top Element of Queue--->
        public int peek() {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }

        //<----Display Queue---->
        public void display() {
            if(size == 0) {
                System.out.println("Queue is Empty!");
            }
            else {
                for(int i=f; i<=r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        q.remove();
        q.display();

    }
}
