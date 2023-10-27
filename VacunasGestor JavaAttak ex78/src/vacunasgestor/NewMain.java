package vacunasgestor;

import Conexion.ArmadoDatosBD;
import Conexion.Certificado;
import Conexion.LoginData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.VialData;
import Entidades.Ciudadano;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
import com.google.zxing.WriterException;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;


public class NewMain {

     public static void main(String[] args) throws IOException {
            ArmadoDatosBD aD = new ArmadoDatosBD();
           for (int i = 0; i < 100; i++) {
              aD.corregirAntigenos();
             i++;
         }
             
    }
}
     

