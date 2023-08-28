public class TestMyQueue {
    public static void main(String[] args) throws Exception {

        // Crear una cola de enteros
        // En este caso, la cola es de enteros, pero puede ser de cualquier tipo de dato
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Imprimir el primer elemento de la cola
        System.out.println(queue.front()); // Salida: 1
        queue.dequeue();

        System.out.println(queue.front()); // Salida: 2

    }
}
