
package Vistas.Vistas_Generales;

/**
 *
 * @author MOLLO RAMIREZ
 */

 import Vistas.Vistas_Ciudadano.LoginTes;


public class Ventana_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Principal
     */
    public Ventana_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagen_Fondo = new javax.swing.JLabel();
        boton_MINESTERIO = new javax.swing.JButton();
        boton_CENTRO = new javax.swing.JButton();
        boton_CIUDADANO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SiVaC-19");
        setMinimumSize(new java.awt.Dimension(600, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(605, 328));

        imagen_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/FONDO_PROGRAMA-01.png"))); // NOI18N
        imagen_Fondo.setMaximumSize(new java.awt.Dimension(600, 300));
        imagen_Fondo.setMinimumSize(new java.awt.Dimension(600, 300));
        imagen_Fondo.setPreferredSize(new java.awt.Dimension(600, 300));

        boton_MINESTERIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/BOTON MINISTERIO 01-02.png"))); // NOI18N
        boton_MINESTERIO.setToolTipText("");
        boton_MINESTERIO.setBorder(null);
        boton_MINESTERIO.setBorderPainted(false);
        boton_MINESTERIO.setMargin(new java.awt.Insets(0, 0, 0, 0));
        boton_MINESTERIO.setPreferredSize(new java.awt.Dimension(480, 75));
        boton_MINESTERIO.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/BOTON MINISTERIO 02-02.png"))); // NOI18N
        boton_MINESTERIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_MINESTERIOActionPerformed(evt);
            }
        });

        boton_CENTRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/BOTON CENTRO 01-02.png"))); // NOI18N
        boton_CENTRO.setToolTipText("");
        boton_CENTRO.setBorder(null);
        boton_CENTRO.setBorderPainted(false);
        boton_CENTRO.setDisabledIcon(null);
        boton_CENTRO.setMargin(new java.awt.Insets(0, 0, 0, 0));
        boton_CENTRO.setPreferredSize(new java.awt.Dimension(480, 75));
        boton_CENTRO.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/BOTON CENTRO 02-02.png"))); // NOI18N
        boton_CENTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_CENTROActionPerformed(evt);
            }
        });

        boton_CIUDADANO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/BOTON CIUDADANO 01-02.png"))); // NOI18N
        boton_CIUDADANO.setToolTipText("");
        boton_CIUDADANO.setBorder(null);
        boton_CIUDADANO.setBorderPainted(false);
        boton_CIUDADANO.setMargin(new java.awt.Insets(0, 0, 0, 0));
        boton_CIUDADANO.setPreferredSize(new java.awt.Dimension(480, 75));
        boton_CIUDADANO.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/BOTON CIUDADANO 02-02.png"))); // NOI18N
        boton_CIUDADANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_CIUDADANOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_MINESTERIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_CENTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_CIUDADANO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(boton_MINESTERIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imagen_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(boton_CENTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(boton_CIUDADANO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_CIUDADANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_CIUDADANOActionPerformed
        Vistas.Vistas_Ciudadano.LoginTes login = new Vistas.Vistas_Ciudadano.LoginTes();
        login.setVisible(true);
    }//GEN-LAST:event_boton_CIUDADANOActionPerformed

    private void boton_CENTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_CENTROActionPerformed
       Vistas.Vistas_Centros.Centro_Principal centro = new Vistas.Vistas_Centros.Centro_Principal();
        centro.setVisible(true);
    }//GEN-LAST:event_boton_CENTROActionPerformed

    private void boton_MINESTERIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_MINESTERIOActionPerformed
        Vistas.Vistas_ADM.Ministerio_Salud ministerio = new Vistas.Vistas_ADM.Ministerio_Salud();
        ministerio.setVisible(true);
    }//GEN-LAST:event_boton_MINESTERIOActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_CENTRO;
    private javax.swing.JButton boton_CIUDADANO;
    private javax.swing.JButton boton_MINESTERIO;
    private javax.swing.JLabel imagen_Fondo;
    // End of variables declaration//GEN-END:variables
}