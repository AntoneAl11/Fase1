import java.util.Stack;

public class Pilas {
    //Se utiliza la clase stack para implementar una pila
    private Stack<String> pila;
    //Se incializa una pila vacia
    public Pilas (){
        pila = new Stack<>();
    }
    //agrega una tarea a la pila
    public void push (String tarea) {
        pila.push(tarea);
    }
    //Elimina y devuelve la tarea mas reciente (La ultima que se ingreso)
    public String pop(){
        return pila.isEmpty() ? null : pila.pop();
    }
    //Muestra la tarea mas reciente ingresada
    public String peel(){
        return pila.isEmpty() ? null : pila.peek();
    }
    //Verifica si la pila esta vacia
    public boolean isEmpty(){
        return pila.isEmpty();
    }
}
