package Entidades;

import java.time.LocalDate;

public class Turno {
   
    private int idTurno;
    private LocalDate fecha;
    private String horario;

    public Turno(LocalDate fecha, String horario) {
        this.fecha = fecha;
        this.horario = horario;
    }

    public Turno() {
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

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    @Override
    public String toString() {
        return "Turno{" + "idTurno=" + idTurno + ", fecha=" + fecha + ", horario=" + horario + '}';
    }
    
    
   
   

    
    
    

    
    
    
}
