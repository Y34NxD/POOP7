package poop7;
/**
 *
 * @author J34N
 */
public class POOP7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gerente ger = new Gerente();
        ger.setNombre("Jean Garcia");
        ger.setNumEmpleado(1);
        
        System.out.println("Nombre: "+ger.getNombre());
        System.out.println("NumEmpleado: "+ger.getNumEmpleado());
        System.out.println("Sueldo: "+ger.getSueldo());
        
        ger.setSueldo(10);
        System.out.println("Sueldo aumentado: "+ger.getSueldo());
        
        ger.setPresupuesto(100_000);
        System.out.println("Presupuesto: "+ger.getPresupuesto());
        
        Pajaro bird = new Pajaro();
        bird.setNombre("Piolin");
        bird.setLugarOrigen("CDMX");
        bird.setColor("Amarillo");
        bird.setNumeroAlas(2);
        bird.setTipoPico("Puntiagudo");
        
        System.out.println("Nombre: "+bird.getNombre());
        System.out.println("Lugar de origen: "+bird.getLugarOrigen());
        System.out.println("Color: "+bird.getColor());
        System.out.println("Numero de alas: "+bird.getNumeroAlas());
        System.out.println("Tipo de pico: "+bird.getTipoPico());
        bird.sonido();
        
        Ballena whale = new Ballena();
        whale.setNombre("Big coke");
        whale.setLugarOrigen("Oceano pacifico");
        whale.setColor("Azulito");
        whale.setNumeroAletas(2);
        whale.setLargo(24);
        
        System.out.println("Nombre: "+whale.getNombre());
        System.out.println("Lugar de origen: "+whale.getLugarOrigen());
        System.out.println("Color: "+whale.getColor());
        System.out.println("Numero de alas: "+whale.getNumeroAletas());
        System.out.println("Tamaño: "+whale.getLargo()+" m");
        whale.pelearConPinocho();
        whale.nadar();
        
        Perro dog = new Perro();
        dog.setNombre("Spike");
        dog.setLugarOrigen("Asia");
        dog.setColor("Cafecito");
        dog.setNumeroPatas(4);
        dog.setColorCollar("Rojo");
        
        System.out.println("Nombre: "+dog.getNombre());
        System.out.println("Lugar de origen: "+dog.getLugarOrigen());
        System.out.println("Color: "+dog.getColor());
        System.out.println("Numero de patas: "+dog.getNumeroPatas());
        System.out.println("Color del collar: "+dog.getColorCollar());
        dog.hacerTrucos();
        dog.correr();
        dog.comer();
    }
}
