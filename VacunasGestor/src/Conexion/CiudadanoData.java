    package Conexion;

import Entidades.Ciudadano;
import Entidades.Turno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CiudadanoData {
    
    private Connection con = Conectar.getConectar();
    private TurnoData tD = new TurnoData();
    private LoginData lD = new LoginData();
    private VacunatorioData vD = new VacunatorioData();
    
    public int cargaCiudadano(Ciudadano c1){
    int updates = 0, comas =0;
    
    String sql = "INSERT INTO ciudadano (dni";
        if (c1.getApellido() != null) {sql += ", apellido";comas++;}
        if (c1.getNombre() != null) {sql += ", nombre";comas++;}
        if (c1.getCordenadas().getLatitud() != 0) {sql += ", latitud";comas++;}
        if (c1.getCordenadas().getLongitud() != 0) {sql += ", longitud";comas++;}
        if (c1.getEmail() != null) {sql += ", email";comas++;}
        if (c1.getCelular() != 0) {sql += ", celular";comas++;}
        if (c1.getAmbitoTrabajo() != null) {sql += ", ambitoTrabajo";comas++;}
        if (c1.getDosisAplicadas() != -1) {sql += ", dosisAplicadas";comas++;}
               
        sql += ") VALUES (?";
        if (comas!=0){sql +=",";}      
        for (int i = 1; i < comas; i++) {
            sql += "?,";
        }
        sql += "?)";
        
              
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
                      
            updates = ps.executeUpdate();;
            if (updates > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion Correcta");
                lD.activarUsuarioLogIN(comas, updates);
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
    
    public int dosisAplicadas(Ciudadano ciudadano){
        int dosis = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT dosisAplicadas FROM ciudano WHERE DNI = ?";
        
         try {
          ps = con.prepareStatement(sql);
          ps.setInt(1, ciudadano.getDNI());
          rs = ps.executeQuery();
          if (rs.next()) {
            dosis = rs.getInt("dosisAplicadas");
}
        } catch(SQLException ex){
            System.out.println("pepe");
        } 
        return dosis;
    }
     
    public void cargarTurno(Ciudadano ciu, Turno tur, int refuerzo){
        String sql = "INSERT INTO turno (dni,fechaTurno,fechaColocacion,idCentro,codigoRefuerzo,estado) VALUES (?,?,?,?,?,?)";
        System.out.println(tur);
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciu.getDNI());
            ps.setTimestamp(2, Timestamp.valueOf(tur.getFecha()));
            ps.setDate(3,null);
            ps.setInt(4, tur.getVacunatorio().getIdVacunatorio());
            ps.setInt(5, ciu.getDosisAplicadas());  
            ps.setInt(6,0);

            int updates = ps.executeUpdate();
            if (updates > 0) {
                tD.actualizarTurneroVacunatorio(tur);                 
            }
            if (updates == 0) {
                JOptionPane.showMessageDialog(null, "Turno Tomado");
            }
        } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Turno ya ocupado");
            } else {
                JOptionPane.showMessageDialog(null, "Error, tome un nuevo turno");
            }
        }
    }
     
    public Ciudadano datosCiudadano(int dni_ciudadano){
     Ciudadano c1 = new Ciudadano();
     PreparedStatement ps;   
     ResultSet rs;
     String sql = "SELECT * FROM ciudadano WHERE DNI = ?";
     
     try{
         ps = con.prepareStatement(sql);
         ps.setInt(1,dni_ciudadano);
         
         rs = ps.executeQuery();
        
         if (rs.next()){
       
             c1.setApellido(rs.getString("apellido"));
             c1.setNombre(rs.getString("nombre"));
             c1.setDNI(dni_ciudadano); 
             c1.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
             c1.setDosisAplicadas(rs.getInt("dosisAplicadas"));
             c1.setCelular(rs.getInt("celular"));
         } 
       } catch (SQLException e){}
        return c1;
    }
 
    public ArrayList<String> patologiasLista(int dni_ciudadano){
     ArrayList<String> patologias = new ArrayList();
     PreparedStatement ps;   
     ResultSet rs;
     String sql = "SELECT * FROM patologias WHERE DNI = ?";
     
     try{
         ps = con.prepareStatement(sql);
         ps.setInt(1,dni_ciudadano);
        
         rs = ps.executeQuery();
         
         if (rs.next()){
             String[] patologiasString = {"Cardiovasculares","Diabetes","Respiratorias_Cronicas","Inmunosupresion","Obesidad","Renales_cronicas","Embarazo","Hepaticas_cronicas","Neurologicas"};
             for (String string : patologiasString) {
                 if (rs.getBoolean(string)){
                  patologias.add(string); 
                }
             }
                if (rs.getString("otra") != null){
                patologias.add(rs.getString("otra"));
             }
          } 
       } catch (SQLException e){}
        return patologias;
    }
    
     
}
