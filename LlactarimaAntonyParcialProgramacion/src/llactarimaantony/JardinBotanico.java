
package llactarimaantony;
import java.util.ArrayList;

public class JardinBotanico {
    
    //ATRIBUTOS
    private ArrayList<Planta> Plantas;
    
    //CONSTRUCTOR
    public JardinBotanico(){
        this.Plantas = new ArrayList<>();
    }
    
    //METODOS
    public void agregarPlanta(Planta plantaNueva){
        if(!this.Plantas.isEmpty()){
            int i = 0;
            
            while(i < this.Plantas.size() && !this.Plantas.get(i).equals(plantaNueva)){
                i++;
            }
            try{
                if(i == this.Plantas.size()){
                    this.Plantas.add(plantaNueva);
                }else{
                    throw new PlantaRepetidaException();
                }
            }catch(PlantaRepetidaException ex){
                System.out.println("Planta repetida");
            }
                        
            
        }else{
            this.Plantas.add(plantaNueva);
        }
    }
    
    public void mostrarPlantas(){
        if(!this.Plantas.isEmpty()){
            for(Planta p : this.Plantas){
                System.out.println(p);
                System.out.println("---------------------------------------");
            }
        }
        
        
        
        
        
        
        
    }
    
    
}
