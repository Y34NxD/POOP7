package poop7;
/**
 *
 * @author peter
 */
public class Ballena extends AnimalAcuatico{
    private int largo;

    public Ballena() {
    }

    public Ballena(String nombre, String lugarOrigen, String color, int numeroAletas,int largo) {
        super(nombre, lugarOrigen, color, numeroAletas);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo =(int)(largo);
    }
   
    public void pelearConPinocho(){
        System.out.println("Estoy peleando con Pinocho y Yepeto");
    }

    @Override
    public String toString() {
        return "Ballena{" +super.toString()+ "largo=" + largo + '}';
    }
    
    
}
