package Entidades;

public class Vacunatorio {
    
    private int idVacunatorio;
    private String nombre;
    private String ubicacion;
    private boolean estado;
    private Vial vial;
    private Medico medico;

    public Vacunatorio(String nombre, String ubicacion, boolean estado, Vial vial, Medico medico) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.vial = vial;
        this.medico = medico;
    }

    public Vacunatorio() {
    }

    public int getIdVacunatorio() {
        return idVacunatorio;
    }

    public void setIdVacunatorio(int idVacunatorio) {
        this.idVacunatorio = idVacunatorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Vacunatorio{" + "idVacunatorio=" + idVacunatorio + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", estado=" + estado + ", vial=" + vial + ", medico=" + medico + '}';
    }
    
    
    
}
