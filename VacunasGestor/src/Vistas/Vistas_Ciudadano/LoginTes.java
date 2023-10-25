
package Vistas.Vistas_Ciudadano;

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

        img_Ciudadano = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jText_usuLIN = new javax.swing.JTextField();
        jPas_logIN = new javax.swing.JPasswordField();
        INGRESAR = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        img_Pantalla_Ciudadano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ciudadano");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 628));

        img_Ciudadano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CIUDADANO.png"))); // NOI18N
        img_Ciudadano.setMaximumSize(new java.awt.Dimension(250, 600));
        img_Ciudadano.setMinimumSize(new java.awt.Dimension(250, 600));
        img_Ciudadano.setPreferredSize(new java.awt.Dimension(250, 600));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(550, 600));

        jText_usuLIN.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jText_usuLIN.setForeground(new java.awt.Color(85, 106, 124));
        jText_usuLIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_usuLIN.setBorder(null);
        jText_usuLIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jText_usuLINFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_usuLINFocusLost(evt);
            }
        });

        jPas_logIN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPas_logIN.setForeground(new java.awt.Color(85, 106, 124));
        jPas_logIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPas_logIN.setBorder(null);

        INGRESAR.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        INGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INGRESAR_01-05.png"))); // NOI18N
        INGRESAR.setPreferredSize(new java.awt.Dimension(98, 34));
        INGRESAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INGRESAR_02-05.png"))); // NOI18N
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFocusPainted(false);
        jCheckBox1.setFocusable(false);
        jCheckBox1.setOpaque(false);

        img_Pantalla_Ciudadano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/FONDO_LOGIN-04.png"))); // NOI18N
        img_Pantalla_Ciudadano.setPreferredSize(new java.awt.Dimension(550, 600));

        jDesktopPane1.setLayer(jText_usuLIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPas_logIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(INGRESAR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(img_Pantalla_Ciudadano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jText_usuLIN, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jPas_logIN, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jCheckBox1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(INGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(img_Pantalla_Ciudadano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jText_usuLIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jPas_logIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(jCheckBox1))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(INGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(img_Pantalla_Ciudadano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img_Ciudadano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_Ciudadano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
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

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
       inicioSesion();
    }//GEN-LAST:event_INGRESARActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INGRESAR;
    private javax.swing.JLabel img_Ciudadano;
    private javax.swing.JLabel img_Pantalla_Ciudadano;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
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

                            Inscripcion admin = new Inscripcion(gD, vD, tD, lD, cD, usuario,img_Pantalla_Ciudadano.getLocationOnScreen(),img_Pantalla_Ciudadano.getSize());
                            jDesktopPane1.add(admin);
                            admin.setVisible(true);
                            jDesktopPane1.moveToFront(admin);
                            
                    } else if (data){
                    
                if (!jCheckBox1.isSelected()) {
                    lD.actualizarRecordar(0, usuario);
                    logIN = lD.cuentasA_Recordar();
                    } else if (jCheckBox1.isSelected()){
                    lD.actualizarRecordar(1, usuario);
                    logIN = lD.cuentasA_Recordar();    
                    }
                    Cuenta_Ciudadano dC = new Cuenta_Ciudadano(cD, tD, usuario,img_Pantalla_Ciudadano.getLocationOnScreen(),img_Pantalla_Ciudadano.getSize());
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

