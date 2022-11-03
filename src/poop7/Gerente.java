package poop7;
/**
 *
 * @author J34N
 */
public class Gerente extends Empleado{
    private int presupuesto;

    public Gerente() {
    }

    public Gerente(String nombre, int numEmpleado, int sueldo,int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    /**
     * 
     * @param presupuesto Cantidad para asignar el presupuesto
     */
    public void setPresupuesto(int presupuesto) {
        if(presupuesto < 0){
            System.out.println("Cantidad incorrecta");
            presupuesto = 0;
        }
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @return Regresa el presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    
    @Override
    public String toString() {
        return "Gerente{" +super.toString()+ "presupuesto=" + presupuesto + '}';
    }
    
}
