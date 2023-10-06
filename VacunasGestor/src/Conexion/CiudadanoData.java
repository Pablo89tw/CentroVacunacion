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
    String sql = "INSERT INTO ciudadano (dni,apellido,nombre,latitud,longitud,email,celular,ambitoTrabajo,dosisAplicadas,fechaProxCita) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c1.getDNI());
            ps.setString(2, c1.getApellido());
            ps.setString(3, c1.getNombre());
            ps.setDouble(4,c1.getCordenadas().getLatitud());
            ps.setDouble(5,c1.getCordenadas().getLongitud());
            ps.setString(6, c1.getEmail());
            ps.setInt(7, c1.getCelular());
            ps.setString(8, c1.getAmbitoTrabajo());
            ps.setInt(9,0);
            ps.setDate(10, c1.getProximoTurno());
           
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
    
    public void patologias(Ciudadano ciudadano, boolean EC, boolean D, boolean EResC, boolean I, boolean O, boolean ERenC, boolean E, boolean EHC, boolean EN, String otra) {
        
        int exito = 0, comas = 0, sqlPosicion = 1;
        String sql = "INSERT INTO patologias (DNI";
            
        if (EC != false) {sql += ", Cardiovasculares";comas++;}
        if (D != false) {sql += ", Diabetes";comas++;}
        if (EResC != false) {sql += ", Respiratorias_cronicas";comas++;}
        if (I != false) {sql += ", Inmunosupresion";comas++;}
        if (O != false) {sql += ", Obesidad";comas++;}
        if (ERenC != false) {sql += ", Renales_cronicas";comas++;}
        if (E != false) {sql += ", Embarazo";comas++;}
        if (EHC != false) {sql += ", Hepaticas_cronicas";comas++;}
        if (EN != false) {sql += ", Neurologicas";comas++;}
        if (otra != null) {sql += ", otra";comas++;}

        sql += ") VALUES (?";
        if (comas!=0){sql +=",";}
        for (int i = 1; i < comas; i++) {
            sql += "?,";
        }
        sql += "?)";
        
        System.out.println(sql);
       
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ciudadano.getDNI());
            
            boolean[] valores = {EC, D, EResC, I, O, ERenC, E, EHC, EN};
            for (int i = 2; i < valores.length; i++) {
                if (valores[i] != false) {
                    sqlPosicion++;
                    ps.setBoolean(sqlPosicion, valores[i]);
                }
            }
            if (otra != null) {
                sqlPosicion++;
                ps.setString(sqlPosicion, otra);
                }

            exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Patologias Cargadas.");
            } 

        } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El DNI ya se encuentra cargado en la bsae datos.");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }

     
     
     
     
}
