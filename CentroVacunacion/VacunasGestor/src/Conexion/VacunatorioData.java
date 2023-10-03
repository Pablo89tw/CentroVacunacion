package Conexion;

import Entidades.Medico;
import Entidades.Vial;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class VacunatorioData {
    private Connection con = Conectar.getConectar();
      
    public void cargarcentro(String nombre, String ubicacion, String turno, String estado, Vial vial, Medico medico) {
        int comas = 0, conDatos = 1, sqlValores = 1;

        String sql = "INSERT INTO vacunatorio (";

        if (nombre != null) {sql += "nombre";comas++;conDatos++;}
        if (ubicacion != null) {sql += ((comas > 0) ? "," : " ") + "ubicacion";comas++;conDatos++;}
        if (turno != null) {sql += ((comas > 0) ? "," : " ") + "turno";comas++;conDatos++;}
        if (estado != null) {sql += ((comas > 0) ? "," : " ") + "estado";comas++;conDatos++;}
        if (vial != null) {sql += ((comas > 0) ? "," : " ") + "iDvial";comas++;conDatos++;}
        if (medico != null) {sql += ((comas > 0) ? "," : " ") + "idMedico";comas++;conDatos++;}
        
        sql += ") VALUES (";

        for (int i = 1; i < conDatos - 1; i++) {
            sql += "?,";
        }
        
        sql += "?)";
    }}

//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            if (dni != null) {
//                ps.setInt(sqlValores, Integer.parseInt(dni));
//                sqlValores++;
//            }
//            if (apellido != null) {
//                ps.setString(sqlValores, apellido);
//                sqlValores++;
//            }
//            if (nombre != null) {
//                ps.setString(sqlValores, nombre);
//                sqlValores++;
//            }
//            //if (fechaNacimiento != null) { ps.setDate(sqlValores, fechaNacimiento);sqlValores++;}
//            //if (estado != null) {ps.setBoolean(sqlValores, estado);sqlValores++}
//            if (anio != null) {
//                ps.setInt(sqlValores, Integer.parseInt(anio));
//                sqlValores++;
//            }
//
//         
//       
//    }
//}
//
//}
