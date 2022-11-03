package poop7;
/**
 *
 * @author J34N
 */
public class Empleado extends Object{
    private String nombre;
    private int numEmpleado, sueldo;

    public Empleado() {
        this.sueldo = 10_000;
    }

    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    
    /**
     * 
     * @return Regresa el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return Regresa el numero del empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * 
     * @return Regresa la cantidad del sueldo que recibe
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * Método que modifica el valor del nombre
     * @param nombre El nombre de un empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que modifica el numero de empleado
     * @param numEmpleado El numero de empleado
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * Método que modifica el sueldo
     * @param porcentaje El sueldo que recibe
     */
    public void setSueldo(int porcentaje) {
        this.sueldo += (int)(this.sueldo * porcentaje / 100);
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + 
                ", numEmpleado=" + numEmpleado + 
                ", sueldo=" + sueldo + '}';
    }
}
