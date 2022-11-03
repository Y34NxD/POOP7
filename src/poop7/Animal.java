package poop7;
/**
 *
 * @author peter
 */
public class Animal extends Object{
    private String nombre;
    private String lugarOrigen;
    private String color;

    public Animal() {
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void sonido(){
        System.out.println("Emitiendo sonido...");
    }
    
    public void comer(){
        System.out.println("Comiendo...\n");
    }
    
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + 
                ", lugarOrigen=" + lugarOrigen + 
                ", color=" + color + '}';
    }
    
    
    
    
}
