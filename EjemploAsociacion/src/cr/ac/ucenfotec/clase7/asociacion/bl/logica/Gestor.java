package cr.ac.ucenfotec.clase7.asociacion.bl.logica;

import cr.ac.ucenfotec.clase7.asociacion.bl.entidades.Computadora;
import cr.ac.ucenfotec.clase7.asociacion.bl.entidades.Empleado;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestor {
    public ArrayList <Computadora> compus = new ArrayList<>(10);
    public ArrayList <Empleado>empleados = new ArrayList<>(10);
    private static Scanner input = new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);
    public Gestor() {
    }

    public void agregarEmpleados(String nombre, String cedula) {
        Empleado nuevo = new Empleado(nombre, cedula);

        if (empleados.contains(nuevo)){
            System.out.println("El empleado ya existe, no se agregara");

        }else {
            System.out.println("El empleado no existe");
            empleados.add(nuevo);
            System.out.println("Elija : \n 1 : Asignar computador \n 2 : No asginar ");
            int opcion = input.nextInt();
            if(opcion ==1){
                int numLista = 0;
                System.out.println("Lista de Compus");

                for (int i = 0; i < compus.size(); i++) {
                    System.out.println(i + "--->" + compus.get(i).getNombre());
                    System.out.println("Seleccione un numero de la lista ");
                    numLista = input.nextInt();

                    asigarComputador(numLista,nuevo);

                }
            }
            System.out.println("Empleado agregado");
        }

    }
    public void agregarCompu(String nombre,String marca ){
        Computadora nueva = new Computadora(nombre,marca);
        compus.add(nueva);

    }
    public ArrayList<Empleado> listarEmpleados(){
        return this.empleados;
    }

    private void asigarComputador(int numLista, Empleado nuevo){
        compus.get(numLista).asignarCompuEm(nuevo);
}
public  ArrayList <Computadora>listarCompus(){
        return this.compus;
}

}
