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
    
    public void patologia(Ciudadano ciudadano, boolean EC, boolean D, boolean EResC, boolean I, boolean O, boolean ERenC, boolean E, boolean EHC, boolean EN, String otra) {
        
        int exito = 0, comas = 0, sqlPosicion = 1;
        String sql = "INSERT INTO patologias (DNI";
            
        if (EC) {sql += ", Cardiovasculares";comas++;}
        if (D) {sql += ", Diabetes";comas++;}
        if (EResC) {sql += ", Respiratorias_cronicas";comas++;}
        if (I) {sql += ", Inmunosupresion";comas++;}
        if (O) {sql += ", Obesidad";comas++;}
        if (ERenC) {sql += ", Renales_cronicas";comas++;}
        if (E) {sql += ", Embarazo";comas++;}
        if (EHC) {sql += ", Hepaticas_cronicas";comas++;}
        if (EN) {sql += ", Neurologicas";comas++;}
        if (!otra.isEmpty()) {sql += ", otra";comas++;}

        sql += ") VALUES (";
        if (comas!=0){sql +="?,";
        for (int i = 1; i < comas; i++) {
            sql += "?,";
        }
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
           
        } 
        return dosis;
    }
     
    public void cargarTurno(Ciudadano ciu, Turno tur, int refuerzo){
        int updates = 0;
        String sql = "INSERT INTO turno (dni,fechaTurno,fechaColocacion,idCentro,codigoRefuerzo,estado) VALUES (?,?,?,?,?,?)";
       
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciu.getDNI());
            ps.setTimestamp(2, Timestamp.valueOf(tur.getFecha()));
            ps.setDate(3,null);
            ps.setInt(4, tur.getVacunatorio().getIdVacunatorio());
            ps.setInt(5, ciu.getDosisAplicadas());  
            ps.setInt(6,0);

            updates = ps.executeUpdate();
            if (updates > 0) {
                tD.actualizarTurneroVacunatorio(tur); 
                JOptionPane.showMessageDialog(null, "Turno Tomado");                
            }
            if (updates == 0) {
                
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
             c1.setEmail(rs.getString("email"));
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
    
    public void actualizarDatosCiudadano(Ciudadano c1, String apellido, boolean ape, String nombre, boolean nom, String celular, boolean cel, String dosis, boolean dos, String ocupacion, boolean ocup, String email, boolean mail){
        int comas = 0, sql_p = 1;
        
        String sql = "UPDATE ciudadano SET";
        PreparedStatement ps;
        if (ape) { sql += " apellido = ? "; comas++;}
        if (nom) {sql += ((comas > 0)? ",":""); sql += " nombre = ? "; comas++;}
        if (cel) { sql += ((comas > 0)? ",":""); sql += " celular = ? "; comas++;}
        if (dos) { sql += ((comas > 0)? ",":""); sql += " dosis = ? "; comas++;}
        if (ocup) { sql += ((comas > 0)? ",":""); sql += " ocupacion = ? "; comas++;}
        if (mail) { sql += ((comas > 0)? ",":""); sql += " email = ? "; comas++;}
        
        sql += "WHERE DNI = ?";
        
       
            
        try {
            ps = con.prepareStatement(sql);
            
            if (ape) {ps.setString(sql_p, apellido);sql_p++;}
            if (nom) {ps.setString(sql_p, nombre);sql_p++;}
            if (cel) {ps.setString(sql_p, celular);sql_p++;}
            if (dos) {ps.setString(sql_p, dosis);sql_p++;}
            if (ocup) {ps.setString(sql_p,ocupacion); sql_p++;}
            if (mail) {ps.setString(sql_p,email); sql_p++;}
            ps.setInt(sql_p, c1.getDNI());
             
            int resultado = ps.executeUpdate();
            
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error al actualizar la base de datos");
        }  
    }
    
    public void actualiarPatologias(int DNI, ArrayList<String> agregar, ArrayList<String> sacar, String otra){
        int comas = 0, sql_p = 1;
        PreparedStatement ps;
        String [] patologias = {"Cardiovasculares","Diabetes","Respiratorias_Cronicas","Inmunosupresion","Obesidad","Renales_Cronicas","Embarazo","Hepaticas_cronicas","Neurologicas"};

        String sql = "UPDATE patologias SET ";
        for (String patologia : patologias) {
            if (agregar.contains(patologia) || sacar.contains(patologia)) {sql += ((comas > 0)? ", ":""); sql +=  patologia + " = ?";comas++;}
            
        }
        sql += " WHERE DNI = ?";
       
        try {
            ps = con.prepareStatement(sql);
            
            
               for (String patologia : patologias) {
                     if (agregar.contains(patologia)) {
                       ps.setBoolean(sql_p,true); sql_p++;
                   } else if (sacar.contains(patologia)){
                   ps.setBoolean(sql_p,false);sql_p++;
                   }
               }    
               
               ps.setInt(sql_p, DNI);
               
        int resultado = ps.executeUpdate();
            
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error al actualizar la base de datos de patologias");
        }  
         
    }

    public ArrayList<Vial> consultarDatosVacunacion(Ciudadano c1){
        ArrayList <Vial> viales = new ArrayList(); 
        Vial vial;
        PreparedStatement ps;
        
        String sql = "SELECT * FROM viales INNER JOIN turno ON turno.idVial = viales.idVial WHERE turno.DNI = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, c1.getDNI());
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                vial = new Vial();
                vial.setIdVial(rs.getInt("idVial"));
                vial.setMarca(rs.getString("Marca"));
                vial.setAntigeno(rs.getString("Antigeno"));
                vial.setNumeroSerie(rs.getInt("numeroSerie"));
                vial.setFechaColocacion(rs.getTimestamp("fechaColocacion").toLocalDateTime());
                vial.setFechaVencimiento(rs.getDate("FechaVencimiento").toLocalDate());
                Vacunatorio vac = vD.buscarVacunatorio(rs.getInt("idVacunatorio"));
                vial.setVacunatorio(vac);
                viales.add(vial);
            }
            
        } catch (SQLException e) {}
        return viales;
    }

    public int numeroDosis_x_vial(int idVial){
        int dosis = 0;
        PreparedStatement ps = null;
       
        String sql = "SELECT * FROM turno WHERE idVial = ?";
        
         try {
          ps = con.prepareStatement(sql);
          ps.setInt(1, idVial);
          ResultSet rs = ps.executeQuery();
          
          if (rs.next()) {
            dosis = rs.getInt("codigoRefuerzo");
           }
        } catch(SQLException ex){
           
        } 
        return dosis;
    }
}
