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



}
