package cr.ac.ucenfotec.clase7.asociacion.UI;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);
public void mostrarMenu(){
    System.out.println("Elija una opcion");
    System.out.println("1: Registrar una computadora");
    System.out.println("2: Registrar un empleado");
    System.out.println("3: Listar computardoras y su empleado responsable");
    System.out.println("4: Salir");
    }

    public int leeropcion(){
        output.println("Su opcion es: ");
        return input.nextInt();
    }

}
