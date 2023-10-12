package Vistas_Ciudadano;

import Conexion.CiudadanoData;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Patologias_ADM extends javax.swing.JInternalFrame {

    private int DNI;
    private ArrayList<String> patologias = new ArrayList();
    CiudadanoData cD;
       
    public Patologias_ADM(int DNI, CiudadanoData cD) {
        this.cD = cD;
        this.DNI = DNI;
        initComponents();
        this.patologias = cD.consultaPatologias(DNI);
        armadoComponentes();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Actualizar_2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        Diabetes2 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        otras_Patologias = new javax.swing.JTextField();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();

        Actualizar_2.setText("Actualizar Datos");
        Actualizar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_2ActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel30.setText("Otros");

        jLabel31.setText("Inmunosupresion");

        jLabel32.setText("Enfermedades Hepáticas");

        jRadioButton1.setText("Si");

        jRadioButton2.setText("No");

        jRadioButton3.setText("Si");

        jRadioButton4.setText("No");

        jRadioButton11.setText("Si");

        jRadioButton5.setText("Si");

        jRadioButton12.setText("No");

        jRadioButton6.setText("No");

        jRadioButton13.setText("Si");

        jRadioButton7.setText("Si");

        Diabetes2.setText("Diabetes");

        jRadioButton8.setText("No");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton14.setText("No");

        jLabel25.setText("Enfermedades Cardiovasculares");

        jRadioButton9.setText("Si");

        jRadioButton10.setText("No");

        jLabel33.setText("Enfermedades Neurológicas");

        otras_Patologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otras_PatologiasActionPerformed(evt);
            }
        });

        jRadioButton15.setText("Si");

        jLabel26.setText("Enfermedades Respiratorias Crónicas");

        jRadioButton16.setText("No");

        jLabel27.setText("Obesidad");

        jRadioButton17.setText("Si");

        jLabel28.setText("Enfermedades Renales Crónicas");

        jRadioButton18.setText("No");

        jLabel29.setText("Embarazo");

        jDesktopPane1.setLayer(Actualizar_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Diabetes2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(otras_Patologias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(Actualizar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(104, 104, 104))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(jRadioButton1)
                            .addGap(15, 15, 15)
                            .addComponent(jRadioButton2)
                            .addGap(269, 269, 269)
                            .addComponent(jRadioButton12))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(jRadioButton3)
                            .addGap(15, 15, 15)
                            .addComponent(jRadioButton4)
                            .addGap(29, 29, 29)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(jRadioButton13))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jRadioButton5)
                            .addGap(85, 85, 85)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(jRadioButton15))
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addComponent(jRadioButton16))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(330, 330, 330)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(jRadioButton17))
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addComponent(jRadioButton18))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(jRadioButton10)
                            .addGap(29, 29, 29)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(jRadioButton9))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(jRadioButton7))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(330, 330, 330)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(jRadioButton8))
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(570, 570, 570)
                            .addComponent(jRadioButton14))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(520, 520, 520)
                            .addComponent(jRadioButton11))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(jRadioButton6))
                        .addComponent(Diabetes2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(370, 370, 370)
                            .addComponent(otras_Patologias, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar_2)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton1)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton12))
                            .addGap(5, 5, 5)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton3)
                                        .addComponent(jRadioButton4)
                                        .addComponent(jRadioButton13))))
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton5)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton15)
                                        .addComponent(jRadioButton16))))
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton17)
                                        .addComponent(jRadioButton18))))
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton10)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jRadioButton9))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jRadioButton7))
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jRadioButton8))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jRadioButton14))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(otras_Patologias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jRadioButton11))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jRadioButton6))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(Diabetes2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Actualizar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_2ActionPerformed
        actualizarDatosModificados();
        JOptionPane.showMessageDialog(null, "Base de datos de patologias actualizadas");
    }//GEN-LAST:event_Actualizar_2ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void otras_PatologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otras_PatologiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otras_PatologiasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_2;
    private javax.swing.JLabel Diabetes2;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField otras_Patologias;
    // End of variables declaration//GEN-END:variables

    private void armadoComponentes(){
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(jRadioButton3);
        buttonGroup2.add(jRadioButton4);
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(jRadioButton5);
        buttonGroup3.add(jRadioButton6);
        ButtonGroup buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(jRadioButton7);
        buttonGroup4.add(jRadioButton8);
        ButtonGroup buttonGroup5 = new ButtonGroup();
        buttonGroup5.add(jRadioButton9);
        buttonGroup5.add(jRadioButton10);
        ButtonGroup buttonGroup6 = new ButtonGroup();
        buttonGroup6.add(jRadioButton11);
        buttonGroup6.add(jRadioButton12);
        ButtonGroup buttonGroup7 = new ButtonGroup();
        buttonGroup7.add(jRadioButton13);
        buttonGroup7.add(jRadioButton14);
        ButtonGroup buttonGroup8 = new ButtonGroup();
        buttonGroup8.add(jRadioButton15);
        buttonGroup8.add(jRadioButton16);
        ButtonGroup buttonGroup9 = new ButtonGroup();
        buttonGroup9.add(jRadioButton17);
        buttonGroup9.add(jRadioButton18);
            
        jRadioButton2.setSelected(true);
        jRadioButton4.setSelected(true);
        jRadioButton6.setSelected(true);
        jRadioButton8.setSelected(true);
        jRadioButton10.setSelected(true);
        jRadioButton12.setSelected(true);
        jRadioButton14.setSelected(true);
        jRadioButton16.setSelected(true);
        jRadioButton18.setSelected(true);

        if (patologias.contains("Cardiovasculares")){jRadioButton1.setSelected(true);}
        if (patologias.contains("Diabetes")){jRadioButton3.setSelected(true);}
        if (patologias.contains("Respiratorias_Cronicas")){jRadioButton5.setSelected(true);}  
        if (patologias.contains("Inmunosupresion")){jRadioButton7.setSelected(true);}  
        if (patologias.contains("Obesidad")){jRadioButton9.setSelected(true);}  
        if (patologias.contains("Renales_Cronicas")){jRadioButton11.setSelected(true);} 
        if (patologias.contains("Embarazo")){jRadioButton13.setSelected(true);}  
        if (patologias.contains("Hepaticas_cronicas")){jRadioButton15.setSelected(true);}  
        if (patologias.contains("Neurologicas")){jRadioButton17.setSelected(true);}  
    }

    
    private void actualizarDatosModificados(){
        ArrayList <String> nuevasPatologias = new ArrayList();
        ArrayList <String> patologias_Agregar = new ArrayList();
        ArrayList <String> patologias_Sacar = new ArrayList();
        
       if (jRadioButton1.isSelected()){nuevasPatologias.add("Cardiovasculares");}
       if (jRadioButton3.isSelected()){nuevasPatologias.add("Diabetes");}
       if (jRadioButton5.isSelected()){nuevasPatologias.add("Respiratorias_Cronicas");}
       if (jRadioButton7.isSelected()){nuevasPatologias.add("Inmunosupresion");}
       if (jRadioButton9.isSelected()){nuevasPatologias.add("Obesidad");}
       if (jRadioButton11.isSelected()){nuevasPatologias.add("Renales_Cronicas");}
       if (jRadioButton13.isSelected()){nuevasPatologias.add("Embarazo");}
       if (jRadioButton15.isSelected()){nuevasPatologias.add("Hepaticas_cronicas");}
       if (jRadioButton17.isSelected()){nuevasPatologias.add("Neurologicas");}
       
        for (String patologia : nuevasPatologias) {
            if(!patologias.contains(patologia)){
                patologias_Agregar.add(patologia);
            }
        }
       
        for (String patologia : patologias) {
            if (!nuevasPatologias.contains(patologia)){
                patologias_Sacar.add(patologia);
            }
        }
       
        cD.actualiarPatologias(DNI, patologias_Agregar, patologias_Sacar, otras_Patologias.getText());
        
      }
        
}
        
        
        

