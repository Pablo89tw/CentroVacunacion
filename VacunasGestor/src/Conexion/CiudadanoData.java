package Conexion;

import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CiudadanoData {
    private Connection con = Conectar.getConectar();
    
    public int cargaCiudadano(Ciudadano c1){
    int updates = 0;
    String sql = "INSERT INTO ciudadano (dni,apellido,nombre,email,celular,ambitoTrabajo) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c1.getDNI());
            ps.setString(2, c1.getApellido());
            ps.setString(3, c1.getNombre());
            ps.setString(4, c1.getEmail());
            ps.setInt(5, c1.getCelular());
            ps.setString(6, c1.getAmbitoTrabajo());
           
            updates = ps.executeUpdate();;
            if (updates > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion Correcta");
            }
            if (updates == 0) {
                JOptionPane.showMessageDialog(null, "No ha podido inscribirse. Reintente.");
            }
        } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El DNI ya se encuentra cargado en la bsae datos.");
            }
        }
        return updates;
    }
}
