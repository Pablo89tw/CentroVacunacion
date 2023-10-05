package Entidades;

public class Laboratorio {
    
    private String cuit;
    private String nombre;
    private String pais;
    private String direccion;
    private int stock;
    private Vial vial;
    private boolean estado;

    public Laboratorio(String cuit, String nombre, String pais, String direccion, int stock, Vial vial, boolean estado) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.pais = pais;
        this.direccion = direccion;
        this.stock = stock;
        this.vial = vial;
        this.estado = estado;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Vial getVial() {
        return vial;
    }

    public void setVial(Vial vial) {
        this.vial = vial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "cuit=" + cuit + ", nombre=" + nombre + ", pais=" + pais + ", direccion=" + direccion + ", stock=" + stock + ", vial=" + vial + ", estado=" + estado + '}';
    }
    
    
  
}
