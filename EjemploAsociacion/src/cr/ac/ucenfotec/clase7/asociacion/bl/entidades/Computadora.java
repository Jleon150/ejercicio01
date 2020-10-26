package cr.ac.ucenfotec.clase7.asociacion.bl.entidades;
/**
 * Clase que crea una computadora
 * @author Jesus Leon
 * @version 1.0 24/10/2020
 *
 */
import java.util.ArrayList;

public class Computadora {
    private String nombre;
    private String marca;
    private ArrayList<Empleado> empleadoslista = new ArrayList<>();

    /**
     *
     * @return Retorna el nombre de la computadora
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre Nombre de la computadora
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return Marca de la computadora
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca Marca de la computadora
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return Arralyst que almacena objetos tipo Empleado para asignarles computadoras
     */

   public ArrayList<Empleado> getEmpleadoslista() {
        return empleadoslista;
    }

    /**
     *
     * @param empleadoslista Metodo que recibe el
     *    Arralyst que almacena objetos tipo Empleado para asignarles computadoras
     */
    public void setEmpleadoslista(ArrayList<Empleado> empleadoslista) {
        this.empleadoslista = empleadoslista;
    }

    /**
     * Constructor vacio de computadora
     */
    public Computadora() {
    }

    /**
     * Constructor con parametro nombre y marca de la computadora
     * @param nombre
     * @param marca
     */
    public Computadora(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;

    }

    /**
     * Metodo que se utiliza para recibir un objeto tipo enmpleado y agregarlo al arreglo empleadolista
     * @param nuevo Empleado nuevo
     */
    public void asignarCompuEm(Empleado nuevo){getEmpleadoslista().add(nuevo);}

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Computadora{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", empleadoslista=" + empleadoslista +
                '}';
    }
}
