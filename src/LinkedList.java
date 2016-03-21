import java.util.NoSuchElementException;

public class LinkedList<E> {
    private class Node {
        E value;
        Node next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node front;

    public LinkedList() {
        front = null;
    }

    public void push(E element) {
        if (front == null) {
            front = new Node(element);
        } else {
            Node newFront = new Node(element);
            newFront.next = front;
            front = newFront;
        }
    }

    public E pop() {
        if (front == null) {
            throw new NoSuchElementException();
        }
        E value = front.value;
        front = front.next;
        return value;
    }

    public boolean isEmpty() {
       return front == null;
    }

    public int size() {
        Node current = front;
        int size = 0;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }
}
