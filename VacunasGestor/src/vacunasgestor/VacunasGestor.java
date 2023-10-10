package vacunasgestor;

import Conexion.StockData;
import Conexion.TurnoData;
import java.time.LocalDate;

public class VacunasGestor {

    public static void main(String[] args) {
        
//        CiudadanoData pg = new CiudadanoData();
//        Ciudadano c1 = new Ciudadano();
//        c1.setDNI(34508715);
//             
//        pg.patologias(c1, false, false, true, false, true, true, false, false, true);
        
//        StockData aD = new StockData();
//        for (int i = 0; i < 600; i++) {
//            aD.cargarViales();
//        }

            TurnoData tD = new TurnoData();
            LocalDate fecha = LocalDate.now().minusDays(8);
                      
            for (int i = 1; i < 150; i++) {
             tD.acomodarTurnero(fecha);
             fecha = fecha.plusDays(1);
        }
            
            
    
    }
    
}
