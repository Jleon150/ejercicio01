package cr.ac.ucenfotec.clase7.asociacion.controlador;

import cr.ac.ucenfotec.clase7.asociacion.UI.UI;
import cr.ac.ucenfotec.clase7.asociacion.bl.entidades.Computadora;
import cr.ac.ucenfotec.clase7.asociacion.bl.entidades.Empleado;
import cr.ac.ucenfotec.clase7.asociacion.bl.logica.Gestor;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public void ejecutarPrograma(){
        int opcion = 0;
        do{
        interfaz.mostrarMenu();
        opcion = interfaz.leeropcion();
        procesarOpcion(opcion);

        }while(opcion!=4);

    }
    public void procesarOpcion(int opcion){
        switch(opcion){
            case 1 :
                System.out.println("Registrar una computadora");
                registarComputadora();
                System.out.println("Digite cualquier tecla para continuar");
                String b = input.next();

                break;
            case 2 :
                System.out.println("Registrar un empleado");
                registarEmpleado();

                System.out.println("Digite cualquier tecla para continuar");
                String a = input.next();

                break;
            case 3 :
                System.out.println("Listar");
                System.out.println("Listas computadoras y su empleado responsable");
                mostrarCompus();
                mostrarEmpleados();
                String c = input.next();
                break;

            case 4 :
                System.out.println("Has elegido la opcion salir");
                break;
            default:
                System.out.println("Opcion Salir");

        }
    }

    private void registarComputadora() {
        System.out.println("Nombre de la computadora");
        String nombre = input.next();
        System.out.println("Marca");
        String marca = input.next();
        gestor.agregarCompu(nombre,marca);
    }

    private void registarEmpleado(){
        System.out.println("Nombre del empleado");
        String nombre = input.next();
        System.out.println(" Cedula del empleado");
        String cedula = input.next();
        gestor.agregarEmpleados(nombre,cedula);


    }
    public void mostrarCompus(){
        ArrayList<Computadora> listaCom = gestor.listarCompus();
        for (int i = 0; i < listaCom.size(); i++) {
            System.out.println(listaCom.get(i).toString());
        }
    }
    public void mostrarEmpleados(){
        ArrayList<Empleado> listemp = gestor.listarEmpleados();
        for (int i = 0; i < listemp.size(); i++) {
            System.out.println(listemp.get(i).toString());
        }
    }

}
