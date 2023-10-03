package vacunasgestor;

import Conexion.PatologiaData;
import Entidades.Ciudadano;
import Entidades.Patologias;

public class VacunasGestor {

    public static void main(String[] args) {
        
        PatologiaData pg = new PatologiaData();
        Ciudadano c1 = new Ciudadano();
        c1.setDNI(34508715);
             
        pg.patologias(c1, false, false, true, false, true, true, false, false, true);
        
        
        
    }
    
}
