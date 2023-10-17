package Vistas_Ciudadano;

import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.VialData;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
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
    private DefaultTableModel modelo2 = new DefaultTableModel();
    private DefaultTableModel modelo = new DefaultTableModel();
 

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
        jLabel1 = new javax.swing.JLabel();
        jRB_CitasCumplidas = new javax.swing.JRadioButton();
        jRB_cicasCanceladas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRB_buscarPorCentro = new javax.swing.JRadioButton();
        jRB_buscarTodoslosCentros = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jRB_citasVencidas = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Buscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jSpinner4 = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();

        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jLabel1.setText("Ver citas:");

        jRB_CitasCumplidas.setText("Cumplidas");
        jRB_CitasCumplidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_CitasCumplidasActionPerformed(evt);
            }
        });

        jRB_cicasCanceladas.setText("Canceladas");
        jRB_cicasCanceladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_cicasCanceladasActionPerformed(evt);
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

        jRB_buscarPorCentro.setText("Por Vacunatorio");
        jRB_buscarPorCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_buscarPorCentroActionPerformed(evt);
            }
        });

        jRB_buscarTodoslosCentros.setText("Ver estadisticas de todos los vacunatorios");
        jRB_buscarTodoslosCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_buscarTodoslosCentrosActionPerformed(evt);
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

        jRB_citasVencidas.setText("Vencidas");
        jRB_citasVencidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_citasVencidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRB_buscarPorCentro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRB_buscarTodoslosCentros)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRB_CitasCumplidas)
                                    .addComponent(jRB_cicasCanceladas)
                                    .addComponent(jRB_citasVencidas))
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRB_buscarPorCentro)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRB_buscarTodoslosCentros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jRB_CitasCumplidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRB_cicasCanceladas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRB_citasVencidas)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel13.setText("VIALES DE LA MARCA");

        jLabel12.setText("CANTIDAD ");

        jRadioButton1.setText("Asignacion Simple");

        jRadioButton2.setText("Sin Asignacion");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        jRadioButton3.setText("Asignacion Multiple");

        jButton1.setText("Solicitar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Solicitar Viales", jPanel4);

        jLabel14.setText("VIALES DE LA MARCA");

        jLabel15.setText("CANTIDAD ");

        jLabel16.setText("Asignar Stocks");

        jLabel17.setText("AL CENTRO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(221, 221, 221))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(189, 189, 189)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel17)
                    .addContainerGap(133, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Asignar Viales a Centro", jPanel5);

        jLabel7.setText("CANTIDAD ");

        jLabel8.setText("VIALES DE LA MARCA");

        jButton2.setText("Reasignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Reasignar Stocks");

        jLabel10.setText("REASIGNAR DEL CENTRO");

        jLabel18.setText("AL CENTRO");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox6, 0, 185, Short.MAX_VALUE))))
                            .addComponent(jButton2)))
                    .addContainerGap(329, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Reasignar Viales", jPanel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2)
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Stocks", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRB_buscarPorCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_buscarPorCentroActionPerformed
        if (jRB_buscarPorCentro.isSelected())
            jComboBox1.setEnabled(true);
        else {
            jComboBox1.setEnabled(false);
        }
    }//GEN-LAST:event_jRB_buscarPorCentroActionPerformed

    private void jRB_buscarTodoslosCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_buscarTodoslosCentrosActionPerformed
        if (jRB_buscarTodoslosCentros.isSelected()) {
            jRB_citasVencidas.setEnabled(true);
            jRB_CitasCumplidas.setEnabled(true);
            jRB_cicasCanceladas.setEnabled(true);
        } else {
            jRB_citasVencidas.setEnabled(false);
            jRB_CitasCumplidas.setEnabled(false);
            jRB_cicasCanceladas.setEnabled(false);
        }
    }//GEN-LAST:event_jRB_buscarTodoslosCentrosActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem() != null) {
            jRB_citasVencidas.setEnabled(true);
            jRB_CitasCumplidas.setEnabled(true);
            jRB_cicasCanceladas.setEnabled(true);
        } else {
            jRB_citasVencidas.setEnabled(false);
            jRB_CitasCumplidas.setEnabled(false);
            jRB_cicasCanceladas.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRB_CitasCumplidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_CitasCumplidasActionPerformed
        if (jRB_CitasCumplidas.isSelected()) {
            armarTabla("completo");
        }
    }//GEN-LAST:event_jRB_CitasCumplidasActionPerformed

    private void jRB_cicasCanceladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_cicasCanceladasActionPerformed
        if (jRB_cicasCanceladas.isSelected()) {
            armarTabla("Cancelada");
        }
    }//GEN-LAST:event_jRB_cicasCanceladasActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if(jDateChooser1.getDate() != null){
            listarDosis_x_Centro(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jRB_citasVencidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_citasVencidasActionPerformed
       if (jRB_citasVencidas.isSelected()){
           armarTabla("Ausente");
       }
    }//GEN-LAST:event_jRB_citasVencidasActionPerformed

    private void jPanel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3FocusGained
        calcularStocks();
    }//GEN-LAST:event_jPanel3FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adquirirViales();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRB_CitasCumplidas;
    private javax.swing.JRadioButton jRB_buscarPorCentro;
    private javax.swing.JRadioButton jRB_buscarTodoslosCentros;
    private javax.swing.JRadioButton jRB_cicasCanceladas;
    private javax.swing.JRadioButton jRB_citasVencidas;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables

    private void armarComponentes() {
        jTabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                 if(jTabbedPane1.getSelectedIndex()+1 == 3){calcularStocks();}
                 if(jTabbedPane1.getSelectedIndex()+1 == 2){armadoTabla_vacunasDía();}
            }          
        });
        
        jRB_citasVencidas.setEnabled(false);
        jRB_CitasCumplidas.setEnabled(false);
        jRB_cicasCanceladas.setEnabled(false);
        jComboBox1.setEnabled(false);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(jRB_citasVencidas);
        grupo1.add(jRB_CitasCumplidas);
        grupo1.add(jRB_cicasCanceladas);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(jRB_buscarPorCentro);
        grupo2.add(jRB_buscarTodoslosCentros);
        
        ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(jRadioButton1);
        grupo3.add(jRadioButton2);
        grupo3.add(jRadioButton3);

        jRB_CitasCumplidas.setSelected(true);
        jRB_buscarPorCentro.setSelected(true);
          
        for (Vacunatorio centros : vD.listarVacunatorio()) {
            jComboBox2.addItem(centros.getNombre());
            jComboBox9.addItem(centros.getNombre());
            jComboBox6.addItem(centros.getNombre());
            jComboBox10.addItem(centros.getNombre()); 
        }
        
        String[] lista_viales = {"Pfizer","Johnson y Johnson","AstraZeneca","Sinopharm","Sputnik V"};
        DefaultComboBoxModel<String> modeloCB = new DefaultComboBoxModel<>(lista_viales);
            jComboBox4.setModel(modeloCB);
            jComboBox7.setModel(modeloCB);
            jComboBox5.setModel(modeloCB);
    }

    private void armarTabla(String codigo_estadoCita) {
     int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0;
            if (jRB_CitasCumplidas.isSelected()){   
                modelo.setColumnCount(0);
                modelo.addColumn("DNI");
                modelo.addColumn("N° Dosis");
                modelo.addColumn("Fecha");
                modelo.addColumn("Vial");
                modelo.addColumn("Numero Serie");
                modelo.setRowCount(0);
                if(jRB_buscarTodoslosCentros.isSelected()){
                    modelo.addColumn("Centro");
                }
                } else {
                    modelo.setColumnCount(0);
                    modelo.addColumn("DNI");
                    modelo.addColumn("N° Dosis");
                    modelo.addColumn("Fecha");
                     if(jRB_buscarTodoslosCentros.isSelected()){
                        modelo.addColumn("Centro");
                         }
                    modelo.setRowCount(0);
                    }
            
                modelo2.setColumnCount(0);                       
                modelo2.addColumn("Vacuna");
                modelo2.addColumn("Cantidad Aplicadas");
                modelo2.setRowCount(0);
                
                
         jTable1.setModel(modelo);
         jTable2.setModel(modelo2);
        
        if (jRB_buscarPorCentro.isSelected()) {
            for (Turno turno : tD.listar_Turnos(LocalDate.now(), vD.listarVacunatorioNombre(jComboBox1.getSelectedItem().toString()).get(0), codigo_estadoCita)) {
                if (jRB_CitasCumplidas.isSelected()) {
                    modelo.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha(), turno.getVial().getMarca(), turno.getVial().getNumeroSerie()});
                    switch (turno.getVial().getMarca()){
                       case "Sputnik V": Sputnik++; break;
                       case "Pfizer": Pfizer++; break;
                       case "Sinopharm y Sinovac": Sinopharm++; break;
                       case "Johnson_Johnson": Johnson++; break;
                       case "AstraZeneca": AstraZeneca++; break;      
                       }                 
                } else {
                    modelo.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha()});
                }
            }
            if (jRB_CitasCumplidas.isSelected()){
                modelo2.addRow(new Object[]{"Sputnik V", Sputnik});
                modelo2.addRow(new Object[]{"Pfizer", Pfizer});
                modelo2.addRow(new Object[]{"Sinopharm y Sinovac", Sinopharm});
                modelo2.addRow(new Object[]{"Johnson y Johnson", Johnson});
                modelo2.addRow(new Object[]{"AstraZeneca", AstraZeneca});
            }
        } else if (jRB_buscarTodoslosCentros.isSelected()){
            for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
                for (Turno turno : tD.listar_Turnos(LocalDate.now(), vD.listarVacunatorioNombre(vacunatorio.getNombre()).get(0), codigo_estadoCita)) {
                    if (jRB_CitasCumplidas.isSelected()) {
                        modelo.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha(), turno.getVial().getMarca(),vacunatorio.getNombre()});
                            switch (turno.getVial().getMarca()){
                               case "Sputnik V": Sputnik++; break;
                               case "Pfizer": Pfizer++; break;
                               case "Sinopharm y Sinovac": Sinopharm++; break;
                               case "Johnson_Johnson": Johnson++; break;
                               case "AstraZeneca": AstraZeneca++; break;      
                               }                 
                    } else {
                        modelo.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha(),vacunatorio.getNombre()});
                    }
                }
            }
                if (jRB_CitasCumplidas.isSelected()){
                    modelo2.addRow(new Object[]{"Sputnik V", Sputnik});
                    modelo2.addRow(new Object[]{"Pfizer", Pfizer});
                    modelo2.addRow(new Object[]{"Sinopharm y Sinovac", Sinopharm});
                    modelo2.addRow(new Object[]{"Johnson y Johnson", Johnson});
                    modelo2.addRow(new Object[]{"AstraZeneca", AstraZeneca});
                }
            }
        }
    
    public void armadoTabla_vacunasDía(){
        model4.setColumnCount(0);
        model4.addColumn("Nombre");
        model4.addColumn("Total");
        model4.addColumn("Sputnik V");
        model4.addColumn("Pfizer");
        model4.addColumn("Sinopharm");
        model4.addColumn("Johnson");
        model4.addColumn("AstraZeneca");
        model4.setRowCount(0);
        jTable3.setModel(model4);
    }
    
    public void listarDosis_x_Centro(LocalDate fecha){

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
        model5.setColumnCount(0);
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
                for (Vial viales : sD.listarViales(0,vacunatorio.getIdVacunatorio())){
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
           int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0, total = 0;
                for (Vial viales : sD.listarViales(0,0)){
                            switch (viales.getMarca()){
                               case "Sputnik V": Sputnik++; total++; break;
                               case "Pfizer": Pfizer++;total++; break;
                               case "Sinopharm y Sinovac": Sinopharm++;total++; break;
                               case "Johnson_Johnson": Johnson++; total++;break;
                               case "AstraZeneca": AstraZeneca++;total++;break;      
                                }                 
                    }
           model5.addRow(new Object[]{"Gobierno",total,Sputnik,Pfizer,Sinopharm,Johnson,AstraZeneca});
            }
    
    private void adquirirViales(){
        int idVacunatorio = 0;
        if (!jRadioButton3.isSelected()){
            if (jRadioButton1.isSelected()){
              idVacunatorio = vD.listarVacunatorioNombre(jComboBox2.getSelectedItem().toString()).get(0).getIdVacunatorio();
            }
          
            for (int i = 0; i < Integer.parseInt(jSpinner3.getValue().toString()); i++) {
                sD.compraViales(idVacunatorio,jComboBox4.getSelectedItem().toString());                 
            }
            calcularStocks();
        }
    }
}



