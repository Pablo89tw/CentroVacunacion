package vacunasgestor;

import Conexion.TurnoData;
import Entidades.Turno;
import Entidades.Vacunatorio;
import java.time.LocalDate;


public class NewMain {

     public static void main(String[] args) {
         TurnoData tD = new TurnoData();
         tD.ponerAusentes(LocalDate.now());
    }
    
}
