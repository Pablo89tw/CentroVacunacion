package Entidades;

public class Patologias {
    
    private String nombre;
    private boolean patologia;

    public Patologias(boolean patologia) {
        this.patologia = patologia;
    }

    public boolean isPatologia() {
        return patologia;
    }

    public void setPatologia(boolean patologia) {
        this.patologia = patologia;
    }

    @Override
    public String toString() {
        return "Patologias{" + "patologia=" + patologia + '}';
    }
    
    
    
}
