package vacunasgestor;

import Conexion.ArmadoDatosBD;
import Conexion.LoginData;
import Conexion.TurnoData;
import Conexion.VialData;
import Entidades.Turno;
import Entidades.Vacunatorio;
import java.time.LocalDate;


public class NewMain {

     public static void main(String[] args) {
//        TurnoData tD = new TurnoData();
////         tD.ponerAusentes(LocalDate.now());
//
//        ArmadoDatosBD adBS = new ArmadoDatosBD();
//        //adBS.armarTurnos_COMPLETAR_BASE_DATOS();
//       /// adBS.vacunar_Aleatorios();
//        tD.ponerAusentes(LocalDate.now().plusDays(30));

//        LoginData lD = new LoginData();
//        lD.armarClavesRandom(50000001);

        for (int i = 0; i < 300; i++){
        VialData vD = new VialData();
        vD.cargarViales();
        }
    }
    
}
