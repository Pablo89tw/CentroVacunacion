package Vistas_Ciudadano;

import Conexion.TurnoData;
import Entidades.Turno;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class Solicitar_Turno extends javax.swing.JInternalFrame {

    private TurnoData tD;
    private Turno turno1;
    private Turno turno2;
    private Turno turno3;

    public Solicitar_Turno(TurnoData tD) {
        this.tD = tD;
        initComponents();
        jButton5.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        diaAnterior_fecha1 = new javax.swing.JButton();
        diaPosterior_fecha1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        diaPosterior_fecha2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        diaPosterior_fecha3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();

        jButton3.setText("jButton1");

        jLabel2.setText("1° Dosis");

        jLabel4.setText("Centro Vacunacion:");

        diaAnterior_fecha1.setText("<- Día");
        diaAnterior_fecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaAnterior_fecha1ActionPerformed(evt);
            }
        });

        diaPosterior_fecha1.setText("Dia ->");
        diaPosterior_fecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaPosterior_fecha1ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jButton4.setText("Proximo turno libre");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Solicitar Turno");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("2° Dosis");

        diaPosterior_fecha2.setText("Dia ->");
        diaPosterior_fecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaPosterior_fecha2ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });

        jLabel6.setText("3° Dosis");

        diaPosterior_fecha3.setText("Dia ->");
        diaPosterior_fecha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaPosterior_fecha3ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jDateChooser3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser3PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diaAnterior_fecha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diaPosterior_fecha1))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diaPosterior_fecha2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diaPosterior_fecha3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(diaPosterior_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(diaAnterior_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(diaPosterior_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(diaPosterior_fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        if (jDateChooser1.getDate() != null) {
            buscarTurnosLibres(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 1);
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void diaAnterior_fecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaAnterior_fecha1ActionPerformed
        LocalDate fecha = (jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).minusDays(1);
        jDateChooser1.setDate(java.sql.Date.valueOf(fecha));
        buscarTurnosLibres(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 1);
    }//GEN-LAST:event_diaAnterior_fecha1ActionPerformed

    private void diaPosterior_fecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaPosterior_fecha1ActionPerformed
        LocalDate fecha = (jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).plusDays(1);
        jDateChooser1.setDate(java.sql.Date.valueOf(fecha));
        buscarTurnosLibres(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 1);
    }//GEN-LAST:event_diaPosterior_fecha1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        proximoTurnoLibre();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        activarVacunacion();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void diaPosterior_fecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaPosterior_fecha2ActionPerformed
        LocalDate fecha = (jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).plusDays(1);
        jDateChooser2.setDate(java.sql.Date.valueOf(fecha));
        buscarTurnosLibres(jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 2);
    }//GEN-LAST:event_diaPosterior_fecha2ActionPerformed

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void diaPosterior_fecha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaPosterior_fecha3ActionPerformed
        LocalDate fecha = (jDateChooser3.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).plusDays(1);
        jDateChooser3.setDate(java.sql.Date.valueOf(fecha));
        buscarTurnosLibres(jDateChooser3.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 3);
    }//GEN-LAST:event_diaPosterior_fecha3ActionPerformed

    private void jDateChooser3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3PropertyChange

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        tomarTurno1();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        tomarTurno2();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        tomarTurno3();
        jButton5.setEnabled(true);
    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton diaAnterior_fecha1;
    private javax.swing.JButton diaPosterior_fecha1;
    private javax.swing.JButton diaPosterior_fecha2;
    private javax.swing.JButton diaPosterior_fecha3;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void buscarTurnosLibres(LocalDate date, int codigo) {
        ArrayList<String> turnos = tD.turnosLibres(date);
        DefaultComboBoxModel<String> cbModel;

        if (!turnos.isEmpty()) {
            cbModel = new DefaultComboBoxModel<>(turnos.toArray(new String[0]));
        } else {
            cbModel = new DefaultComboBoxModel<>(new String[]{"Sin Turnos"});
        }
        switch (codigo) {
            case 1:
                jComboBox1.setModel(cbModel);
                break;
            case 2:
                jComboBox2.setModel(cbModel);
                break;
            case 3:
                jComboBox3.setModel(cbModel);
                break;
        }
    }

    private void proximoTurnoLibre() {
        ArrayList<String> horarios;
        LocalDate fecha = LocalDate.now();
        do {
            horarios = tD.turnosLibres(fecha);
            fecha = fecha.plusDays(1);
        } while (horarios.isEmpty());
        jDateChooser1.setDate(java.sql.Date.valueOf(fecha.minusDays(1)));
    }

    private void tomarTurno1() {
        turno1 = new Turno(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jComboBox1.getSelectedItem().toString());
        jDateChooser2.setDate(java.sql.Date.valueOf(tD.planVacunatorio(turno1).getFecha()));
        buscarTurnosLibres(jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 2);
    }

    private void tomarTurno2() {
        turno2 = new Turno(jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jComboBox2.getSelectedItem().toString());
        jDateChooser3.setDate(java.sql.Date.valueOf(tD.planVacunatorio(turno2).getFecha()));
        buscarTurnosLibres(jDateChooser3.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 3);
    }

    private void tomarTurno3() {
        turno3 = new Turno(jDateChooser3.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jComboBox3.getSelectedItem().toString());
    }

    private void activarVacunacion() {
        tD.actualizarVacunatorio(turno1);
         tD.actualizarVacunatorio(turno2);
          tD.actualizarVacunatorio(turno3);
    }

}
