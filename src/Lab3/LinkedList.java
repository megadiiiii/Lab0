public class LinkedList {
    private Node firstNode;
    private Node lastNode;

    public LinkedList() {
        firstNode = null;
        lastNode = null;
    }

    public void insertFirst(int item) {
        Node p = new Node(item, firstNode);
        firstNode = p;
        if (lastNode == null) {
            lastNode = p;
        }
    }

    public void insertLast(int item) {
        Node p = new Node(item, null);
        if (isEmpty()) {
            firstNode = lastNode = p;
        } else {
            lastNode.setNext(p);
            lastNode = p;
        }
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void travel() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return;
        }
        Node p = firstNode;
        System.out.print("List: ");
        while (p != null) {
            System.out.print(p.getItem() + " ");
            p = p.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.travel();
    }
}
