package vacunasgestor;

import Conexion.ArmadoDatosBD;
import Conexion.Certificado;
import Conexion.GeneradorQR;
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
//         Certificado cF = new Certificado();
//         Ciudadano c1 = new Ciudadano();
//         Turno t1 = new Turno();
//         Vial v1 = new Vial();
//         Vacunatorio vac1 = new Vacunatorio();
//         c1.setApellido("marta");
//         c1.setNombre("perez");
//         c1.setDosisAplicadas(1);
//         v1.setMarca("pepe");
//         v1.setNumeroSerie(14);
//         
//         vac1.setNombre("manta");
//         vac1.setDireccion("por allá!");
//         
//         t1.setVial(v1);
//         t1.setVacunatorio(vac1);
//         
         //cF.ArmadoCertificadoDosis1(c1, t1);
        
    }
}
     

