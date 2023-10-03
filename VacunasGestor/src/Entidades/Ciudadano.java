package Entidades;

import java.util.ArrayList;

public class Ciudadano {
    
    private int idCiudadano;
    private int DNI;
    private String nombre;
    private String apellido;
    private String email;
    private int Celular;
    protected ArrayList<Patologias> patologia;
    private String ambitoTrabajo;

    public Ciudadano(int DNI, String nombre, String apellido, String email, int Celular, ArrayList<Patologias> patologia, String ambitoTrabajo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.Celular = Celular;
        this.patologia = patologia;
        this.ambitoTrabajo = ambitoTrabajo;
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
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public ArrayList<Patologias> getPatologia() {
        return patologia;
    }

    public void setPatologia(ArrayList<Patologias> patologia) {
        this.patologia = patologia;
    }

    public String getAmbitoTrabajo() {
        return ambitoTrabajo;
    }

    public void setAmbitoTrabajo(String ambitoTrabajo) {
        this.ambitoTrabajo = ambitoTrabajo;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "idCiudadano=" + idCiudadano + ", DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", Celular=" + Celular + ", patologia=" + patologia + ", ambitoTrabajo=" + ambitoTrabajo + '}';
    }
}
