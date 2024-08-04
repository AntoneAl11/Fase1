import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    //Utilizamos la clase Queue para crear una cola (Implemetada por LinkedList)
    private Queue<String> cola;
    //Inicializamos una cola vacia
    public Colas (){
        cola = new LinkedList<>();
    }
    //Agrega una tarea al final de la cola
    public void enqueue(String tarea){
        cola.add(tarea);
    }
    //Elimina y devuleve la tarea mas antigua
    public String dequeue(){
        return cola.isEmpty() ? null : cola.poll();
    }
    //Muestra la tarea mas antigua
    public String front(){
        return cola.isEmpty() ? null : cola.peek();
    }
    //Verifica si la cola esta vacia
    public boolean isEmpty(){
        return cola.isEmpty();
    }
}
