
package Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.Conectar;
import Conexion.LoginData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.geoData;
import Entidades.LogIN;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class LoginTes extends javax.swing.JFrame {

    private Connection con = Conectar.getConectar();
    private ArrayList<LogIN> logIN = new ArrayList();
    private LoginData lD = new LoginData();
    private TurnoData tD = new TurnoData();
    private CiudadanoData cD = new CiudadanoData();
    private VacunatorioData vD = new VacunatorioData();
    private geoData gD = new geoData();
   
    
    public LoginTes() {
       initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jText_usuLIN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPas_logIN = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        jLabel1.setMaximumSize(new java.awt.Dimension(60, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 20));

        jText_usuLIN.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jText_usuLIN.setForeground(new java.awt.Color(255, 255, 255));
        jText_usuLIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_usuLIN.setBorder(null);
        jText_usuLIN.setOpaque(false);
        jText_usuLIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jText_usuLINFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_usuLINFocusLost(evt);
            }
        });
        jText_usuLIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_usuLINKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jLabel2.setPreferredSize(new java.awt.Dimension(109, 20));

        jPas_logIN.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jPas_logIN.setForeground(new java.awt.Color(255, 255, 255));
        jPas_logIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPas_logIN.setBorder(null);
        jPas_logIN.setOpaque(false);
        jPas_logIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPas_logINFocusGained(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recordarme");
        jCheckBox1.setFocusPainted(false);
        jCheckBox1.setFocusable(false);
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jText_usuLIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPas_logIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jCheckBox1)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(331, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(295, 295, 295)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jText_usuLIN)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 76, Short.MAX_VALUE))
                        .addComponent(jPas_logIN))
                    .addGap(296, 296, 296)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jButton1))
                .addGap(260, 260, 260))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jText_usuLIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPas_logIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(290, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_usuLINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_usuLINFocusGained
        logIN = lD.cuentasA_Recordar();
    }//GEN-LAST:event_jText_usuLINFocusGained

    private void jText_usuLINFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_usuLINFocusLost
        for (int i = 0; i < logIN.size(); i++) {
            if (Integer.toString(logIN.get(i).getUsuario()).equals(jText_usuLIN.getText())){
                jPas_logIN.setText(logIN.get(i).getClave());
                jCheckBox1.setSelected(true);
            }
        }
    }//GEN-LAST:event_jText_usuLINFocusLost

    private void jText_usuLINKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_usuLINKeyReleased

    }//GEN-LAST:event_jText_usuLINKeyReleased

    private void jPas_logINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPas_logINFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPas_logINFocusGained

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       inicioSesion();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPas_logIN;
    private javax.swing.JTextField jText_usuLIN;
    // End of variables declaration//GEN-END:variables

public void inicioSesion() {
        try {
            int usuario = Integer.parseInt(jText_usuLIN.getText());
            String clave = String.valueOf(jPas_logIN.getPassword());
          
            if (lD.logIN(usuario, clave)) {
                boolean data = lD.analisisFaseIngreso(usuario);
                if (!data) {
                            if (!jCheckBox1.isSelected()){
                            lD.actualizarRecordar(0, usuario);
                            logIN = lD.cuentasA_Recordar();
                            } else if (jCheckBox1.isSelected()){
                            lD.actualizarRecordar(1, usuario);
                            logIN = lD.cuentasA_Recordar();    
                            }

                            Inscripcion admin = new Inscripcion(gD, vD, tD, lD, cD, usuario);
                            jDesktopPane1.add(admin);
                            admin.setVisible(true);
                    } else if (data){
                    
                if (!jCheckBox1.isSelected()) {
                    lD.actualizarRecordar(0, usuario);
                    logIN = lD.cuentasA_Recordar();
                    } else if (jCheckBox1.isSelected()){
                    lD.actualizarRecordar(1, usuario);
                    logIN = lD.cuentasA_Recordar();    
                    }
                    Datos_Ciudadano dC = new Datos_Ciudadano(cD, tD, usuario);
                    jDesktopPane1.add(dC);
                    dC.setVisible(true);
                    jDesktopPane1.moveToFront(dC);
                
                    jPas_logIN.setText("");
                    jText_usuLIN.setText("");
                    jCheckBox1.setSelected(false);
                } 
                
            }
        } catch (NumberFormatException ex) {
            jText_usuLIN.setText("");
            jPas_logIN.setText("");
            jCheckBox1.setSelected(false);
            
            JOptionPane.showMessageDialog(null, "Usurio Incorrecto");
        }
    }
}

