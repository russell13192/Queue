public class Queue<T extends Comparable<T>> {
    // Declare Queue implementation attributes
    private Node<T> firstNode; // First element of queue
    private Node<T> lastNode; // Last element of queue
    private int count; // Number of elements is queue

    public boolean isEmpty() {
        return this.firstNode == null; // If first node is null, queue is empty
    }

    public int size() {
        return this.count; // return the size of queue, This is the number of times the enqueue method has been called

    }
    // O(1) constant time complexity
    public void enqueue(T newData) {
        this.count++;
        Node<T> oldLastNode = this.lastNode;// Copy the last node in the queue
        this.lastNode = new Node<>(newData); // Set the last node to the newly enqueued node
        this.lastNode.setNextNode(null); // Set the last nodes pointer to null indicating it is the last node
        // If the queue is empty set the first node to the newly enqueued node
        if (isEmpty()) {
            this.firstNode = this.lastNode;
        } else {
            oldLastNode.setNextNode(this.lastNode); // Otherwise point the old last node to the newly enqueued node
        }
    }

    public T dequeue() {
        // Decrement counter as this is a direct correlation to the size of the queue
        this.count--;

        T dataToDequeus = this.firstNode.getData(); // Select first node of the queue
        this.firstNode = this.firstNode.getNextNode(); // Setting the first node of the queue to the node that the newly dequeued node was pointing to

        if (isEmpty()) {
            this.lastNode = null;
        }

        return dataToDequeus;
    }
}
