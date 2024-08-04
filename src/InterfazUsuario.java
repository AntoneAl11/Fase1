import java.util.Scanner;

public class InterfazUsuario {
    private Pilas pilas;
    private Colas colas;
    private Listas listas;
    private Scanner scanner;

    public InterfazUsuario(){
        pilas = new Pilas();
        colas = new Colas();
        listas = new Listas();
        scanner = new Scanner(System.in);
    }

    public void inciar(){
        while(true){
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar tarea urgente (Pila)");
            System.out.println("2. Ver tarea urgente (Pila)");
            System.out.println("3. Eliminar tarea urgente (Pila)");
            System.out.println("4. Agregar tarea programada (Cola)");
            System.out.println("5. Ver tarea programada (Cola)");
            System.out.println("6. Eliminar tarea programada (Cola)");
            System.out.println("7. Agregar tarea por departamento (Lista)");
            System.out.println("8. Eliminar tarea por departamento (Lista)");
            System.out.println("9. Ver todas las tareas por departamento (Lista)");
            System.out.println("10. Salir");

            int opción = scanner.nextInt();
            scanner.nextLine(); //Consume salto de linea

            switch (opción) {
                case 1:
                System.out.println("Ingresa la tarea urgente: ");
                String utask = scanner.nextLine();
                pilas.push(utask);
                break;
                
                case 2:
                System.out.println("Tarea Urgente: " + pilas.peek());
                break;

                case 3:
                System.out.println("Eliminando tarea urgente: " + pilas.pop());
                break;

                case 4: 
                System.out.println("Ingrese la tarea programada: ");
                String tprog = scanner.nextLine();
                colas.enqueue(tprog);
                break;

                case 5:
                System.out.println("Tarea programada: " + colas.front());
                break;

                case 6: 
                System.out.println("Eliminando la tarea programada: " + colas.dequeue());
                break;

                case 7:
                System.out.println("Ingrese la tarea por departamento: ");
                String tdep = scanner.nextLine();
                listas.insert(tdep);
                break;

                case 8:
                System.out.println("Ingrese la tarea a eliminar: ");
                String teli = scanner.nextLine();
                listas.delete(teli);
                break;

                case 9:
                System.out.println("Tareas por deparatamento: ");
                for (String tarea : listas.getAll()){
                    System.out.println(tarea);
                }
                break;

                case 10:
                System.out.println("Saliendo del sistema.....");
                return;

                default:
                System.out.println("Opción ingresada no valida");
            }
        }
    }
    public static void main(String[] args) {
        InterfazUsuario interfaz = new InterfazUsuario();
        interfaz.inciar();
    }

}
