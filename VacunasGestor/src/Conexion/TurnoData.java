package Conexion;

import Entidades.Ciudadano;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TurnoData {
    private Connection con = Conectar.getConectar();
    
    private VacunatorioData vD = new VacunatorioData();
    
    public ArrayList<String> turnosLibres(LocalDate fecha, Vacunatorio vac) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM";
                 switch (vac.getIdVacunatorio()){
                case 1: sql += " turnero_1 WHERE fecha = ?";break;
                case 2: sql += " turnero_2 WHERE fecha = ?";break;
                case 3: sql += " turnero_3 WHERE fecha = ?";break;
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
       
    public void actualizarTurneroVacunatorio(Turno tur){
        int check = 0; int cupos = 0;
        PreparedStatement ps = null; 
                   
        String sql2 = "UPDATE"; 
        switch (tur.getVacunatorio().getIdVacunatorio()){
                case 1: sql2 += " turnero_1 SET ";break;
                case 2: sql2 += " turnero_2 SET ";break;
                case 3: sql2 += " turnero_3 SET ";break;
            }  
        
        switch(tur.getFecha().getHour()){
            case 8: sql2 += "8_9 = 8_9 - 1";break;
            case 9: sql2 += "9_10 = 9_10 - 1";break;
            case 10: sql2 += "10_11 = 10_11 - 1";break;
            case 11: sql2 += "11_12 = 11_12 - 1";break;
            case 12: sql2 += "12_13 = 12_13 - 1";break;
            case 13: sql2 += "13_14 = 13_14 - 1";break;
            case 14: sql2 += "14_15 = 14_15 - 1";break;
            case 15: sql2 += "15_16 = 15_16 - 1";break;
            case 16: sql2 += "16_17 = 16_17 - 1";break;
        }            
            sql2 += " WHERE fecha = ?";
           
        try {
           ps = con.prepareStatement(sql2);
           ps.setString(1, tur.getFecha().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toString());
            
            int fila = ps.executeUpdate();
            
            if (fila == 0) {
                System.out.println("No se editó el turnero");
            } else if (fila > 0){
                 System.out.println("turnero actualizado");
             }
            
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "");
        } 
    }
          
    public Turno datosTurno(int dni_ciudadano){
      String sql2 = "SELECT * FROM turno WHERE DNI = ?";  
      Turno turno1 = new Turno();
      PreparedStatement ps;  
      try{
         ps = con.prepareStatement(sql2);
         ps.setInt(1,dni_ciudadano);
         
         ResultSet rs2 = ps.executeQuery();
         
         if (rs2.next()){
             Object fechaTurnoObjeto = rs2.getObject("fechaTurno");
             if (fechaTurnoObjeto != null) {
             LocalDateTime fechaTurno = ((Timestamp) fechaTurnoObjeto).toLocalDateTime();
             turno1.setFecha(fechaTurno);
             }
             turno1.setVacunatorio(vD.buscarVacunatorio(rs2.getInt("idCentro")));
         }
        } catch (SQLException e){}
        return turno1;
    }
    
    public Vacunatorio buscarVacunatorioDNI(int DNI) {
        PreparedStatement ps = null;
        Vacunatorio vac = null;
        String sql = "SELECT idCentro FROM turno WHERE DNI = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, DNI);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
               vac = new Vacunatorio();
               vac.setIdVacunatorio(rs.getInt("idCentro"));
                }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return vac;
    }
    
    
    public Vial confirmacionTurno_1(Ciudadano c1){
        Vial vial = new Vial();
        ArrayList<Vial> lista_viales = new ArrayList<>();
        String sql1 = "SELECT * FROM viales WHERE Estado = 0 AND idVacunatorio = ?";
               
        PreparedStatement ps;
        
        try{
            ps = con.prepareStatement(sql1);
            ps.setInt(1,buscarVacunatorioDNI(c1.getDNI()).getIdVacunatorio());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                vial.setIdVial(rs.getInt("idVial"));
                vial.setNumeroSerie(rs.getInt("numeroSerie"));
                vial.setFechaVencimiento(rs.getDate("FechaVencimiento").toLocalDate());
                vial.setMarca(rs.getString("marca"));
                vial.setAntigeno(rs.getString("antigeno"));
                lista_viales.add(vial);
            } 
                if (lista_viales.isEmpty()){
                JOptionPane.showMessageDialog(null, "Faltante de STOCK");
            }
                confirmacionTurno_2(lista_viales.get(0), c1);
        }catch (SQLException e){}
        
        return vial;  
    }
    
    private void confirmacionTurno_2(Vial vial, Ciudadano c1){
        
        String sql2 = "UPDATE turno SET idVial = ?, estado = ?, codigoRefuerzo = codigoRefuerzo + 1 WHERE DNI = ?";
        String sql3 = "UPDATE viales SET estado = 1, fechaColocacion = ? WHERE idVial = ?";
        String sql4 = "UPDATE ciudadano SET dosisAplicadas = dosisAplicadas + 1 WHERE DNI = ?";
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql2);
            ps.setInt(1, vial.getIdVial());
            ps.setInt(2,1);
            ps.setInt(3, c1.getDNI());
            
            int resultado = ps.executeUpdate();
                        
        } catch (SQLException e){System.out.println("Error 1");}
        
        ps = null;
        
        try {
            ps = con.prepareStatement(sql3);
            Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
            ps.setTimestamp(1, timestamp);
            ps.setInt(2,vial.getIdVial());
            
            int resultade = ps.executeUpdate();
        } catch (SQLException e){System.out.println("Error2");}
        
    
        ps = null;
        
        try {
            ps = con.prepareStatement(sql4);
            ps.setInt(1,c1.getDNI());
            
            int resultade = ps.executeUpdate();
        } catch (SQLException e){System.out.println("Error3");}
        }
    }
    
    



    
//    public Turno planVacunatorio(Turno turno){
//        ArrayList<String> horarios;
//        LocalDateTime fecha = turno.getFecha().plusDays(21);
//        do {
//            horarios = turnosLibres(turno.getFecha().toLocalDate(),turno.getVacunatorio());
//            fecha = fecha.plusDays(1);
//        } while (horarios.isEmpty());
//        Turno tur2 = new Turno(fecha, null,null);
//        return tur2;
//    }


