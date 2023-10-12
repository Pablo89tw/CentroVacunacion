package Vistas_Ciudadano;

import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.VialData;
import Entidades.Laboratorio;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ButtonGroup;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class Administrador_Centros extends javax.swing.JInternalFrame {
    private VialData sD = new VialData();
    private VacunatorioData vD = new VacunatorioData();
    private Vacunatorio vac = new Vacunatorio();
    private TurnoData tD;
    private DefaultTableModel model5 = new DefaultTableModel();
    private DefaultTableModel model4 = new DefaultTableModel();
    private DefaultTableModel model3 = new DefaultTableModel();
    private DefaultTableModel model2 = new DefaultTableModel();
    private DefaultTableModel model = new DefaultTableModel();
 

    public Administrador_Centros(TurnoData tD) {
        this.tD = tD;

        initComponents();
        armarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Buscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();

        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jRadioButton1.setText("Vencidas ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ver citas:");

        jRadioButton2.setText("Cumplidas");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Canceladas");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jRadioButton4.setText("Por Vacunatorio");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Totales");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jRadioButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton3)))))
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("Resumen Citas Mes", jPanel1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jDateChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser1FocusLost(evt);
            }
        });
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseEntered(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Resumen del día", jPanel2);

        jPanel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel3FocusGained(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jLabel2.setText("Reasignar Stocks");

        jLabel3.setText("REASIGNAR DEL CENTRO");

        jLabel4.setText("AL CENTRO");

        jLabel5.setText("CANTIDAD ");

        jLabel6.setText("VIALES DE LA MARCA");

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton1.setText("Reasignar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinner1)
                                    .addComponent(jComboBox4, 0, 185, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Stocks", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if (jRadioButton4.isSelected())
            jComboBox1.setEnabled(true);
        else {
            jComboBox1.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if (jRadioButton5.isSelected()) {
            jRadioButton1.setEnabled(true);
            jRadioButton2.setEnabled(true);
            jRadioButton3.setEnabled(true);
        } else {
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
            jRadioButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem() != null) {
            jRadioButton1.setEnabled(true);
            jRadioButton2.setEnabled(true);
            jRadioButton3.setEnabled(true);
        } else {
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
            jRadioButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton4.isSelected()) {
            armarTabla("Ausente");
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            armarTabla("completo");
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if (jRadioButton3.isSelected()) {
            armarTabla("Cancelada");
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
     
       
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseEntered
       
    }//GEN-LAST:event_jDateChooser1MouseEntered

    private void jDateChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser1FocusLost
        
    }//GEN-LAST:event_jDateChooser1FocusLost

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if(jDateChooser1.getDate() != null){
            listarDosis_x_Centro(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jPanel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3FocusGained
        calcularStocks();
    }//GEN-LAST:event_jPanel3FocusGained

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
       
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reasingarStocks();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables

    private void armarComponentes() {
        jTabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                 if(jTabbedPane1.getSelectedIndex()+1 == 3){calcularStocks();}
            }          
        });
        
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jComboBox1.setEnabled(false);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(jRadioButton4);
        buttonGroup2.add(jRadioButton5);

        jRadioButton2.setSelected(true);
        jRadioButton4.setSelected(true);

        for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
            jComboBox1.addItem(vacunatorio.getNombre());
        }
        
        for (Vacunatorio vacunatorio : vD.listarVacunatorio()){
           jComboBox2.addItem(vacunatorio.getNombre());
           jComboBox3.addItem(vacunatorio.getNombre());
        }
        
      
        jComboBox4.addItem("Sputnik V");
        jComboBox4.addItem("Pfizer");
        jComboBox4.addItem("Sinopharm y Sinovac");
        jComboBox4.addItem("Johnson_Johnson");
        jComboBox4.addItem("AstraZeneca");
              
    }

    private void armarTabla(String codigo_estadoCita) {
         int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0;
                model.addColumn("DNI");
                model.addColumn("N° Dosis");
                model.addColumn("Fecha");
                model.addColumn("Vial");
                model.setRowCount(0);

                model2.addColumn("DNI");
                model2.addColumn("N° Dosis");
                model2.addColumn("Fecha");
                model2.setRowCount(0);
        
                model3.addColumn("Vacuna");
                model3.addColumn("Cantidad Aplicadas");
                model3.setRowCount(0);
       
                
        if (jRadioButton2.isSelected()) {
            jTable1.setModel(model);
        } else if (jRadioButton1.isSelected() || jRadioButton3.isSelected()) {
            jTable1.setModel(model2);
        }

        jTable2.setModel(model3);
        
        if (jRadioButton4.isSelected()) {
            for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
                if (vacunatorio.getNombre().equals(jComboBox1.getSelectedItem().toString())) {
                    vac = vacunatorio;
                }
            }
            for (Turno turno : tD.listar_Turnos(LocalDate.now(), vac, codigo_estadoCita)) {
                if (jRadioButton2.isSelected()) {
                    model.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha(), turno.getVial().getMarca()});
                        switch (turno.getVial().getMarca()){
                           case "Sputnik V": Sputnik++; break;
                           case "Pfizer": Pfizer++; break;
                           case "Sinopharm y Sinovac": Sinopharm++; break;
                           case "Johnson_Johnson": Johnson++; break;
                           case "AstraZeneca": AstraZeneca++; break;      
                            }                 
                } else {
                    model2.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha()});
                }
            }
            if (jRadioButton2.isSelected()){
                model3.addRow(new Object[]{"Sputnik V", Sputnik});
                model3.addRow(new Object[]{"Pfizer", Pfizer});
                model3.addRow(new Object[]{"Sinopharm y Sinovac", Sinopharm});
                model3.addRow(new Object[]{"Johnson_Johnson", Johnson});
                model3.addRow(new Object[]{"AstraZeneca", AstraZeneca});
            }
        } else if (jRadioButton5.isSelected()){
            
            for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
                for (Turno turno : tD.listar_Turnos(LocalDate.now(), vacunatorio, codigo_estadoCita)) {
                    if (jRadioButton2.isSelected()) {
                        model.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha(), turno.getVial().getMarca()});
                            switch (turno.getVial().getMarca()){
                               case "Sputnik V": Sputnik++; break;
                               case "Pfizer": Pfizer++; break;
                               case "Sinopharm y Sinovac": Sinopharm++; break;
                               case "Johnson_Johnson": Johnson++; break;
                               case "AstraZeneca": AstraZeneca++; break;      
                                }                 
                    } else {
                        model2.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha()});
                    }
                }
            }
                if (jRadioButton2.isSelected()){
                    model3.addRow(new Object[]{"Sputnik V", Sputnik});
                    model3.addRow(new Object[]{"Pfizer", Pfizer});
                    model3.addRow(new Object[]{"Sinopharm y Sinovac", Sinopharm});
                    model3.addRow(new Object[]{"Johnson y Johnson", Johnson});
                    model3.addRow(new Object[]{"AstraZeneca", AstraZeneca});
                }
        }
    }
    
    public void listarDosis_x_Centro(LocalDate fecha){
        model4.addColumn("Nombre");
        model4.addColumn("Total");
        model4.addColumn("Sputnik V");
        model4.addColumn("Pfizer");
        model4.addColumn("Sinopharm");
        model4.addColumn("Johnson");
        model4.addColumn("AstraZeneca");
        model4.setRowCount(0);
        jTable3.setModel(model4);

         for (Vacunatorio vacunatorio : vD.listarVacunatorio()){
            int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0, total = 0;
                for (Turno turno : tD.listar_Turnos(fecha, vacunatorio, "porDia")) {
                            switch (turno.getVial().getMarca()){
                               case "Sputnik V": Sputnik++; total++; break;
                               case "Pfizer": Pfizer++;total++; break;
                               case "Sinopharm y Sinovac": Sinopharm++;total++; break;
                               case "Johnson_Johnson": Johnson++; total++;break;
                               case "AstraZeneca": AstraZeneca++;total++;break;      
                                }                 
                    }
                model4.addRow(new Object[]{vacunatorio.getNombre(),total,Sputnik,Pfizer,Sinopharm,Johnson,AstraZeneca});
            }
        }
    
    private void calcularStocks(){
        model5.addColumn("Nombre");
        model5.addColumn("Total");
        model5.addColumn("Sputnik V");
        model5.addColumn("Pfizer");
        model5.addColumn("Sinopharm");
        model5.addColumn("Johnson");
        model5.addColumn("AstraZeneca");
        model5.setRowCount(0);
        jTable4.setModel(model5);
        
         for (Vacunatorio vacunatorio : vD.listarVacunatorio()){
            int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0, total = 0;
                for (Vial viales : sD.listarViales(0)){
                            switch (viales.getMarca()){
                               case "Sputnik V": Sputnik++; total++; break;
                               case "Pfizer": Pfizer++;total++; break;
                               case "Sinopharm y Sinovac": Sinopharm++;total++; break;
                               case "Johnson_Johnson": Johnson++; total++;break;
                               case "AstraZeneca": AstraZeneca++;total++;break;      
                                }                 
                    }
           model5.addRow(new Object[]{vacunatorio.getNombre(),total,Sputnik,Pfizer,Sinopharm,Johnson,AstraZeneca});

            }
         
        } 
    

    private void reasingarStocks(){
        Vacunatorio donante = null; 
        Vacunatorio aceptor = null;
        for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
            if (vacunatorio.getNombre().equals(jComboBox2.getSelectedItem().toString())){
                donante = vD.buscarVacunatorio(vacunatorio.getIdVacunatorio());
            } else if (vacunatorio.getNombre().equalsIgnoreCase(jComboBox3.getSelectedItem().toString())){
                aceptor = vD.buscarVacunatorio(vacunatorio.getIdVacunatorio());
               }
        }
        
        Vial vial = new Vial();
        vial.setMarca(jComboBox4.getSelectedItem().toString());
        for (int i = 0; i < Integer.parseInt(jSpinner1.getValue().toString()); i++) {
            sD.reasignarViales(donante, aceptor, vial);
        }
    }
}


