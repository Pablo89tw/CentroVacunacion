package Conexion;

import Entidades.Ciudadano;
import Entidades.Coordenadas;
import Entidades.Vacunatorio;
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
        PreparedStatement ps = null;ResultSet rs = null;
        Vacunatorio vac;
        Coordenadas cord1;
        String sql = "SELECT * FROM vacunatorio";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
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
        } finally {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
        }
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {         
        }
    }
        return arrayVacunatorios;
    }
    
    public Vacunatorio buscarVacunatorio(int idVacunatorio) {
        PreparedStatement ps = null; ResultSet rs = null;
        Vacunatorio vac = null;
        String sql = "SELECT * FROM vacunatorio WHERE idCentro = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idVacunatorio);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
               vac = new Vacunatorio();
               vac.setNombre(rs.getString("nombre"));
               vac.setDireccion(rs.getString("direccion"));
               vac.setEstado(rs.getBoolean("estado"));
               vac.setIdVacunatorio(rs.getInt("idCentro"));    
               Coordenadas cor1 = new Coordenadas();
               cor1.setLatitud(rs.getInt("latitud"));
               cor1.setLongitud(rs.getInt("longitud"));
               vac.setUbicacion(cor1);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        } finally {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
        }
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {         
        }
    }
        return vac;
    }
    
    public Vacunatorio buscarVacunatorio_xCiudadano(int DNI) {
        PreparedStatement ps = null; ResultSet rs = null;
        Vacunatorio vac = null;
        String sql = "SELECT idCentro FROM turno WHERE DNI = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, DNI);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
               vac = new Vacunatorio();
               vac.setIdVacunatorio(rs.getInt("idCentro"));
                }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        } finally {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
        }
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {         
        }
    }
        return vac;
    }

    public Vacunatorio vacunatorioCercano(Ciudadano c1) {
        double distancia;
        double min;
        Vacunatorio vac = new Vacunatorio();

        Vacunatorio vac1 = listarVacunatorio().get(0);
        min = Math.sqrt(((vac1.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud()) * (vac1.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud())) + ((vac1.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud()) * (vac1.getUbicacion().getLongitud() -  c1.getCordenadas().getLongitud())));

        for (Vacunatorio vacunatorio : listarVacunatorio()) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud())));
            if (min > distancia) {
                min = distancia;
            }
        }
        for (Vacunatorio vacunatorio : listarVacunatorio()) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud())));
            if (distancia == min) {
                vac = vacunatorio; 
             }
        }
        return vac;
    }
    
     public ArrayList<Vacunatorio> listarVacunatorioNombre(String nombre){
        arrayVacunatorios = new ArrayList<>();
        PreparedStatement ps = null; ResultSet rs = null;
        Vacunatorio vac;
        Coordenadas cord1;
        String sql = "SELECT * FROM vacunatorio WHERE Nombre LIKE ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,'%' + nombre + '%');
            
            rs = ps.executeQuery();
            
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
        } finally {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
        }
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {         
        }
    }
        return arrayVacunatorios;
    }
    
}
