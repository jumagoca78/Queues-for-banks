import java.util.LinkedList;


//Declaración de una cola genérica
//T es el tipo de dato que se va a almacenar en la cola 
//Se utiliza una lista enlazada para almacenar los elementos
//Se implementan los métodos enqueue, dequeue, front, isEmpty y size
//Se utiliza la clase LinkedList de Java
public class MyQueue<T> {
    private LinkedList<T> list = new LinkedList<T>();

    // Agregar un elemento al final
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Eliminar el primer elemento
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Ver el primer elemento sin eliminarlo
    public T front() {
        return list.getFirst();
    }

    // Determinar si la cola está vacía
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Determinar el número de elementos en la cola
    public int size() {
        return list.size();
    }
}
