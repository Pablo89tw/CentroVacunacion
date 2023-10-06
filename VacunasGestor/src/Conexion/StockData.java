package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class StockData {

    private Connection con = Conectar.getConectar();

    public void cargarViales() {
        String sql = "INSERT INTO viales (numeroSerie,Marca,Antigeno,fechaVencimiento,idLaboratorio,estado,idVacunatorio,fechaColocacion) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            String marca; String antigeno; int idLabora;
            switch ((int) (Math.random() * 10)) {
                case 0:
                case 1:
                    marca = "Pfizer";
                    antigeno = "ARN mensajero (ARNm)";
                    idLabora = 1;
                    break;
                case 2:
                case 3:
                    marca = "Johnson_Johnson";
                    antigeno = "Partículas SARS-CoV-2 desactivadas";
                    idLabora = 2;
                    break;
                case 4:
                case 5:
                    marca = "AstraZeneca";
                    antigeno = "Proteína de pico del virus SARS-CoV-2";
                    idLabora = 3;
                    break;
                case 6:
                case 7:
                    marca = "Sinopharm y Sinovac";
                    antigeno = "Partículas SARS-CoV-2 desactivadas"; 
                    idLabora = 4;
                    break;
                case 8:
                default:
                    marca = "Sputnik V";
                    antigeno = "Adenovirus Ad26 y Ad5";
                    idLabora = 5;
                                       
            }
            ps.setInt(1, (int) (Math.random() * 1000000));
            ps.setString(2, marca);
            ps.setString(3,antigeno);
            LocalDate fechaVencimiento = LocalDate.now().plusDays(90);
            ps.setString(4, fechaVencimiento.toString());
            ps.setInt(5,idLabora);
            ps.setInt(6,0);
            ps.setInt(7,(int) Math.floor(Math.random() * 3) + 1);
            ps.setDate(8,null);

            int updates = ps.executeUpdate();;
            } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El numero serie ya se encuentra cargado en la bsae datos.");
            }
        }
    }
    
  
    }
