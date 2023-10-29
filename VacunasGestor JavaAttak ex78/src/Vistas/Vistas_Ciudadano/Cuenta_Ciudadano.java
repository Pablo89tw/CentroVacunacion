package Vistas.Vistas_Ciudadano;

import Conexion.Certificado;
import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Entidades.Ciudadano;
import Entidades.Turno;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Cuenta_Ciudadano extends javax.swing.JInternalFrame {

    private Certificado cF = new Certificado();
    private TurnoData tD;
    private Ciudadano c1;
    private Turno turno_new;
    private ArrayList<Turno> arrayTurnos;
    private Turno turno1 = null;
    private Turno turno2 = null;
    private Turno turno3 = null;

    public Cuenta_Ciudadano(CiudadanoData cD, TurnoData tD, int dni_usuario, Point localizacion, Dimension tamanio) {
        this.c1 = cD.buscarCiudadanos(dni_usuario, "DNI").get(0);
        c1.setPatologias(cD.consultaPatologias(dni_usuario));
        this.arrayTurnos = tD.listar_Turnos(null, null, "DNI", null, dni_usuario);
        this.tD = tD;
        initComponents();
        armadoDosis();
        armadoTextos(dni_usuario);

        armadoVistas(localizacion, tamanio);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jText_Nombre_Apellido = new javax.swing.JTextField();
        jText_DNI = new javax.swing.JTextField();
        jText_DosisAplicadas = new javax.swing.JTextField();
        jText_Email = new javax.swing.JTextField();
        jText_Celular = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jText_Celular1 = new javax.swing.JTextField();
        FONDO = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Marca = new javax.swing.JLabel();
        jText_FechaD1 = new javax.swing.JTextField();
        Marca2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jText_MarcaD1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jText_NumeroD1 = new javax.swing.JTextField();
        jText_AntigenoD1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Marca1 = new javax.swing.JLabel();
        jText_FechaVencimientoD1 = new javax.swing.JTextField();
        Marca3 = new javax.swing.JLabel();
        jText_CentroD1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Marca4 = new javax.swing.JLabel();
        jText_FechaD2 = new javax.swing.JTextField();
        Marca5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jText_MarcaD2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jText_NumeroD2 = new javax.swing.JTextField();
        jText_AntigenoD2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Marca6 = new javax.swing.JLabel();
        jText_FechaVencimientoD2 = new javax.swing.JTextField();
        Marca7 = new javax.swing.JLabel();
        jText_CentroD2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Marca8 = new javax.swing.JLabel();
        jText_FechaD3 = new javax.swing.JTextField();
        Marca9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jText_MarcaD3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jText_NumeroD3 = new javax.swing.JTextField();
        jText_AntigenoD3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Marca10 = new javax.swing.JLabel();
        jText_FechaVencimientoD3 = new javax.swing.JTextField();
        Marca11 = new javax.swing.JLabel();
        jText_CentroD3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jText_FechaPT = new javax.swing.JTextField();
        jText_CentroPT = new javax.swing.JTextField();
        jText_Centro_DirPT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jText_DosisPT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jText_HorarioPT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(550, 600));
        setMinimumSize(new java.awt.Dimension(550, 600));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(550, 600));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(85, 106, 124));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Proxima Nova Alt Rg", 0, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(20, 30, 40, 50), null));
        jPanel1.setMaximumSize(new java.awt.Dimension(550, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 440));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 440));
        jPanel1.setLayout(null);

        jText_Nombre_Apellido.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_Nombre_Apellido.setForeground(new java.awt.Color(85, 106, 124));
        jText_Nombre_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Nombre_Apellido.setBorder(null);
        jText_Nombre_Apellido.setOpaque(false);
        jPanel1.add(jText_Nombre_Apellido);
        jText_Nombre_Apellido.setBounds(50, 50, 270, 30);

        jText_DNI.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_DNI.setForeground(new java.awt.Color(85, 106, 124));
        jText_DNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_DNI.setBorder(null);
        jText_DNI.setOpaque(false);
        jPanel1.add(jText_DNI);
        jText_DNI.setBounds(340, 50, 170, 30);

        jText_DosisAplicadas.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_DosisAplicadas.setForeground(new java.awt.Color(85, 106, 124));
        jText_DosisAplicadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_DosisAplicadas.setBorder(null);
        jText_DosisAplicadas.setOpaque(false);
        jPanel1.add(jText_DosisAplicadas);
        jText_DosisAplicadas.setBounds(50, 315, 210, 30);

        jText_Email.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_Email.setForeground(new java.awt.Color(85, 106, 124));
        jText_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Email.setBorder(null);
        jText_Email.setOpaque(false);
        jPanel1.add(jText_Email);
        jText_Email.setBounds(280, 140, 230, 30);

        jText_Celular.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_Celular.setForeground(new java.awt.Color(85, 106, 124));
        jText_Celular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Celular.setBorder(null);
        jText_Celular.setOpaque(false);
        jPanel1.add(jText_Celular);
        jText_Celular.setBounds(50, 225, 210, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/GENERAR CERTIFICADO_01-05.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setMaximumSize(new java.awt.Dimension(158, 34));
        jButton5.setMinimumSize(new java.awt.Dimension(158, 34));
        jButton5.setPreferredSize(new java.awt.Dimension(158, 34));
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/GENERAR CERTIFICADO_02-05.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(330, 380, 160, 34);

        jList1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jList1.setForeground(new java.awt.Color(85, 106, 124));
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(300, 230, 200, 110);

        jText_Celular1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_Celular1.setForeground(new java.awt.Color(85, 106, 124));
        jText_Celular1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Celular1.setBorder(null);
        jText_Celular1.setOpaque(false);
        jPanel1.add(jText_Celular1);
        jText_Celular1.setBounds(50, 140, 210, 30);

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CIUDADANO_DATOS.png"))); // NOI18N
        FONDO.setToolTipText("");
        FONDO.setMaximumSize(new java.awt.Dimension(550, 440));
        FONDO.setMinimumSize(new java.awt.Dimension(550, 440));
        FONDO.setName(""); // NOI18N
        FONDO.setPreferredSize(new java.awt.Dimension(550, 440));
        jPanel1.add(FONDO);
        FONDO.setBounds(0, 0, 550, 440);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DATOS PERSONALES 02.png")), jPanel1); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Marca.setText("Antigeno");

        Marca2.setText("Fecha Colocacion");

        jLabel11.setText("Marca:");

        jLabel12.setText("Numero Serie");

        jLabel1.setText("Datos 1° dosis:");

        Marca1.setText("Vacunatorio");

        Marca3.setText("Fecha Vencimento");

        jLabel10.setText("-1° dosis sin aplicar-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_AntigenoD1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_NumeroD1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_MarcaD1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Marca2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_FechaD1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Marca1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jText_CentroD1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Marca3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_FechaVencimientoD1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_MarcaD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_NumeroD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_AntigenoD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Marca2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_FechaD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Marca1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_CentroD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Marca3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_FechaVencimientoD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  1° Dosis  ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Marca4.setText("Antigeno");

        Marca5.setText("Fecha Colocacion");

        jLabel13.setText("Marca:");

        jLabel14.setText("Numero Serie");

        jLabel2.setText("Datos 2° dosis aplicada:");

        Marca6.setText("Vacunatorio");

        Marca7.setText("Fecha Vencimento");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("-2° dosis sin aplicar-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Marca4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jText_AntigenoD2)
                                    .addComponent(jText_NumeroD2)
                                    .addComponent(jText_MarcaD2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Marca6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jText_CentroD2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Marca7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_FechaVencimientoD2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Marca5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_FechaD2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_MarcaD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_NumeroD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_AntigenoD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_FechaD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_CentroD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_FechaVencimientoD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  2° Dosis  ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Marca8.setText("Antigeno");

        Marca9.setText("Fecha Colocacion");

        jLabel15.setText("Marca:");

        jLabel16.setText("Numero Serie");

        jLabel3.setText("Datos 3° dosis aplicada:");

        Marca10.setText("Vacunatorio");

        Marca11.setText("Fecha Vencimento");

        jLabel18.setText("- 3° dosis sin aplicar -");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Marca9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_FechaD3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Marca10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jText_CentroD3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Marca11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_FechaVencimientoD3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Marca8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jText_AntigenoD3)
                                    .addComponent(jText_NumeroD3)
                                    .addComponent(jText_MarcaD3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel18))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_MarcaD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_NumeroD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_AntigenoD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_FechaD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_CentroD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_FechaVencimientoD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  3° Dosis  ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jText_FechaPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 18)); // NOI18N
        jText_FechaPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_FechaPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_FechaPT.setBorder(null);
        jText_FechaPT.setOpaque(false);
        jPanel5.add(jText_FechaPT);
        jText_FechaPT.setBounds(130, 150, 298, 40);

        jText_CentroPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 17)); // NOI18N
        jText_CentroPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_CentroPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_CentroPT.setBorder(null);
        jText_CentroPT.setOpaque(false);
        jPanel5.add(jText_CentroPT);
        jText_CentroPT.setBounds(120, 310, 310, 30);

        jText_Centro_DirPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 17)); // NOI18N
        jText_Centro_DirPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_Centro_DirPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Centro_DirPT.setBorder(null);
        jText_Centro_DirPT.setOpaque(false);
        jPanel5.add(jText_Centro_DirPT);
        jText_Centro_DirPT.setBounds(120, 340, 310, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CANCELAR TURNO 01.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(118, 34));
        jButton1.setMinimumSize(new java.awt.Dimension(118, 34));
        jButton1.setPreferredSize(new java.awt.Dimension(118, 34));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CANCELAR TURNO 02.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(320, 380, 118, 34);

        jText_DosisPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 18)); // NOI18N
        jText_DosisPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_DosisPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_DosisPT.setBorder(null);
        jText_DosisPT.setOpaque(false);
        jPanel5.add(jText_DosisPT);
        jText_DosisPT.setBounds(130, 70, 298, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/ASIGNAR HORARIO 01.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/ASIGNAR HORARIO 02.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(110, 380, 126, 34);

        jText_HorarioPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 18)); // NOI18N
        jText_HorarioPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_HorarioPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_HorarioPT.setBorder(null);
        jText_HorarioPT.setOpaque(false);
        jPanel5.add(jText_HorarioPT);
        jText_HorarioPT.setBounds(130, 230, 300, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/PROXIMO TURNO-06.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(550, 440));
        jLabel5.setMinimumSize(new java.awt.Dimension(550, 440));
        jLabel5.setName(""); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(550, 440));
        jPanel5.add(jLabel5);
        jLabel5.setBounds(0, 0, 550, 440);

        jTabbedPane1.addTab("  Proximo Turno  ", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, -1, 490));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CIUDADANO_FONDO.png"))); // NOI18N
        jLabel4.setText("12");
        jLabel4.setMaximumSize(new java.awt.Dimension(550, 600));
        jLabel4.setMinimumSize(new java.awt.Dimension(550, 600));
        jLabel4.setName(""); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(550, 600));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cancelarTurno();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (c1.getDosisAplicadas() != 0) {
            try {
                cF.ArmarCertificado(c1, turno1, turno2, turno3);
            } catch (IOException ex) {
                Logger.getLogger(Cuenta_Ciudadano.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No posee dosis aplicadas aún. Vacunate Bagre!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (Turno turno : arrayTurnos) {
            if (turno.getFecha().getHour() == 00 && turno.isEstado().equals("Pendiente")) {
                asignarHoraTurno(turno);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Marca1;
    private javax.swing.JLabel Marca10;
    private javax.swing.JLabel Marca11;
    private javax.swing.JLabel Marca2;
    private javax.swing.JLabel Marca3;
    private javax.swing.JLabel Marca4;
    private javax.swing.JLabel Marca5;
    private javax.swing.JLabel Marca6;
    private javax.swing.JLabel Marca7;
    private javax.swing.JLabel Marca8;
    private javax.swing.JLabel Marca9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jText_AntigenoD1;
    private javax.swing.JTextField jText_AntigenoD2;
    private javax.swing.JTextField jText_AntigenoD3;
    private javax.swing.JTextField jText_Celular;
    private javax.swing.JTextField jText_Celular1;
    private javax.swing.JTextField jText_CentroD1;
    private javax.swing.JTextField jText_CentroD2;
    private javax.swing.JTextField jText_CentroD3;
    private javax.swing.JTextField jText_CentroPT;
    private javax.swing.JTextField jText_Centro_DirPT;
    private javax.swing.JTextField jText_DNI;
    private javax.swing.JTextField jText_DosisAplicadas;
    private javax.swing.JTextField jText_DosisPT;
    private javax.swing.JTextField jText_Email;
    private javax.swing.JTextField jText_FechaD1;
    private javax.swing.JTextField jText_FechaD2;
    private javax.swing.JTextField jText_FechaD3;
    private javax.swing.JTextField jText_FechaPT;
    private javax.swing.JTextField jText_FechaVencimientoD1;
    private javax.swing.JTextField jText_FechaVencimientoD2;
    private javax.swing.JTextField jText_FechaVencimientoD3;
    private javax.swing.JTextField jText_HorarioPT;
    private javax.swing.JTextField jText_MarcaD1;
    private javax.swing.JTextField jText_MarcaD2;
    private javax.swing.JTextField jText_MarcaD3;
    private javax.swing.JTextField jText_Nombre_Apellido;
    private javax.swing.JTextField jText_NumeroD1;
    private javax.swing.JTextField jText_NumeroD2;
    private javax.swing.JTextField jText_NumeroD3;
    // End of variables declaration//GEN-END:variables

    private void armadoTextos(int dni_usuario) {
        jButton2.setVisible(false);
        jLabel10.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);

        jText_Nombre_Apellido.setText(c1.getApellido() + " " + c1.getNombre());
        jText_DosisAplicadas.setText(Integer.toString(c1.getDosisAplicadas()));
        jText_DNI.setText(Integer.toString(c1.getDNI()));
        jText_Celular.setText(Integer.toString(c1.getCelular()));
        jText_Email.setText(c1.getEmail());

        DefaultListModel<String> listaPatologias = new DefaultListModel<>();

        for (String patologias : c1.getPatologias()) {
            listaPatologias.addElement(patologias);
        }
        if (listaPatologias.isEmpty()) {
            listaPatologias.addElement("No hay patologias declaradas");
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                for (Turno turno : arrayTurnos) {
                    if (turno.getFecha().getHour() == 00 && turno.isEstado().equals("Pendiente")) {
                        asignarHoraTurno(turno);
                    }
                }
                for (Turno turnos : tD.listar_Turnos(null, null, "DNI", null, dni_usuario)) {
                    if (turnos.isEstado().equals("Pendiente")) {
                        if (turnos.getFecha().getHour() == 0) {
                            jText_FechaPT.setText("Asignar horario.");
                            jButton2.setVisible(true);
                        } else {
                            jText_FechaPT.setText(turnos.getFecha().toLocalDate().toString());
                            jText_HorarioPT.setText(turnos.getFecha().getHour() + "hs.");
                        }
                        jText_DosisPT.setText(Integer.toString(turnos.getCodigoRefuerzo()) + " dosis");
                        jText_CentroPT.setText(turnos.getVacunatorio().getNombre());
                        jText_Centro_DirPT.setText(turnos.getVacunatorio().getDireccion());
                    }
                }
            }
        });
    }

    private void armadoDosis() {
        jButton5.setEnabled(false);
        for (Turno turno : arrayTurnos) {
            if (turno.getCodigoRefuerzo() == 1 && turno.isEstado().equals("completo")) {
                turno1 = turno;
            } else if (turno.getCodigoRefuerzo() == 2 && turno.isEstado().equals("completo")) {
                turno2 = turno;
            } else if (turno.getCodigoRefuerzo() == 3 && turno.isEstado().equals("completo")) {
                turno3 = turno;
            }
        }

        if (turno1 != null) {
            if (turno1.getCodigoRefuerzo() == 1) {
                jText_CentroD1.setText(turno1.getVacunatorio().getNombre());
                if (turno1.getVial() != null && turno1.isEstado().equals("completo")) {
                    jText_FechaD1.setText((turno1.getVial().getFechaColocacion()).toString());
                    jText_FechaVencimientoD1.setText(turno1.getVial().getFechaVencimiento().toString());
                    jText_MarcaD1.setText(turno1.getVial().getMarca());
                    jText_AntigenoD1.setText(turno1.getVial().getAntigeno());
                    jText_NumeroD1.setText(Integer.toString(turno1.getVial().getNumeroSerie()));
                    jButton5.setEnabled(true);
                } else if (turno1.getVial() == null || turno1.isEstado().equals("Pendiente")) {
                    jLabel10.setVisible(true);
                    jLabel19.setText(turno1.getFecha().toString());
                    jText_FechaD1.setText("Sin Datos");
                    jText_FechaVencimientoD1.setText("Sin Datos");
                    jText_MarcaD1.setText("Sin Datos");
                    jText_AntigenoD1.setText("Sin Datos");
                    jText_NumeroD1.setText("Sin Datos");
                    jText_CentroD1.setText("Sin Datos");
                }
            }
        }
        if (turno2 != null) {
            if (turno2.getCodigoRefuerzo() == 2) {
                jText_CentroD2.setText(turno2.getVacunatorio().getNombre());
                if (turno2.getVial() != null && turno2.isEstado().equals("completo")) {
                    jText_MarcaD2.setText(turno2.getVial().getMarca());
                    jText_NumeroD2.setText(Integer.toString(turno2.getVial().getNumeroSerie()));
                    jText_AntigenoD2.setText(turno2.getVial().getAntigeno());
                    jText_FechaD2.setText((turno2.getVial().getFechaColocacion()).toString());
                    jText_FechaVencimientoD2.setText(turno2.getVial().getFechaVencimiento().toString());
                } else if (turno2.getVial() == null || turno2.isEstado().equals("Pendiente")) {
                    jText_MarcaD2.setText("Sin Datos");
                    jText_NumeroD2.setText("Sin Datos");
                    jText_AntigenoD2.setText("Sin Datos");
                    jText_FechaD2.setText("Sin Datos");
                    jText_FechaVencimientoD2.setText("Sin Datos");
                    jText_CentroD2.setText("Sin Datos");
                    jLabel17.setVisible(true);
                }
            }
        }
        if (turno3 != null) {
            if (turno3.getCodigoRefuerzo() == 3) {
                jText_CentroD3.setText(turno3.getVacunatorio().getNombre());
                if (turno3.getVial() != null && turno3.isEstado().equals("completo")) {
                    jText_MarcaD3.setText(turno3.getVial().getMarca());
                    jText_NumeroD3.setText(Integer.toString(turno3.getVial().getNumeroSerie()));
                    jText_AntigenoD3.setText(turno3.getVial().getAntigeno());
                    jText_FechaD3.setText((turno3.getVial().getFechaColocacion()).toString());
                    jText_FechaVencimientoD3.setText(turno3.getVial().getFechaVencimiento().toString());
                } else if (turno3.getVial() == null && turno3.isEstado().equals("Pendiente")) {
                    jText_MarcaD3.setText("Sin Datos");
                    jText_NumeroD3.setText("Sin Datos");
                    jText_AntigenoD3.setText("Sin Datos");
                    jText_FechaD3.setText("Sin Datos");
                    jText_FechaVencimientoD3.setText("Sin Datos");
                    jText_CentroD3.setText("Sin Datos");
                    jLabel18.setVisible(true);
                }
            }
        }
    }

    private void cancelarTurno() {
        for (Turno turnos : arrayTurnos) {
            if (turnos.isEstado().equalsIgnoreCase("Pendiente")) {
                tD.cancelarTurno(turnos.getIdTurno());
            }
        }
    }

    private void asignarHoraTurno(Turno turno) {
        this.turno_new = turno;
        ArrayList<String> horarios_libres = tD.armarArrayHorariosLibres(turno.getFecha().toLocalDate(), turno.getVacunatorio());
        DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>(horarios_libres.toArray(new String[0]));
        JComboBox<String> comboBox = new JComboBox<>(cbModel);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JLabel label = new JLabel("Su turno del día " + turno.getFecha().toLocalDate() + " no cuenta con un horario asignado.");
        JPanel comboBoxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        comboBoxPanel.add(new JLabel("Asignar horario: "));
        comboBoxPanel.add(comboBox);

        panel.add(label);
        panel.add(comboBoxPanel);

        int resultado = JOptionPane.showConfirmDialog(null, panel, "Aginacion de horario para la colocacion de la " + turno.getCodigoRefuerzo() + " dosis.", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            tomarHorario(comboBox.getSelectedItem().toString());
            jButton2.setVisible(false);
            jText_FechaPT.setText("Fecha: " + turno_new.getFecha().toLocalDate().toString() + " - Horario: " + turno_new.getFecha().getHour() + "hs.");

        }
    }

    private void tomarHorario(String horario) {
        LocalDateTime fecha_turno = tD.colocarHora_aFecha(turno_new.getFecha().toLocalDate(), horario);
        turno_new.setFecha(fecha_turno);
        tD.actualizarTurnero_Hora(turno_new);
        tD.actualizarHora_Turno(turno_new);
    }

    private void armadoVistas(Point localizacion, Dimension tamanio) {
        jTabbedPane1.setBorder(null);
        jTabbedPane1.setLocation(localizacion);
        jTabbedPane1.setSize(tamanio);

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        // Define los colores personalizados
        Color selectedTabColor = new Color(255, 220, 0); // Color de fondo de la solapa seleccionada
        Color unselectedTabColor = new Color(85, 106, 124); // Color de fondo de las solapas no seleccionadas

        // Personaliza el fondo de las pestañas
        jTabbedPane1.setUI(new BasicTabbedPaneUI() {
            @Override
            protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
                Graphics2D g2 = (Graphics2D) g;

                if (isSelected) {
                    g2.setColor(selectedTabColor);
                    jTabbedPane1.setForeground(new Color(85, 106, 124));

                } else {
                    g2.setColor(unselectedTabColor);
                    jTabbedPane1.setForeground(new Color(255, 255, 255));
                }
                g2.fillRect(x, y, w, h);
            }
        });

        JLabel p0 = new JLabel();
        JLabel p1 = new JLabel();
        JLabel p2 = new JLabel();
        JLabel p3 = new JLabel();
        JLabel p4 = new JLabel();

        jTabbedPane1.setTabComponentAt(0, p0);
        jTabbedPane1.getTabComponentAt(0).setPreferredSize(new Dimension(110, 40));
        p0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DATOS PERSONALES 02.png")));

        jTabbedPane1.setTabComponentAt(1, p1);
        jTabbedPane1.getTabComponentAt(1).setPreferredSize(new Dimension(73, 40));
        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/1ra DOSIS 01.png")));

        jTabbedPane1.setTabComponentAt(2, p2);
        jTabbedPane1.getTabComponentAt(2).setPreferredSize(new Dimension(73, 40));
        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/2da DOSIS 01.png")));

        jTabbedPane1.setTabComponentAt(3, p3);
        jTabbedPane1.getTabComponentAt(3).setPreferredSize(new Dimension(73, 40));
        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/3ra DOSIS 01.png")));

        jTabbedPane1.setTabComponentAt(4, p4);
        jTabbedPane1.getTabComponentAt(4).setPreferredSize(new Dimension(110, 40));
        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/PROX TURNO 01.png")));

        jTabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedTabIndex = jTabbedPane1.getSelectedIndex();

                if (selectedTabIndex == 0) {
                    p0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DATOS PERSONALES 02.png")));
                } else {
                    p0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DATOS PERSONALES 01.png")));
                }

                if (selectedTabIndex == 1) {
                    p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/1ra DOSIS 02.png")));
                } else {
                    p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/1ra DOSIS 01.png")));
                }

                if (selectedTabIndex == 2) {
                    p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/2da DOSIS 02.png")));
                } else {
                    p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/2da DOSIS 01.png")));
                }

                if (selectedTabIndex == 3) {
                    p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/3ra DOSIS 02.png")));
                } else {
                    p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/3ra DOSIS 01.png")));
                }

                if (selectedTabIndex == 4) {
                    p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/PROX TURNO 02.png")));
                } else {
                    p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/PROX TURNO 01.png")));
                }

            }
        });

        if (c1.getDosisAplicadas() == 0) {
            jTabbedPane1.setEnabledAt(1, false);
            
            jTabbedPane1.setEnabledAt(2, false);
            
            jTabbedPane1.setEnabledAt(3, false);
            

        } else if (c1.getDosisAplicadas() == 1) {
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(1, true);

        } else if (c1.getDosisAplicadas() == 2) {
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
        }
    }

}
