
package llactarimaantony;

public class Arbol extends PlantaPodable{
    
    private double alturaMaxima;
    
    public Arbol(String nombre, int ubicacion, String climaP, double alturaMaxima){
        super(nombre, ubicacion, climaP);
        this.alturaMaxima = alturaMaxima;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ this.nombre+ "\nUbicacion: "+ this.ubicacion+"\nClima prospero: "+ this.climaProspero+
                "\nAltura Maxima: "+ this.alturaMaxima;
    }
}
