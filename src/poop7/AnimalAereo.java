package poop7;
/**
 *
 * @author peter
 */
public class AnimalAereo extends Animal{
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(String nombre, String lugarOrigen, String color, int numeroAlas) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }
    
    public void volar(){
        System.out.println("Volando...");
    }
    
    public void Comer(){
        System.out.println("Comiendo...");
    }

    @Override
    public String toString() {
        return "AnimalAereo{"+super.toString() + "numeroAlas=" + numeroAlas + '}';
    }
    
    
}
