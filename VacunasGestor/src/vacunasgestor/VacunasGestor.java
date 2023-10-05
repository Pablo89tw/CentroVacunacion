package vacunasgestor;

import Conexion.StockData;

public class VacunasGestor {

    public static void main(String[] args) {
        
//        CiudadanoData pg = new CiudadanoData();
//        Ciudadano c1 = new Ciudadano();
//        c1.setDNI(34508715);
//             
//        pg.patologias(c1, false, false, true, false, true, true, false, false, true);
        
        StockData aD = new StockData();
        for (int i = 0; i < 600; i++) {
            aD.cargarViales();
        }
       
        
    }
    
}
