package poop7;
/**
 *
 * @author peter
 */
public class AnimalTerrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }
    
    public void correr(){
        System.out.println("Corriendo...");
    }
    
    public void Comer(){
        System.out.println("Comiendo...");
    }

    @Override
    public String toString() {
        return "AnimalTerrestre{" +super.toString()+ "numeroPatas=" + numeroPatas + '}';
    }
    
    
}
