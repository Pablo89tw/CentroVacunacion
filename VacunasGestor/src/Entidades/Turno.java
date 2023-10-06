package Entidades;

import java.time.LocalDateTime;

public class Turno {
   
    private int idTurno;
    private LocalDateTime fecha;
    private Vacunatorio vacunatorio;

    public Turno(LocalDateTime fecha, Vacunatorio vacunatorio) {
        this.fecha = fecha;
        this.vacunatorio = vacunatorio;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

     public Vacunatorio getVacunatorio() {
        return vacunatorio;
    }

    public void setVacunatorio(Vacunatorio vacunatorio) {
        this.vacunatorio = vacunatorio;
    }

    public Turno() {
    }

    public Turno(int idTurno, LocalDateTime fecha, Vacunatorio vacunatorio) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.vacunatorio = vacunatorio;
    }

    @Override
    public String toString() {
        return "Turno{" + "idTurno=" + idTurno + ", fecha=" + fecha + ",hora" + fecha.getHour() +  ", vacunatorio=" + vacunatorio + '}';
    }

    
    
   

    

  
   

    
    
    

    
    
    
}
