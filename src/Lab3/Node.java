public class Node {
    private int item;
    private Node next;

    public Node() {}

    public Node(int item, Node next) {
        this.item = item;
        this.next = next;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
