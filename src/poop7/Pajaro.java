package poop7;
/**
 *
 * @author peter
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String nombre, String lugarOrigen, String color, int numeroAlas, String tipoPico) {
        super(nombre, lugarOrigen, color, numeroAlas);
        this.tipoPico = tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public String getTipoPico() {
        return tipoPico;
    }
    
    public void recolectarRamas(){
        System.out.println("Recogiendo ramitas...");
    }

    @Override
    public String toString() {
        return "Pajaro{" +super.toString()+ "tipoPico=" + tipoPico + '}';
    }
    
}
