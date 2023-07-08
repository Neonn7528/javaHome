/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает 
первый элемент из очереди и удаляет его, first() - возвращает первый 
элемент из очереди, не удаляя. */
import java.util.LinkedList;

public class QueueUsingLinkedList<T> {
    private LinkedList<T> queue;

    public QueueUsingLinkedList() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.addLast(item);
        System.out.println("Enqueued element: " + item);
    }

    public T dequeue() {
        T removedElement = queue.pollFirst();
        System.out.println("Dequeued element: " + removedElement);
        return removedElement;
    }

    public T first() {
        T firstElement = queue.peekFirst();
        System.out.println("First element: " + firstElement);
        return firstElement;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        QueueUsingLinkedList<String> queue = new QueueUsingLinkedList<>();

        // Enqueue elements
        for (String item : linkedList) {
            queue.enqueue(item);
        }

        // Dequeue elements
        while (!queue.isEmpty()) {
            queue.dequeue();
        }
    }
}