package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class StockData {

    private Connection con = Conectar.getConectar();

    public void armarStocks() {
        String sql = "INSERT INTO stocks (idCentro,numeroSerie,Marca,fechaVencimiento,fechaUtilizacion,estado) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setInt(2, (int) (Math.random() * 1000000));
            String marca;
            switch ((int) (Math.random() * 10)) {
                case 0:
                case 1:
                    marca = "Pfizer";
                    break;
                case 2:
                case 3:
                    marca = "Johnson_Johnson";
                    break;
                case 4:
                case 5:
                    marca = "AstraZeneca";
                    break;
                case 6:
                case 7:
                    marca = "Sinopharm y Sinovac";
                    break;
                case 8:
                default:
                    marca = "Sputnik V";
                    
            }
            ps.setString(3, marca);
            
            LocalDate fechaVencimiento = LocalDate.now().plusDays(60);
            ps.setString(4, fechaVencimiento.toString());
            ps.setString(5, (LocalDate.now().minusYears(2023)).toString());
            ps.setInt(6,0);

            int updates = ps.executeUpdate();;
            } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El DNI ya se encuentra cargado en la bsae datos.");
            }
        }
    }
    
    public void solicitarViales(String marca){
        String sql = "INSERT INTO stocks (idCentro,numeroSerie,Marca,fechaVencimiento,fechaUtilizacion,estado) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setInt(2, (int) (Math.random() * 1000000));
            ps.setString(3, marca);
            LocalDate fechaVencimiento = LocalDate.now().plusDays(60);
            ps.setString(4, fechaVencimiento.toString());
            ps.setString(5, (LocalDate.now().minusYears(2023)).toString());
            ps.setInt(6,0);
            int updates = ps.executeUpdate();;
            } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El DNI ya se encuentra cargado en la bsae datos.");
            }
        }
    }
    }

