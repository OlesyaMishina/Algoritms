/**
 * InnerRevertLinkedList
 */
public class RevertLinkedList {
    private Node head;
    private int size;

    public RevertLinkedList() {
        this.head = null;
    }

    public void revert() {
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }

        currentNode.next = previousNode;
        previousNode.next = null;
    }

    public void addLast(int value) {
        if (head == null) {
            head = new Node(value);
            size = 1;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = new Node(value);
        size++;
    }

    public void print() {
        System.out.print("[ ");
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println("] size: " + size);
    }

    public class Node {
        int value;
        Node next;
        Node previous;

        Node() {
        }

        Node(int value) {
            this.value = value;
        }
    }
}