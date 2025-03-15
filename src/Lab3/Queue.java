public class Queue {
    private Node front, rear;
    private int size;

    private static class Node {
        int item;
        Node next;

        Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void add(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int item = front.item;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int numOfElements() {
        return size;
    }

    public int search(int value) {
        Node p = front;
        int position = 1;
        while (p != null) {
            if (p.item == value) {
                return position;
            }
            p = p.next;
            position++;
        }
        return 0;
    }

    public void display() {
        Node p = front;
        System.out.println("danh sach phan tu trong hang doi:");
        while (p != null) {
            System.out.println(p.item);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(40);
        queue.add(20);
        queue.add(30);
        queue.add(50);
        queue.display();
        System.out.println("So phan tu trong hang doi: " + queue.numOfElements());
        System.out.println("Tim 30: " + queue.search(30));
        System.out.println("Lay ra: " + queue.remove());
        System.out.println("Hang doi sau khi lay ra:");
        queue.display();
    }
}
