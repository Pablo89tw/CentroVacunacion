package vacunasgestor;

import Conexion.ArmadoDatosBD;
import Conexion.LoginData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.VialData;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
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

        LoginData lD = new LoginData();
        lD.armarClavesRandom(50000002);

//            VialData vD = new VialData();
//            for (Vial viales : vD.listarViales(0, 1)) {
//                System.out.println(viales);
//            }

}}
