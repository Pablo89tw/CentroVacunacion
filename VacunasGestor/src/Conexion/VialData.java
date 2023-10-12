package Conexion;

import Entidades.Laboratorio;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class VialData {

    private Connection con = Conectar.getConectar();
    private VacunatorioData vD = new VacunatorioData();
    
  
    public void cargarViales() {
        String sql = "INSERT INTO viales (numeroSerie,Marca,Antigeno,fechaVencimiento,idLaboratorio,estado,idVacunatorio,fechaColocacion) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            String marca; String antigeno; int idLabora;
            switch ((int) (Math.random() * 10)) {
                case 0:
                case 1:
                    marca = "Pfizer";
                    antigeno = "ARN mensajero (ARNm)";
                    idLabora = 1;
                    break;
                case 2:
                case 3:
                    marca = "Johnson_Johnson";
                    antigeno = "Partículas SARS-CoV-2 desactivadas";
                    idLabora = 2;
                    break;
                case 4:
                case 5:
                    marca = "AstraZeneca";
                    antigeno = "Proteína de pico del virus SARS-CoV-2";
                    idLabora = 3;
                    break;
                case 6:
                case 7:
                    marca = "Sinopharm y Sinovac";
                    antigeno = "Partículas SARS-CoV-2 desactivadas"; 
                    idLabora = 4;
                    break;
                case 8:
                default:
                    marca = "Sputnik V";
                    antigeno = "Adenovirus Ad26 y Ad5";
                    idLabora = 5;
                                       
            }
            ps.setInt(1, (int) (Math.random() * 1000000));
            ps.setString(2, marca);
            ps.setString(3,antigeno);
            LocalDate fechaVencimiento = LocalDate.now().plusDays(90);
            ps.setString(4, fechaVencimiento.toString());
            ps.setInt(5,idLabora);
            ps.setInt(6,0);
            ps.setInt(7,(int) Math.floor(Math.random() * 3) + 1);
            ps.setDate(8,null);

            int updates = ps.executeUpdate();;
            } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El numero serie ya se encuentra cargado en la bsae datos.");
            }
        }
    }
    
    public Vial buscarVial(int idVial){
        PreparedStatement ps;
        Vial vial = new Vial();
        String sql = "SELECT * FROM viales WHERE idVial = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, idVial);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                vial.setAntigeno(rs.getString("antigeno"));
                vial.setEstado(rs.getInt("estado"));
                vial.setMarca(rs.getString("marca"));
                vial.setNumeroSerie(rs.getInt("numeroSerie"));
                vial.setFechaVencimiento(rs.getDate("FechaVencimiento").toLocalDate());
                if (rs.getDate("fechaColocacion") != null){
                vial.setFechaColocacion(rs.getTimestamp("fechaColocacion").toLocalDateTime());
                } else {
                    vial.setFechaColocacion(null);
                   }
                Vacunatorio vac = vD.buscarVacunatorio(rs.getInt("idVacunatorio"));
                vial.setVacunatorio(vac);
            }
            
        }catch (SQLException e){}
        return vial;
    }
    
    public ArrayList<Vial> listarViales(int estado){
        PreparedStatement ps;
        Vial vial;
        ArrayList<Vial> arrayViales = new ArrayList();
               
        String sql = "SELECT * FROM viales WHERE estado = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,estado);
                       
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                vial = new Vial();
                vial.setAntigeno(rs.getString("antigeno"));
                vial.setEstado(rs.getInt("estado"));
                vial.setMarca(rs.getString("marca"));
                vial.setNumeroSerie(rs.getInt("numeroSerie"));
                vial.setFechaVencimiento(rs.getDate("FechaVencimiento").toLocalDate());
                if (rs.getDate("fechaColocacion") != null){
                vial.setFechaColocacion(rs.getTimestamp("fechaColocacion").toLocalDateTime());
                } else {
                    vial.setFechaColocacion(null);
                   }
                Vacunatorio vac = vD.buscarVacunatorio(rs.getInt("idVacunatorio"));
                vial.setVacunatorio(vac);
                arrayViales.add(vial);
            }
            
        }catch (SQLException e){}
        return arrayViales;
    }
         
    public ArrayList<Laboratorio> listarLaboratorio(){
        PreparedStatement ps;
        Laboratorio lab;
        ArrayList<Laboratorio> arrayLaboratorios = new ArrayList();
        Vial vial;
               
        String sql = "SELECT * FROM fabricante";
        
        try{
            ps = con.prepareStatement(sql);      
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
               lab = new Laboratorio();
               lab.setPais(rs.getString("País"));
               lab.setNombre(rs.getString("Nombre"));
               lab.setCuit(rs.getString("Cuit"));
               vial = new Vial();
               vial.setMarca(rs.getString("Viales"));
               lab.setVial(vial);
                }
            
        }catch (SQLException e){}
        return arrayLaboratorios;
    }
    
   public void reasignarViales(Vacunatorio donante, Vacunatorio aceptor, Vial viales){
       PreparedStatement ps;
       String sql = "UPDATE viales SET idVacunatorio = ? WHERE marca = ? AND idVacunatorio = ? AND estado = 0";
  
       try{
           ps = con.prepareStatement(sql);
           ps.setInt(1, aceptor.getIdVacunatorio());
           ps.setString(2,viales.getMarca());
           ps.setInt(3,donante.getIdVacunatorio());
         
          int update = ps.executeUpdate();
        } catch (SQLException e){}
   }

   
}

