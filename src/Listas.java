import java.util.ArrayList;
import java.util.List;

public class Listas {
    //Utilizmos una lista simple (Implementada por ArrayList)
    private List<String> lista;
    //Inicializamos una lista
    public Listas(){
        lista = new ArrayList<>();
    }
    //Agregar una tarea a la lista
    public void insert(String tarea){
        lista.add(tarea);
    }
    //Eliminar una tarea en la lista
    public void delete(String tarea){
        lista.remove(tarea);
    }
    //Verificar si una tarea esta en la lista
    public boolean find (String tarea){
        return lista.contains(tarea);
    }
    //Devuelve todas las tareas de la lista
    public List<String> getAll(){
        return lista;
    }

}
