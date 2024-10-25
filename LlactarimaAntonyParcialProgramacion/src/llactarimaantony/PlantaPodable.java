
package llactarimaantony;


public abstract class PlantaPodable extends Planta{
    
    public PlantaPodable(String nombre, int ubicacion, String climaP){
        super(nombre, ubicacion, climaP);
    }
    
    public void podar(){
        System.out.println("Se ha podado exitosamente.\nPlanta: "+ this.nombre+ "\nUbicacion: "+ this.ubicacion);
    }
    
}
