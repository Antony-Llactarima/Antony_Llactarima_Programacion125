
package llactarimaantony;


public abstract class Planta {
    
    protected String nombre;
    protected int ubicacion;
    protected String climaProspero;
    
    public Planta(String nombre, int ubicacion, String climaP){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.climaProspero = climaP;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean res = false;
        
        if(obj == null){
            return false;
        }
        
        if(obj instanceof Planta){
            Planta plantaDiferente = (Planta)obj;
            if(plantaDiferente.nombre == this.nombre && plantaDiferente.ubicacion == this.ubicacion){
                res = true;
            }else{
                throw new PlantaRepetidaException();
            }
        }
        return res;
    }
        
}
