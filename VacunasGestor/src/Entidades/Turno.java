package Entidades;

import java.time.LocalDateTime;

public class Turno {
   
    private int idTurno;
    private LocalDateTime fecha;
    private Vacunatorio vacunatorio;
    private int codigoRefuerzo;
    private boolean estado;
    private Vial vial;

    public Turno(LocalDateTime fecha, Vacunatorio vacunatorio, int codigoRefuerzo, boolean estado, Vial vial) {
        this.fecha = fecha;
        this.vacunatorio = vacunatorio;
        this.codigoRefuerzo = codigoRefuerzo;
        this.estado = estado;
        this.vial = vial;
    }

    public Turno() {
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

    public int getCodigoRefuerzo() {
        return codigoRefuerzo;
    }

    public void setCodigoRefuerzo(int codigoRefuerzo) {
        this.codigoRefuerzo = codigoRefuerzo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Vial getVial() {
        return vial;
    }

    public void setVial(Vial vial) {
        this.vial = vial;
    }

    @Override
    public String toString() {
        return "Turno{" + "idTurno=" + idTurno + ", fecha=" + fecha + ", vacunatorio=" + vacunatorio + ", codigoRefuerzo=" + codigoRefuerzo + ", estado=" + estado + ", vial=" + vial + '}';
    }
    
}
    

   