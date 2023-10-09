package Entidades;

import java.time.LocalDate;

public class Vial {
    
    private int idVial;
    private int numeroSerie;
    private String marca;
    private String antigeno;
    private LocalDate fechaVencimiento;
    private int volumenVial;
    private boolean estado;
    private int volumenVacuna;

    public Vial(int idVial, int numeroSerie, String marca, String antigeno, LocalDate fechaVencimiento, int volumenVial, boolean estado, int volumenVacuna) {
        this.idVial = idVial;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.antigeno = antigeno;
        this.fechaVencimiento = fechaVencimiento;
        this.volumenVial = volumenVial;
        this.estado = estado;
        this.volumenVacuna = volumenVacuna;
    }

    public Vial(int numeroSerie, String marca, String antigeno, LocalDate fechaVencimiento, int volumenVial, boolean estado, int volumenVacuna) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.antigeno = antigeno;
        this.fechaVencimiento = fechaVencimiento;
        this.volumenVial = volumenVial;
        this.estado = estado;
        this.volumenVacuna = volumenVacuna;
    }

    

    public Vial() {
    }
        
    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAntigeno() {
        return antigeno;
    }

    public void setAntigeno(String antigeno) {
        this.antigeno = antigeno;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getVolumenVial() {
        return volumenVial;
    }

    public void setVolumenVial(int volumenVial) {
        this.volumenVial = volumenVial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVolumenVacuna() {
        return volumenVacuna;
    }

    public void setVolumenVacuna(int volumenVacuna) {
        this.volumenVacuna = volumenVacuna;
    }

    public int getIdVial() {
        return idVial;
    }

    public void setIdVial(int idVial) {
        this.idVial = idVial;
    }


    @Override
    public String toString() {
        return "Vial{" + "numeroSerie=" + numeroSerie + ", marca=" + marca + ", antigeno=" + antigeno + ", fechaVencimiento=" + fechaVencimiento + ", volumenVial=" + volumenVial + ", estado=" + estado + ", volumenVacuna=" + volumenVacuna + '}';
    }

    
    
    
    
    
}
