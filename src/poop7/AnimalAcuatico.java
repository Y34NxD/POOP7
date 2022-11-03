package poop7;
/**
 *
 * @author peter
 */
public class AnimalAcuatico extends Animal {
    private int numeroAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numeroAletas) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    public void nadar(){
        System.out.println("Nadaremos, nadaremos, en el mar mar mar...");
    }
    
    @Override
    public String toString() {
        return "AnimalAcuatico{"+super.toString()+ "numeroAletas=" + numeroAletas + '}';
    }

    
    
}
