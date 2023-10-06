package Conexion;

import Entidades.Ciudadano;
import Entidades.Medico;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TurnoData {
    private Connection con = Conectar.getConectar();
    
    public ArrayList<String> turnosLibres(LocalDate fecha, Vacunatorio vac) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM";
                 switch (vac.getIdVacunatorio()){
                case 1: sql += " turnero_1 WHERE fecha = ?";break;
                case 2: sql += " turnero_2 WHERE fecha = ?";break;
                case 3: sql += " turnero_2 WHERE fecha = ?";break;
            } 
        
        ArrayList<String> horarios =  new ArrayList();
        
        try {
           ps = con.prepareStatement(sql);
                   
         ps.setString(1, fecha.toString());
           
          rs = ps.executeQuery();
          if (rs.next()) {
            if(rs.getInt("8_9")>0){horarios.add("8 a 9");}
            if(rs.getInt("9_10")>0){horarios.add("9 a 10");}
            if(rs.getInt("10_11")>0){horarios.add("10 a 11");}
            if(rs.getInt("11_12")>0){horarios.add("11 a 12");}
            if(rs.getInt("12_13")>0){horarios.add("12 a 13");}
            if(rs.getInt("13_14")>0){horarios.add("13 a 14");}
            if(rs.getInt("14_15")>0){horarios.add("14 a 15");}
            if(rs.getInt("15_16")>0){horarios.add("15 a 16");}
            if(rs.getInt("16_17")>0){horarios.add("16 a 17");}
}
        } catch(SQLException ex){
            System.out.println("pepe");
        } 
        return horarios;
    } 
    
    public void cargarTurno(Vacunatorio vac, Ciudadano ciu, Turno tur, int refuerzo, Vial vial, Medico medico){
        String sql = "INSERT INTO turno (dni,fecha,horario,idCentro,codigoRefuerzo,idVial,idMedico,idTurno) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciu.getDNI());
            ps.setDate(2, (Date) Date.from(tur.getFecha().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            ps.setString(3, tur.getHorario());
            ps.setInt(4, vac.getIdVacunatorio());
          //  ps.setInt(5, codRefuerzo);  -> que onda esto?
            ps.setInt(6, vial.getNumeroSerie());
            ps.setInt(7, medico.getMatricula());
            ps.setInt(8,tur.getIdTurno());

            int updates = ps.executeUpdate();
            if (updates > 0) {
                actualizarVacunatorioT(tur);                 
            }
            if (updates == 0) {
                JOptionPane.showMessageDialog(null, "El alumno no ha sido cargado.");
            }
        } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El DNI ya se encuentra cargado en la bsae datos.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no ha sido cargado");
            }
        }
    }
    
    public void actualizarVacunatorioT(Turno tur){
        int check = 0; int cupos = 0;
        PreparedStatement ps = null;        
        String sql1 = "SELECT * FROM ";
        
        switch (tur.getVacunatorio().getIdVacunatorio()){
                case 1: sql1 += " turnero_1 WHERE fecha = ?";break;
                case 2: sql1 += " turnero_2 WHERE fecha = ?";break;
                case 3: sql1 += " turnero_2 WHERE fecha = ?";break;
            } 
             
        String sql2 = "UPDATE"; 
            
            switch (tur.getVacunatorio().getIdVacunatorio()){
                case 1: sql2 += " turnero_1 SET "+ tur.getHorario() + " = ? WHERE fecha = ?";break;
                case 2: sql2 += " turnero_3 SET "+ tur.getHorario() + " = ? WHERE fecha = ?";break;
                case 3: sql2 += " turnero_4 SET "+ tur.getHorario() + " = ? WHERE fecha = ?";break;
            }  
        try {
            ps = con.prepareStatement(sql1);
            ps.setString(1, tur.getFecha().toString());
           
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()){
                cupos = rs.getInt(tur.getHorario());
            }
         
           ps = null;
           ps = con.prepareStatement(sql2);
           ps.setInt(1, (cupos-1));
           ps.setString(2, tur.getFecha().toString());
            
            int fila = ps.executeUpdate();
            
            if (fila == 0) {
                System.out.println("No se editó el turnero");
            } else if (fila > 0){
                 System.out.println("turnero actualizado");
             }
            
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "No existe alumno cono ese id");
        } 
    }
    
    public Turno planVacunatorio(Turno turno){
        ArrayList<String> horarios;
        LocalDate fecha = turno.getFecha().plusDays(21);
        do {
            horarios = turnosLibres(turno.getFecha(),turno.getVacunatorio());
            fecha = fecha.plusDays(1);
        } while (horarios.isEmpty());
        Turno tur2 = new Turno(fecha, null,null);
        return tur2;
    }
}

