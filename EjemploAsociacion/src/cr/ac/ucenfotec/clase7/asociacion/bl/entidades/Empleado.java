package cr.ac.ucenfotec.clase7.asociacion.bl.entidades;
/**
 * Clase que crea una Empleado
 * @author Jesus Leon
 * @version 1.0 24/10/2020
 * @since 1.0
 */
import java.util.Objects;

public class Empleado {
    private String nombre;
    private String cedula;

    /**
     *
     * @return Nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre Nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return cedula del empleado
     */
    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula cedula del empleado
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Constructor con parametros nombre y cedula empleado
     * @param nombre
     * @param cedula
     */
    public Empleado(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    /**
     * Constructor vacio
     */
    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }

    /**
     *
     * @param o Objecto que se usa para evaluar si el retorno es True o False
     * @return retorna un objeto empleado y lo compara para validar si es el mismo
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o== null) return false;
        if (!(o instanceof Empleado)) return false;

        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) &&
                Objects.equals(cedula, empleado.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cedula);
    }
}

