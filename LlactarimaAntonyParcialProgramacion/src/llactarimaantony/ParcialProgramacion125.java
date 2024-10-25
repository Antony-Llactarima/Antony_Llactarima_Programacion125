
package llactarimaantony;


public class ParcialProgramacion125 {


    public static void main(String[] args) {
        JardinBotanico j1 = new JardinBotanico();
        
        Arbol a1 = new Arbol("Manzano", 10, "Calido", 20.5);
        Arbol a2 = new Arbol("Manzano", 20, "Calido", 20.5);
        Arbusto b1 = new Arbusto("Verde", 30, "Frio", 4);
        Arbusto b2 = new Arbusto("Verde", 40, "Frio", 4);
        Flores f1 = new Flores("Margaritas", 50, "Caluroso", Temporada.VERANO);
        Flores f2 = new Flores("Amarillas", 60, "Fresco", Temporada.INVIERNO);
                
    }
    
}
