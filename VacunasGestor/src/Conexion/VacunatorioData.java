package Conexion;


import Entidades.Coordenadas;
import Entidades.Vacunatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class VacunatorioData {
    private Connection con = Conectar.getConectar();
    private ArrayList<Vacunatorio> arrayVacunatorios;
      
    public ArrayList<Vacunatorio> listarVacunatorio(){
        arrayVacunatorios = new ArrayList<>();
        PreparedStatement ps = null;

        String sql = "SELECT * FROM vacunatorio";

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Vacunatorio vac = new Vacunatorio();
                vac.setNombre(rs.getString("Nombre"));
                Coordenadas cord1 = new Coordenadas();
                cord1.setLatitud(rs.getDouble("latitud"));
                cord1.setLongitud(rs.getDouble("longitud"));
                vac.setUbicacion(cord1);
                vac.setDireccion(rs.getString("direccion"));
                
                arrayVacunatorios.add(vac);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return arrayVacunatorios;
    }
        
 
  }
    


