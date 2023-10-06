package Entidades;

import java.time.LocalDate;

public class Turno {
   
    private int idTurno;
    private LocalDate fecha;
    private String horario;
    private Vacunatorio vacunatorio;

    public Turno(LocalDate fecha, String horario, Vacunatorio vacunatorio) {
        this.fecha = fecha;
        this.horario = horario;
        this.vacunatorio = vacunatorio;
    }
 
 

    

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Vacunatorio getVacunatorio() {
        return vacunatorio;
    }

    public void setVacunatorio(Vacunatorio vacunatorio) {
        this.vacunatorio = vacunatorio;
    }

    @Override
    public String toString() {
        return "Turno{" + "idTurno=" + idTurno + ", fecha=" + fecha + ", horario=" + horario + ", vacunatorio=" + vacunatorio + '}';
    }

   

    

  
   

    
    
    

    
    
    
}
