package Conexion;

import Entidades.Coordenadas;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VacunatorioData {

    private Connection con = Conectar.getConectar();
    private ArrayList<Vacunatorio> arrayVacunatorios;
    
    public ArrayList<Vacunatorio> listarVacunatorio() {
        arrayVacunatorios = new ArrayList<>();
        PreparedStatement ps = null;
        Vacunatorio vac;
        Coordenadas cord1;
        String sql = "SELECT * FROM vacunatorio";
        
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                vac = new Vacunatorio();
                    vac.setIdVacunatorio(rs.getInt("idCentro"));
                    vac.setNombre(rs.getString("Nombre"));
                        cord1 = new Coordenadas();
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
    
//     private Vial cargarVial(Vacunatorio vac){
//        PreparedStatement ps = null;
//        String sql = "SELECT idVial FROM viales INNER JOIN vacunatorio ON vacunatorio.idCentro = viales.idCentro WHERE viales.estado = 0 && vacunatorio.idCentro = ?";
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(vac.getIdVacunatorio());
//            ResultSet rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                vac = new Vacunatorio();
//                    vac.setIdVacunatorio(rs.getInt("idCentro"));
//                    vac.setNombre(rs.getString("Nombre"));
//                        cord1 = new Coordenadas();
//                        cord1.setLatitud(rs.getDouble("latitud"));
//                        cord1.setLongitud(rs.getDouble("longitud"));
//                    vac.setUbicacion(cord1);
//                    vac.setDireccion(rs.getString("direccion"));
//                
//                arrayVacunatorios.add(vac);
//            }
//        } catch (SQLException sqlE) {
//            JOptionPane.showMessageDialog(null, "Error busqueda");
//        }
//        return arrayVacunatorios;
//    }
//        
//
//        
//       return vial;
//    }
}
