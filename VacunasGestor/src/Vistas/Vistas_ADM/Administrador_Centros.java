package Vistas.Vistas_ADM;

import Conexion.CiudadanoData;
import Conexion.LoginData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.VialData;
import Entidades.Ciudadano;
import Entidades.LogIN;
import Entidades.Pedidos;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Administrador_Centros extends javax.swing.JInternalFrame {

    private VialData sD = new VialData();
    private VacunatorioData vD = new VacunatorioData();
    private CiudadanoData cD = new CiudadanoData();
    private LoginData lD = new LoginData();
    private TurnoData tD;
    private DefaultTableModel modelo_tabla6 = new DefaultTableModel();
    private DefaultTableModel modelo_tabla2 = new DefaultTableModel();
    private DefaultTableModel modelo_tabla0 = new DefaultTableModel();
    private DefaultTableModel modelo_tabla1 = new DefaultTableModel();
    private DefaultTableModel modelo_tabla4 = new DefaultTableModel();
    private DefaultTableModel modelo_tabla5 = new DefaultTableModel();
    private Pedidos pedido = new Pedidos();

    public Administrador_Centros(TurnoData tD) {
        this.tD = tD;
        initComponents();
        armarComponentes();

        String[] lista_viales = {"Pfizer", "Johnson_Johnson", "AstraZeneca", "Sinopharm y Sinovac", "Sputnik V"};
        modelo_tabla5.setColumnCount(0);
        modelo_tabla5.addColumn("Donante");
        modelo_tabla5.addColumn("Aceptor");
        for (String vial : lista_viales) {
            modelo_tabla5.addColumn(vial);
        }
        modelo_tabla5.setRowCount(0);
        jTable5.setModel(modelo_tabla5);

        modelo_tabla6.setColumnCount(0);
        modelo_tabla6.addColumn("Donante");
        modelo_tabla6.addColumn("Aceptor");
        for (String vial : lista_viales) {
            modelo_tabla6.addColumn(vial);
        }
        modelo_tabla6.setRowCount(0);
        jTable6.setModel(modelo_tabla6);

        jRadioButton1.setSelected(true);

        ButtonGroup grupo10 = new ButtonGroup();
        grupo10.add(jRadioButton7);
        grupo10.add(jRadioButton8);
        jRadioButton7.setSelected(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
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
        jTable0 = new javax.swing.JTable();
        jRB_citasVencidas = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Buscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabla3 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jRadioButton4 = new javax.swing.JRadioButton();
        jComboBox13 = new javax.swing.JComboBox<>();
        jSpinner6 = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jComboBox8 = new javax.swing.JComboBox<>();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();

        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jScrollPane8.setViewportView(jList1);

        jRadioButton7.setText("Pendientes");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("Completos");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jScrollPane9.setViewportView(jList2);

        jLabel4.setText("Pedidos");

        jLabel5.setText("Datos");

        jButton8.setText("Cumplir pedido");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jRadioButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton8))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedidos Viales", jPanel8);

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

        jTable0.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable0);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
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
        jScrollPane3.setViewportView(jTable2);

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

        jTabla3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTabla3);

        jLabel12.setText("CANTIDAD ");

        jRadioButton1.setText("Solicitud Simple");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
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
        jScrollPane5.setViewportView(jTable4);

        jRadioButton3.setText("Solicitud Multiple");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Solicitar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar Centro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        jTabbedPane2.addTab("Solicitar Viales", jPanel4);

        jRadioButton4.setText("Asignacion Simple");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton4.setText("Asignar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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
        jScrollPane6.setViewportView(jTable5);

        jRadioButton5.setText("Solicitud Multiple");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jButton5.setText("Agregar Centro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jRadioButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jButton4))
        );

        jTabbedPane2.addTab("Asignar Viales a Centro", jPanel5);

        jButton2.setText("Reasignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("REASIGNAR DEL CENTRO");

        jLabel18.setText("AL CENTRO");

        jRadioButton2.setText("Solicitud Simple");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Solicitud Multiple");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jButton6.setText("Agregar Centro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(148, 148, 148))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jTabbedPane2.addTab("Reasignar Viales", jPanel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stocks", jPanel3);

        jButton7.setText("Habilitar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setText("Dar login a ");

        jLabel3.setText("ciudadanos");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton7)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(488, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Habilitar Ciudadanos", jPanel7);

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
        if (jDateChooser1.getDate() != null) {
            listarDosis_x_Centro(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jRB_citasVencidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_citasVencidasActionPerformed
        if (jRB_citasVencidas.isSelected()) {
            armarTabla("Ausente");
        }
    }//GEN-LAST:event_jRB_citasVencidasActionPerformed

    private void jPanel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3FocusGained
        calcularStocks();
    }//GEN-LAST:event_jPanel3FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            asignarViales(jComboBox6.getSelectedItem().toString(), jComboBox5.getSelectedItem().toString(), jComboBox10.getSelectedItem().toString(), Integer.parseInt(jSpinner2.getValue().toString()));
        } else if (jRadioButton6.isSelected()) {
            asignacionMultipleTotal();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adquirirViales();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            jComboBox2.setEnabled(true);
            jComboBox4.setEnabled(true);
            jSpinner3.setEnabled(true);
            jComboBox3.setEnabled(false);
            jButton3.setEnabled(false);
            jTable4.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modelo_tabla4.addRow(new Object[]{jComboBox3.getSelectedItem().toString()});
        jComboBox3.removeItem(jComboBox3.getSelectedItem());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if (jRadioButton3.isSelected()) {
            jComboBox2.setEnabled(false);
            jComboBox4.setEnabled(false);
            jSpinner3.setEnabled(false);
            jComboBox3.setEnabled(true);
            jButton3.setEnabled(true);
            jTable4.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jComboBox6.setEnabled(true);
        jComboBox10.setEnabled(true);
        jComboBox5.setEnabled(true);
        jSpinner2.setEnabled(true);
        jComboBox11.setEnabled(false);
        jComboBox12.setEnabled(false);
        jButton6.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jComboBox13.setEnabled(true);
        jComboBox7.setEnabled(true);
        jSpinner6.setEnabled(true);
        jComboBox8.setEnabled(false);
        jComboBox9.setEnabled(false);
        jButton5.setEnabled(false);
        jTable5.setEnabled(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jRadioButton4.isSelected()) {
            asignarViales(vD.buscarVacunatorio(0).getNombre(), jComboBox7.getSelectedItem().toString(), vD.listarVacunatorioNombre(jComboBox13.getSelectedItem().toString()).get(0).getNombre(), Integer.parseInt(jSpinner6.getValue().toString()));
        } else if (jRadioButton5.isSelected()) {
            asignacionVialesMultiple();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if (jRadioButton5.isSelected()) {
            jComboBox13.setEnabled(false);
            jComboBox7.setEnabled(false);
            jSpinner6.setEnabled(false);
            jComboBox8.setEnabled(true);
            jComboBox9.setEnabled(true);
            jButton5.setEnabled(true);
            jTable5.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        modelo_tabla5.addRow(new Object[]{"Gobierno", jComboBox9.getSelectedItem().toString()});
        jComboBox9.removeItem(jComboBox9.getSelectedItem());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        jComboBox6.setEnabled(false);
        jComboBox10.setEnabled(false);
        jComboBox5.setEnabled(false);
        jSpinner2.setEnabled(false);
        jComboBox11.setEnabled(true);
        jComboBox12.setEnabled(true);
        jButton6.setEnabled(true);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        modelo_tabla6.addRow(new Object[]{jComboBox11.getSelectedItem().toString(), jComboBox12.getSelectedItem().toString()});
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        habilitarCiudadanos(Integer.parseInt(jSpinner1.getValue().toString()));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        if (jRadioButton7.isSelected()) {
            armarListasPedidos("Pendiente");
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        if (jRadioButton8.isSelected()) {
            armarListasPedidos("Completo");
        }
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        darStocks();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRB_CitasCumplidas;
    private javax.swing.JRadioButton jRB_buscarPorCentro;
    private javax.swing.JRadioButton jRB_buscarTodoslosCentros;
    private javax.swing.JRadioButton jRB_cicasCanceladas;
    private javax.swing.JRadioButton jRB_citasVencidas;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTabla3;
    private javax.swing.JTable jTable0;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables

    private void armarComponentes() {
        jTabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (jTabbedPane1.getSelectedIndex() + 1 == 3) {
                    armadoTablasStocks();
                    calcularStocks();

                }
                if (jTabbedPane1.getSelectedIndex() + 1 == 2) {
                    armadoTabla_vacunasDía();
                }
            }
        });
        jButton8.setEnabled(false);
        jComboBox2.setEnabled(false);
        jRB_citasVencidas.setEnabled(false);
        jRB_CitasCumplidas.setEnabled(false);
        jRB_cicasCanceladas.setEnabled(false);
        jComboBox1.setEnabled(false);
        jComboBox4.setEnabled(false);
        jSpinner3.setEnabled(false);
        jComboBox3.setEnabled(false);
        jButton3.setEnabled(false);
        jTable4.setEnabled(false);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(jRB_citasVencidas);
        grupo1.add(jRB_CitasCumplidas);
        grupo1.add(jRB_cicasCanceladas);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(jRB_buscarPorCentro);
        grupo2.add(jRB_buscarTodoslosCentros);

        ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(jRadioButton1);
        grupo3.add(jRadioButton3);

        ButtonGroup grupo4 = new ButtonGroup();
        grupo4.add(jRadioButton4);
        grupo4.add(jRadioButton5);

        ButtonGroup grupo5 = new ButtonGroup();
        grupo5.add(jRadioButton2);
        grupo5.add(jRadioButton6);

        jRB_CitasCumplidas.setSelected(true);
        jRB_buscarPorCentro.setSelected(true);

        for (Vacunatorio centros : vD.listarVacunatorio()) {
            jComboBox2.addItem(centros.getNombre());
            jComboBox6.addItem(centros.getNombre());
            jComboBox10.addItem(centros.getNombre());
            jComboBox3.addItem(centros.getNombre());
            jComboBox11.addItem(centros.getNombre());
            jComboBox12.addItem(centros.getNombre());

            if (centros.getNombre().equals("Gobierno")) {
                jComboBox8.addItem(centros.getNombre());
            }
            if (!centros.getNombre().equals("Gobierno")) {
                jComboBox13.addItem(centros.getNombre());
                jComboBox9.addItem(centros.getNombre());
                jComboBox1.addItem(centros.getNombre());
            }
        }

        String[] lista_viales = {"Pfizer", "Johnson_Johnson", "AstraZeneca", "Sinopharm y Sinovac", "Sputnik V"};
        DefaultComboBoxModel<String> modeloCB = new DefaultComboBoxModel<>(lista_viales);
        jComboBox4.setModel(modeloCB);
        jComboBox7.setModel(modeloCB);
        jComboBox5.setModel(modeloCB);
    }

    private void armarTabla(String codigo_estadoCita) {
        int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0;
        if (jRB_CitasCumplidas.isSelected()) {
            modelo_tabla1.setColumnCount(0);
            modelo_tabla1.addColumn("DNI");
            modelo_tabla1.addColumn("N° Dosis");
            modelo_tabla1.addColumn("Fecha");
            modelo_tabla1.addColumn("Vial");
            modelo_tabla1.addColumn("Numero Serie");
            if (jRB_buscarTodoslosCentros.isSelected()) {
                modelo_tabla1.addColumn("Centro");
            }
            modelo_tabla1.setRowCount(0);
        } else {
            modelo_tabla1.setColumnCount(0);
            modelo_tabla1.addColumn("DNI");
            modelo_tabla1.addColumn("N° Dosis");
            modelo_tabla1.addColumn("Fecha");
            if (jRB_buscarTodoslosCentros.isSelected()) {
                modelo_tabla1.addColumn("Centro");
            }
            modelo_tabla1.setRowCount(0);
        }
        jTable1.setModel(modelo_tabla1);

        modelo_tabla0.setColumnCount(0);
        modelo_tabla0.addColumn("Vacuna");
        modelo_tabla0.addColumn("Cantidad Aplicadas");
        modelo_tabla0.setRowCount(0);
        jTable0.setModel(modelo_tabla0);

        ArrayList<Turno> listaTurnos = tD.listar_Turnos(LocalDate.now(), vD.listarVacunatorioNombre(jComboBox1.getSelectedItem().toString()).get(0), codigo_estadoCita, null, 0);

        if (jRB_buscarPorCentro.isSelected()) {
            for (Turno turno : listaTurnos) {
                if (jRB_CitasCumplidas.isSelected()) {
                    modelo_tabla1.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha(), turno.getVial().getMarca(), turno.getVial().getNumeroSerie()});
                    switch (turno.getVial().getMarca()) {
                        case "Sputnik V":
                            Sputnik++;
                            break;
                        case "Pfizer":
                            Pfizer++;
                            break;
                        case "Sinopharm y Sinovac":
                            Sinopharm++;
                            break;
                        case "Johnson_Johnson":
                            Johnson++;
                            break;
                        case "AstraZeneca":
                            AstraZeneca++;
                            break;
                    }
                } else {
                    modelo_tabla1.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha()});
                }
            }
            if (jRB_CitasCumplidas.isSelected()) {
                modelo_tabla0.addRow(new Object[]{"Sputnik V", Sputnik});
                modelo_tabla0.addRow(new Object[]{"Pfizer", Pfizer});
                modelo_tabla0.addRow(new Object[]{"Sinopharm y Sinovac", Sinopharm});
                modelo_tabla0.addRow(new Object[]{"Johnson y Johnson", Johnson});
                modelo_tabla0.addRow(new Object[]{"AstraZeneca", AstraZeneca});
            }
        } else if (jRB_buscarTodoslosCentros.isSelected()) {
            for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
                for (Turno turno : tD.listar_Turnos(LocalDate.now(), vacunatorio, codigo_estadoCita, null, 0)) {
                    if (jRB_CitasCumplidas.isSelected()) {
                        modelo_tabla1.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha(), turno.getVial().getMarca(), turno.getVial().getNumeroSerie(), vacunatorio.getNombre()});
                        switch (turno.getVial().getMarca()) {
                            case "Sputnik V":
                                Sputnik++;
                                break;
                            case "Pfizer":
                                Pfizer++;
                                break;
                            case "Sinopharm y Sinovac":
                                Sinopharm++;
                                break;
                            case "Johnson_Johnson":
                                Johnson++;
                                break;
                            case "AstraZeneca":
                                AstraZeneca++;
                                break;
                        }
                    } else {
                        modelo_tabla1.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha(), vacunatorio.getNombre()});
                    }
                }
            }
            if (jRB_CitasCumplidas.isSelected()) {
                modelo_tabla0.addRow(new Object[]{"Sputnik V", Sputnik});
                modelo_tabla0.addRow(new Object[]{"Pfizer", Pfizer});
                modelo_tabla0.addRow(new Object[]{"Sinopharm y Sinovac", Sinopharm});
                modelo_tabla0.addRow(new Object[]{"Johnson y Johnson", Johnson});
                modelo_tabla0.addRow(new Object[]{"AstraZeneca", AstraZeneca});
            }
        }
    }

    public void armadoTabla_vacunasDía() {
        modelo_tabla2.setColumnCount(0);
        modelo_tabla2.addColumn("Nombre");
        modelo_tabla2.addColumn("Total");
        modelo_tabla2.addColumn("Sputnik V");
        modelo_tabla2.addColumn("Pfizer");
        modelo_tabla2.addColumn("Sinopharm");
        modelo_tabla2.addColumn("Johnson");
        modelo_tabla2.addColumn("AstraZeneca");

        jTable2.setModel(modelo_tabla2);
    }

    private void armadoTablasStocks() {
        String[] lista_viales = {"Sputnik V", "Pfizer", "Johnson_Johnson", "AstraZeneca", "Sinopharm y Sinovac"};
        modelo_tabla2.setColumnCount(0);
        modelo_tabla2.addColumn("Nombre");
        modelo_tabla2.addColumn("Total");
        modelo_tabla2.addColumn("Sputnik V");
        modelo_tabla2.addColumn("Pfizer");
        modelo_tabla2.addColumn("Sinopharm");
        modelo_tabla2.addColumn("Johnson");
        modelo_tabla2.addColumn("AstraZeneca");

        jTabla3.setModel(modelo_tabla2);

        modelo_tabla4.setColumnCount(0);
        modelo_tabla4.addColumn("Centro");
        for (String vial : lista_viales) {
            modelo_tabla4.addColumn(vial);
        }
        jTable4.setModel(modelo_tabla4);
    }

    public void listarDosis_x_Centro(LocalDate fecha) {
        modelo_tabla2.setRowCount(0);
        for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
            if (!vacunatorio.getNombre().equals("Gobierno")) {
                int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0, total = 0;
                for (Turno turno : tD.listar_Turnos(fecha, vacunatorio, "porDia", null, 0)) {
                    switch (turno.getVial().getMarca()) {
                        case "Sputnik V":
                            Sputnik++;
                            total++;
                            break;
                        case "Pfizer":
                            Pfizer++;
                            total++;
                            break;
                        case "Sinopharm y Sinovac":
                            Sinopharm++;
                            total++;
                            break;
                        case "Johnson_Johnson":
                            Johnson++;
                            total++;
                            break;
                        case "AstraZeneca":
                            AstraZeneca++;
                            total++;
                            break;
                    }
                }
                modelo_tabla2.addRow(new Object[]{vacunatorio.getNombre(), total, Sputnik, Pfizer, Johnson, AstraZeneca, Sinopharm});
            }
        }
    }

    private void calcularStocks() {
        modelo_tabla2.setRowCount(0);
        for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
            int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0, total = 0;
            for (Vial viales : sD.listarViales(0, vacunatorio.getIdVacunatorio())) {
                switch (viales.getMarca()) {
                    case "Sputnik V":
                        Sputnik++;
                        total++;
                        break;
                    case "Pfizer":
                        Pfizer++;
                        total++;
                        break;
                    case "Sinopharm y Sinovac":
                        Sinopharm++;
                        total++;
                        break;
                    case "Johnson_Johnson":
                        Johnson++;
                        total++;
                        break;
                    case "AstraZeneca":
                        AstraZeneca++;
                        total++;
                        break;
                }
            }
            modelo_tabla2.addRow(new Object[]{vacunatorio.getNombre(), total, Sputnik, Pfizer, Sinopharm, Johnson, AstraZeneca});
        }
    }

    private void adquirirViales() {
        int idVacunatorio = 0;
        if (!jRadioButton3.isSelected()) {
            if (jRadioButton1.isSelected()) {
                idVacunatorio = vD.listarVacunatorioNombre(jComboBox2.getSelectedItem().toString()).get(0).getIdVacunatorio();
                for (int i = 0; i < Integer.parseInt(jSpinner3.getValue().toString()); i++) {
                    sD.compraViales(idVacunatorio, jComboBox4.getSelectedItem().toString());
                }
            }
        } else if (jRadioButton3.isSelected()) {
            int renglones = modelo_tabla4.getRowCount();
            int columnas = modelo_tabla4.getColumnCount();

            for (int r = 0; r < renglones; r++) {
                for (int c = 1; c < columnas; c++) {
                    if (modelo_tabla4.getValueAt(r, c) != null) {
                        int valor = Integer.parseInt(modelo_tabla4.getValueAt(r, c).toString());
                        for (int i = 0; i < valor; i++) {
                            sD.compraViales(vD.listarVacunatorioNombre(modelo_tabla4.getValueAt(r, 0).toString()).get(0).getIdVacunatorio(), modelo_tabla4.getColumnName(c));
                        }
                    }
                }
            }
        }
        calcularStocks();
    }

    private void asignarViales(String centro_dador, String marca, String Centro_receptor, int cantidad) {
        int viales_asignables = 0;
        if (jRadioButton4.isSelected() || jRadioButton2.isSelected()) {
            for (Vial viales : sD.listarViales(0, vD.listarVacunatorioNombre(centro_dador).get(0).getIdVacunatorio())) {
                if (viales.getMarca().equalsIgnoreCase(marca)) {
                    viales_asignables++;
                }
            }
            if (viales_asignables < cantidad) {
                JOptionPane.showMessageDialog(null, "Viales insuficientes");
            } else if (cantidad < viales_asignables) {
                if ((viales_asignables - cantidad) < 10) {
                    JOptionPane.showMessageDialog(null, "Adquirir nuevos viales");
                }
                ArrayList<Vial> vial_reasignar = sD.listarViales(0, vD.listarVacunatorioNombre(centro_dador).get(0).getIdVacunatorio());
                int asignacionesRealizadas = 0;

                for (Vial vial : vial_reasignar) {
                    if (vial.getMarca().equals(marca)) {
                        sD.reasignarViales(vD.listarVacunatorioNombre(centro_dador).get(0), vD.listarVacunatorioNombre(Centro_receptor).get(0), vial);
                        asignacionesRealizadas++;

                        if (asignacionesRealizadas >= cantidad) {
                            break;
                        }
                    }
                }
            }
        }
        calcularStocks();
    }

    private void asignacionVialesMultiple() {
        int renglones = modelo_tabla5.getRowCount();
        int columnas = modelo_tabla5.getColumnCount();

        for (int r = 0; r < renglones; r++) {
            for (int c = 2; c < columnas; c++) {
                if (modelo_tabla5.getValueAt(r, c) != null) {
                    if (!modelo_tabla5.getValueAt(r, c).toString().trim().isEmpty()) {
                        int valor = Integer.parseInt(modelo_tabla5.getValueAt(r, c).toString());

                        ArrayList<Vial> vial_reasignar = sD.listarViales(0, vD.listarVacunatorioNombre(modelo_tabla5.getValueAt(r, 0).toString()).get(0).getIdVacunatorio());
                        int asignacionesRealizadas = 0;

                        for (Vial vial : vial_reasignar) {
                            if (vial.getMarca().equals(modelo_tabla5.getColumnName(c))) {
                                System.out.println(vial.getMarca());
                                System.out.println(modelo_tabla5.getColumnName(c));
                                sD.reasignarViales(vD.listarVacunatorioNombre(modelo_tabla5.getValueAt(r, 0).toString()).get(0),
                                        vD.listarVacunatorioNombre(modelo_tabla5.getValueAt(r, 1).toString()).get(0),
                                        vial);
                                asignacionesRealizadas++;

                                if (asignacionesRealizadas >= valor) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        calcularStocks();
    }

    private void asignacionMultipleTotal() {
        int renglones = modelo_tabla6.getRowCount();
        int columnas = modelo_tabla6.getColumnCount();

        for (int r = 0; r < renglones; r++) {
            for (int c = 2; c < columnas; c++) {
                if (modelo_tabla6.getValueAt(r, c) != null) {
                    if (!modelo_tabla6.getValueAt(r, c).toString().trim().isEmpty()) {
                        int valor = Integer.parseInt(modelo_tabla6.getValueAt(r, c).toString());
                        System.out.println(valor);

                        ArrayList<Vial> vial_reasignar = sD.listarViales(0, vD.listarVacunatorioNombre(modelo_tabla6.getValueAt(r, 0).toString()).get(0).getIdVacunatorio());
                        int asignacionesRealizadas = 0;

                        for (Vial vial : vial_reasignar) {
                            if (vial.getMarca().equals(modelo_tabla6.getColumnName(c))) {
                                sD.reasignarViales(vD.listarVacunatorioNombre(modelo_tabla6.getValueAt(r, 0).toString()).get(0),
                                        vD.listarVacunatorioNombre(modelo_tabla6.getValueAt(r, 1).toString()).get(0),
                                        vial);
                                asignacionesRealizadas++;

                                if (asignacionesRealizadas >= valor) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        calcularStocks();
    }

    private void habilitarCiudadanos(int valor) {
        ArrayList<Ciudadano> sinCuenta = new ArrayList<>();
        for (Ciudadano ciu : cD.buscarCiudadanos(0, "todos")) {
            boolean tieneUsuario = false;
            for (LogIN logIns : lD.listarUsuarios()) {
                if (ciu.getDNI() == logIns.getUsuario()) {
                    tieneUsuario = true;
                }
            }
            if (!tieneUsuario) {
                sinCuenta.add(ciu);
            }
        }
        int perro = 0;
        for (Ciudadano ciudadano : sinCuenta) {
            while (perro < valor) {
                lD.armarClavesRandom(ciudadano.getDNI());
                perro++;
            }
        }
    }

    public void armarListasPedidos(String estado) {
        ArrayList<Pedidos> pedidos = vD.listarPedidos(estado);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        DefaultListModel<String> listModel2 = new DefaultListModel<>();
        listModel.addElement("id.Pedido - id.Centro - Fecha");
        for (Pedidos pedido : pedidos) {
            listModel.addElement(pedido.toString());
        }
        jList1.setModel(listModel);

        jList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                listModel2.clear();
                if (!e.getValueIsAdjusting()) {
                    int indice = jList1.getSelectedIndex();
                    if (indice > 0) {
                        String selectedValue = jList1.getModel().getElementAt(indice);
                        String[] partesLista = selectedValue.split(" - ");
                        if (partesLista.length == 3) {
                            int idPedido = Integer.parseInt(partesLista[0]);
                            for (Pedidos pedido1 : pedidos) {
                                if (pedido1.getIdPedido() == idPedido) {
                                    pedido = pedido1;
                                    listModel2.addElement(pedido.getCentro().getNombre() + ": ");
                                    listModel2.addElement("Estado: " + pedido.getEstado());
                                    listModel2.addElement("AstraZeneca: " + Integer.toString(pedido.getAstra()));
                                    listModel2.addElement("Sputnik V: " + Integer.toString(pedido.getSpuk()));
                                    listModel2.addElement("Sinopharm: " + Integer.toString(pedido.getSyno()));
                                    listModel2.addElement("Johnson: " + Integer.toString(pedido.getJhon()));
                                    listModel2.addElement("Pfizer: " + Integer.toString(pedido.getPf()));
                                    jButton8.setEnabled(true);
                                    jList2.setModel(listModel2);
                                }
                            }
                        }
                    } else {
                jButton8.setEnabled(false);
                }
              }
            }
        });
    }

    private void darStocks(){
        int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0;
            for (Vial viales : sD.listarViales(0, 0)) {
                switch (viales.getMarca()) {
                    case "Sputnik V": Sputnik++;break;
                    case "Pfizer":Pfizer++; break;
                    case "Sinopharm y Sinovac":Sinopharm++;break;
                    case "Johnson_Johnson":Johnson++;break;
                    case "AstraZeneca": AstraZeneca++; break;
                }
            }
            String faltantes = "";
            int cont = 0;
        if (pedido.getAstra()> AstraZeneca){
            faltantes += "AstraZeneca ";cont++;
        } else if (pedido.getJhon() > Johnson){
             faltantes +=((cont>0)? ",":""); faltantes += "Johnson ";cont++;
        } else if (pedido.getPf() > Pfizer){
            faltantes +=((cont>0)? ",":""); faltantes += " Pfizer ";cont++;
        } else if (pedido.getSpuk() > Sputnik){
            faltantes +=((cont>0)? ",":""); faltantes += " Sputnik ";cont++;
        } else if (pedido.getSyno() > Sinopharm){
            faltantes +=((cont>0)? ",":""); faltantes += " Sinopharm ";cont++;
        } else if (cont > 0) {
           JOptionPane.showMessageDialog(null, "Faltante de stock de los viales " + faltantes);
        } else {    
            asignarViales_pedido();
        }     
        }
    
    public void asignarViales_pedido(){
        int AstraCont = 0, SputCont = 0, SinoCont = 0, JonhCont = 0, PfizCont = 0;   
       
        for (Vial viales : sD.listarViales(0, 0)){        
            switch (viales.getMarca()){
                case "AstraZeneca": 
                    if (AstraCont < pedido.getAstra()){
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        AstraCont++;
                    } break;
                case "Pfizer": 
                    if (PfizCont < pedido.getPf()){
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        PfizCont++;
                    } break;
                case "Sinopharm y Sinovac": 
                    if (SinoCont < pedido.getSyno()){
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        SinoCont++;
                    } break;
                case "Sputnik V": 
                    if (SputCont < pedido.getSpuk()){
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        SputCont++;
                    } break;
                case "Johnson_Johnson": 
                    if (JonhCont < pedido.getJhon()){
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        JonhCont++;
                } break;
            }
        }
            if (JonhCont == pedido.getJhon() 
                    && SputCont == pedido.getSpuk() 
                    && SinoCont == pedido.getSyno()
                    && PfizCont == pedido.getPf()
                    && AstraCont == pedido.getAstra()){
            JOptionPane.showMessageDialog(null, "Pedido Completo");
                sD.actualizarEstadoPedido(pedido);
            }
     }
 }
