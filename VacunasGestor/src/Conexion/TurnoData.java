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
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TurnoData {
    
    private Connection con = Conectar.getConectar();
    private VacunatorioData vD = new VacunatorioData();
    private VialData sD = new VialData();
    private CiudadanoData cD = new CiudadanoData();
        
    
    public ArrayList<String> armarArrayHorariosLibres(LocalDate fecha, Vacunatorio vac) {
        
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
    
    public int buscarTurnoLibre_porTurnosLibres(LocalDate fecha, Vacunatorio vac){
        int turnos_libres = 0;
        String sql = "SELECT turnos_libres FROM";
         switch (vac.getIdVacunatorio()){
                case 1: sql += " turnero_1 WHERE fecha = ?";break;
                case 2: sql += " turnero_2 WHERE fecha = ?";break;
                case 3: sql += " turnero_3 WHERE fecha = ?";break;
            } 
                       
        PreparedStatement ps;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha.toString());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                turnos_libres = (rs.getInt("turnos_libres"));
            } 
        }catch (SQLException e){}
        return turnos_libres;  
    }
       
    public void actualizarTurnero_Hora(Turno tur){
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
    
    public void actualizarTurnero_SoloTurnosLibres(Turno tur){
         PreparedStatement ps = null; 
                   
        String sql2 = "UPDATE"; 
        switch (tur.getVacunatorio().getIdVacunatorio()){
                case 1: sql2 += " turnero_1 SET ";break;
                case 2: sql2 += " turnero_2 SET ";break;
                case 3: sql2 += " turnero_3 SET ";break;
            }  
  
            sql2 += "turnos_libres = turnos_libres - 1 WHERE fecha = ?";
           
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
    
    public void actualizarHora_Turno(Turno turno){
      
       String sql = "UPDATE turno SET fechaTurno = ? WHERE idTurno = ?";
       PreparedStatement ps;
       
       try{
           ps = con.prepareStatement(sql);
           ps.setObject(1, turno.getFecha());
           ps.setInt(2, turno.getIdTurno());
         
           int filasActualizadas = ps.executeUpdate();
       } catch (SQLException e){}
    }
          
    public ArrayList<Turno> buscarTurno(int dni_ciudadano){
      ArrayList<Turno> arrayTurnos = new ArrayList();
      arrayTurnos.clear();
      String sql = "SELECT * FROM turno WHERE DNI = ?";  
      PreparedStatement ps;  
      try{
         ps = con.prepareStatement(sql);
         ps.setInt(1,dni_ciudadano);
         
         ResultSet rs = ps.executeQuery();
         
         while (rs.next()){
             Turno turno1 = new Turno();
             turno1.setVacunatorio(vD.buscarVacunatorio(rs.getInt("idCentro")));
             turno1.setIdTurno(rs.getInt("idTurno"));
                       
             Object fechaTurnoObjeto = rs.getObject("fechaTurno");
             if (fechaTurnoObjeto != null) {
             LocalDateTime fechaTurno = ((Timestamp) fechaTurnoObjeto).toLocalDateTime();
             turno1.setFecha(fechaTurno);
             }
             turno1.setCodigoRefuerzo(rs.getInt("codigoRefuerzo"));
             turno1.setEstado(rs.getString("estado"));
             
             int idVial = rs.getInt("idVial");
             if (!rs.wasNull()){
             turno1.setVial(sD.buscarVial(idVial));
             }
             arrayTurnos.add(turno1);
         }
        } catch (SQLException e){}
        return arrayTurnos;
    }
    
    public Turno buscarTurno_iD(int idTurno){
      String sql = "SELECT * FROM turno WHERE idTurno = ?";  
      PreparedStatement ps; 
      Turno turno1 = new Turno(); 
      try{
         ps = con.prepareStatement(sql);
         ps.setInt(1,idTurno);
         
         ResultSet rs = ps.executeQuery();
         
         if (rs.next()){
             turno1.setVacunatorio(vD.buscarVacunatorio(rs.getInt("idCentro")));
             turno1.setIdTurno(rs.getInt("idTurno"));
                       
             Object fechaTurnoObjeto = rs.getObject("fechaTurno");
             if (fechaTurnoObjeto != null) {
             LocalDateTime fechaTurno = ((Timestamp) fechaTurnoObjeto).toLocalDateTime();
             turno1.setFecha(fechaTurno);
             }
             turno1.setCodigoRefuerzo(rs.getInt("codigoRefuerzo"));
             turno1.setEstado(rs.getString("estado"));
             
             int idVial = rs.getInt("idVial");
             if (!rs.wasNull()){
             turno1.setVial(sD.buscarVial(idVial));
             }
                      }
        } catch (SQLException e){}
        return turno1;
    }
       
    public ArrayList<Vial> buscar_VialParaAsignar(Ciudadano c1){
        ArrayList<Vial> arrayViales = new ArrayList();
        arrayViales.clear();
        String sql1 = "SELECT * FROM viales WHERE Estado = 0 AND idVacunatorio = ?";
               
        PreparedStatement ps;
        
        try{
            ps = con.prepareStatement(sql1);
            ps.setInt(1,vD.buscarVacunatorio_xCiudadano(c1.getDNI()).getIdVacunatorio());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Vial vial = new Vial();
                vial.setIdVial(rs.getInt("idVial"));
                vial.setNumeroSerie(rs.getInt("numeroSerie"));
                vial.setFechaVencimiento(rs.getDate("FechaVencimiento").toLocalDate());
                vial.setMarca(rs.getString("marca"));
                vial.setAntigeno(rs.getString("antigeno"));
                vial.setEstado(rs.getInt("Estado"));
                vial.setVacunatorio(vD.buscarVacunatorio(rs.getInt("idVacunatorio")));
                arrayViales.add(vial);
            } 
        }catch (SQLException e){}
        return arrayViales;  
    }
    
    public void actualizar_VialFecha_TurnoData(Vial vial, Turno turno, Ciudadano c1 ){
        String sql2 = "UPDATE turno SET idVial = ?, estado = ? WHERE idTurno = ?";
        String sql3 = "UPDATE viales SET Estado = 1, fechaColocacion = ? WHERE idVial = ?";
        String sql4 = "UPDATE ciudadano SET dosisAplicadas = dosisAplicadas + 1 WHERE DNI = ?";
        PreparedStatement ps;
      
        try {
            ps = con.prepareStatement(sql2);
            ps.setInt(1, vial.getIdVial());
            ps.setString(2,"completo");
            ps.setInt(3, turno.getIdTurno());
            
            int resultado = ps.executeUpdate();
                        
        } catch (SQLException e){System.out.println("Error 1");
        }
        
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

    public void updateTurnos_Libres(LocalDate fecha, Turno turno){
    PreparedStatement ps;
    String sql = "UPDATE ";
    
            switch (turno.getVacunatorio().getIdVacunatorio()){
                case 1: sql += "turnero_1";break;
                case 2: sql += "turnero_2";break;
                case 3: sql += "turnero_3";break;     
            }
         
        sql += " SET turnos_libres = turnos_libres - 1 WHERE fecha = ?";
        System.out.println(sql);
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toString());
            
            int resultados = ps.executeUpdate();
            
        }catch (SQLException e){}
        }
    
    public LocalDateTime colocarHora_aFecha(LocalDate fecha, String codigo) {
        LocalDateTime fechaTime = fecha.atStartOfDay();
        LocalTime horaEspecifica;
        switch (codigo) {
            case "8 a 9":
                horaEspecifica = LocalTime.of(8, 00, 0);
                //columnas = "8_9";
                break;
            case "9 a 10":
                horaEspecifica = LocalTime.of(9, 00, 0);
               // columnas = "9_10";
                break;
            case "10 a 11":
               horaEspecifica = LocalTime.of(10, 00, 0);
//                columnas = "10_11";
                break;
            case "11 a 12":
                horaEspecifica = LocalTime.of(11, 00, 0);
               // columnas = "11_12";
                break;
            case "12 a 13":
              horaEspecifica = LocalTime.of(12, 00, 0);
             //  columnas = "12_13";
                break;
            case "13 a 14":
              horaEspecifica = LocalTime.of(13, 00, 0);
                // columnas = "13_14";
                break;
            case "14 a 15":
             horaEspecifica = LocalTime.of(14, 00, 0);
               //  columnas = "14_15";
                break;
            case "15 a 16":
            horaEspecifica = LocalTime.of(15, 00, 0);
               // columnas = "15_16";
                break;
            default :
              horaEspecifica = LocalTime.of(16, 00, 0);
               //  columnas = "16_17";
                break;
        }
        fechaTime = fecha.atTime(horaEspecifica);
        return fechaTime;
    }
    
    public ArrayList<Turno> listar_Turnos(LocalDate fecha, Vacunatorio vac, String estado){
        ArrayList<Turno> arrayTurnos = new ArrayList();
        int cod = 0;
        Turno t1;
        String sql;
        switch (estado){
            case "porDia": sql = "SELECT * FROM turno WHERE DAY(fechaTurno) = ? AND MONTH(fechaTurno) = ? AND idCentro = ? AND estado = 'completo'"; cod = 2; break;
            default: sql = "SELECT * FROM turno WHERE MONTH(fechaTurno) = ? AND idCentro = ? AND estado = ?";cod = 1; break;
        }
       
        try{
          PreparedStatement ps = con.prepareStatement(sql);
          if (cod == 1){
          ps.setInt(1, fecha.getMonthValue());
          ps.setInt(2, vac.getIdVacunatorio());
          ps.setString(3, estado);
          
          } else if (cod == 2){
          ps.setInt(1, fecha.getDayOfMonth());
          ps.setInt(2, fecha.getMonthValue());
          ps.setInt(3, vac.getIdVacunatorio());
          }
            
          
           ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
              t1 = new Turno();  
              t1.setCiudadano(cD.buscarCiudadanos(rs.getInt("DNI"),"DNI").get(0));
              t1.setCodigoRefuerzo(rs.getInt("codigoRefuerzo"));
              t1.setEstado(rs.getString("estado"));
              t1.setFecha(rs.getTimestamp("fechaTurno").toLocalDateTime());
              t1.setIdTurno(rs.getInt("idTurno"));
              t1.setVacunatorio(vD.buscarVacunatorio(rs.getInt("idCentro")));
              t1.setVial(sD.buscarVial(rs.getInt("idVial")));
              arrayTurnos.add(t1);
            }
            
            
        }catch (SQLException e) {
            System.out.println("Error en la busqueda");
        }
       
        return arrayTurnos;
    }
    
    public void ponerAusentes(LocalDate fecha){
        PreparedStatement ps;
        String sql = "UPDATE turno SET estado = 'Ausente' WHERE MONTH(fechaTurno) = ? AND estado = 'pendiente'";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, (fecha.getMonthValue()-1));
                        
            int resultado = ps.executeUpdate();
            
        } catch (SQLException e){}
    }
    
    public void cancelarTurno(int idTurno){
        PreparedStatement ps;
        String sql = "UPDATE turno SET estado = 'Cancelador' WHERE idTurno = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, idTurno);
                        
            int resultado = ps.executeUpdate();
            
        } catch (SQLException e){}
      }

}   
   

