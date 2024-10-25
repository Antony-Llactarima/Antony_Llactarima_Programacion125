
package llactarimaantony;

public class Arbusto extends PlantaPodable{
    
    private int densidadFollaje;
    private static final int MAXIMADENSIDAD = 10;
    private static final int MINIMADENSIDAD = 1;
    
    public Arbusto(String nombre, int ubicacion, String climaP, int densidad){
        super(nombre, ubicacion, climaP);
        this.densidadFollaje = densidad;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ this.nombre+ "\nUbicacion: "+ this.ubicacion+"\nClima prospero: "+ this.climaProspero+
                "\nDensidad del follaje: "+ this.densidadFollaje;
    }
}
