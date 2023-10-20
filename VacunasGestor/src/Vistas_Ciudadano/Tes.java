package Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.LoginData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.geoData;

public class Tes extends java.awt.Frame {

    
    TurnoData tD = new TurnoData();
    CiudadanoData cD = new CiudadanoData();
    VacunatorioData vD = new VacunatorioData();
    LoginData lD = new LoginData();
    geoData gD = new geoData();
 
    public Tes() {
        initComponents();
        Inscripcion dM = new Inscripcion(gD, vD, tD, lD, cD, 50000002);
        jDesktopPane2.add(dM);
        dM.setVisible(true);
              
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        add(jDesktopPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tes().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    // End of variables declaration//GEN-END:variables
}
