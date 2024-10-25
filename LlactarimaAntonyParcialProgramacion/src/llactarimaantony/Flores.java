
package llactarimaantony;

public class Flores extends Planta{
    private Temporada temporadaFlorecimiento;
    
    public Flores(String nombre, int ubicacion, String climaP, Temporada tFlorecimiento){
        super(nombre, ubicacion, climaP);
        this.temporadaFlorecimiento = tFlorecimiento;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ this.nombre+ "\nUbicacion: "+ this.ubicacion+"\nClima prospero: "+ this.climaProspero+
                "\nTemporada de Florecimiento: "+ this.temporadaFlorecimiento;
    }

}
