package Entidades;

import java.util.ArrayList;

public class Ciudadano {
    
    private int idCiudadano;
    private int DNI;
    private String nombre;
    private String apellido;
    private String email;
    private int celular;
    private String ambitoTrabajo;
    private int dosisAplicadas;
    private Coordenadas cordenadas;
    private ArrayList<String> patologias;
    private Turno turno;

    public Ciudadano(int DNI, String nombre, String apellido, String email, int celular, String ambitoTrabajo, int dosisAplicadas, Coordenadas cordenadas, ArrayList<String> patologias, Turno turno) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.ambitoTrabajo = ambitoTrabajo;
        this.dosisAplicadas = dosisAplicadas;
        this.cordenadas = cordenadas;
        this.patologias = patologias;
        this.turno = turno;
    }

    public Ciudadano() {
    }

    
    
    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getAmbitoTrabajo() {
        return ambitoTrabajo;
    }

    public void setAmbitoTrabajo(String ambitoTrabajo) {
        this.ambitoTrabajo = ambitoTrabajo;
    }

    public int getDosisAplicadas() {
        return dosisAplicadas;
    }

    public void setDosisAplicadas(int dosisAplicadas) {
        this.dosisAplicadas = dosisAplicadas;
    }

    public Coordenadas getCordenadas() {
        return cordenadas;
    }

    public void setCordenadas(Coordenadas cordenadas) {
        this.cordenadas = cordenadas;
    }

    public ArrayList<String> getPatologias() {
        return patologias;
    }

    public void setPatologias(ArrayList<String> patologias) {
        this.patologias = patologias;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "idCiudadano=" + idCiudadano + ", DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", celular=" + celular + ", ambitoTrabajo=" + ambitoTrabajo + ", dosisAplicadas=" + dosisAplicadas + ", cordenadas=" + cordenadas + ", patologias=" + patologias + ", turno=" + turno + '}';
    }
    
}

   