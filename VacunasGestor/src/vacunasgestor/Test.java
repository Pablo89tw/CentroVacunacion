package vacunasgestor;

import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Entidades.Vacunatorio;
import Vistas.Vistas_ADM.Administrador_Centros;
import Vistas.Vistas_Centros.Administrador;

public class Test extends java.awt.Frame {

 
    public Test() {
        Vacunatorio vac = new Vacunatorio();
        vac.setIdVacunatorio(1);
        CiudadanoData cD = new CiudadanoData();
        TurnoData tD = new TurnoData();
        initComponents();
        Administrador_Centros ad = new Administrador_Centros(tD);
        jDesktopPane1.add(ad);
        ad.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        add(jDesktopPane1, java.awt.BorderLayout.CENTER);

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
                new Test().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
