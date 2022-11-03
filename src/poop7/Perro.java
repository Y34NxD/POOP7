package poop7;
/**
 *
 * @author peter
 */
public class Perro extends AnimalTerrestre{
    private String colorCollar;

    public Perro() {
    }

    public Perro(int numeroPatas, String nombre, String lugarOrigen, String color,String colorCollar) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return colorCollar;
    }
    
    public void hacerTrucos(){
        System.out.println("Haciendo marometa...");
    }

    @Override
    public String toString() {
        return "Perro{" +super.toString()+ "colorCollar=" + colorCollar + '}';
    }
   
}
