package Vistas.Vistas_Ciudadano;

import Conexion.Certificado;
import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Entidades.Ciudadano;
import Entidades.Turno;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
        jTabbedPane1.setBorder(null);
        jTabbedPane1.setLocation(localizacion);
        jTabbedPane1.setSize(tamanio);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
       
        if (c1.getDosisAplicadas()== 0){
           jTabbedPane1.setEnabledAt(1,false);
           jTabbedPane1.setEnabledAt(2,false);
           jTabbedPane1.setEnabledAt(3,false);
        }
        if (c1.getDosisAplicadas()==1) {
            jTabbedPane1.setEnabledAt(2,false);
           jTabbedPane1.setEnabledAt(3,false);
        }
        if (c1.getDosisAplicadas()==2)  {
          jTabbedPane1.setEnabledAt(3,false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jText_Nombre_Apellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jText_DNI = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jText_DosisAplicadas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jText_Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jText_Celular = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jText_Celular1 = new javax.swing.JTextField();
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
        jButton1 = new javax.swing.JButton();
        jText_DosisPT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 20, 0));
        setPreferredSize(new java.awt.Dimension(550, 600));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 100, 1));
        jTabbedPane1.setForeground(new java.awt.Color(85, 106, 124));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Proxima Nova Alt Rg", 0, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre y Apellido");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 130, 28));
        jPanel1.add(jText_Nombre_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 313, 35));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("DNI");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 53, -1));
        jPanel1.add(jText_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 313, 35));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Fecha Nacimiento");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 143, 28));
        jPanel1.add(jText_DosisAplicadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 369, 353, 35));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Patologias ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 299, 104, 28));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dosis Aplicadas");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 369, 104, 28));
        jPanel1.add(jText_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 233, 353, 35));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Celular");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 194, 104, 28));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("E-mail");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 235, 104, 28));
        jPanel1.add(jText_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 192, 353, 35));

        jButton5.setText("Generar Certificado");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 422, 163, -1));

        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 274, 353, 89));
        jPanel1.add(jText_Celular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 313, 35));

        jTabbedPane1.addTab("  Datos Personales  ", jPanel1);

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
                .addContainerGap(51, Short.MAX_VALUE))
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
                .addContainerGap(43, Short.MAX_VALUE))
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  3° Dosis  ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Cancelar Cita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Asignar Horario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jText_DosisPT, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_CentroPT, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_FechaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jText_DosisPT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jText_FechaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jText_CentroPT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  Proximo Turno  ", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cancelarTurno();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (c1.getDosisAplicadas() != 0){
        try {
            cF.ArmarCertificado(c1, turno1, turno2, turno3);
        } catch (IOException ex) {
            Logger.getLogger(Cuenta_Ciudadano.class.getName()).log(Level.SEVERE, null, ex);
        }} else {
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
                            jText_FechaPT.setText("Fecha: " + turnos.getFecha().toLocalDate().toString() + " - Horario: " + turnos.getFecha().getHour() + "hs.");
                        }
                        jText_DosisPT.setText("Dosis a aplicar: " + Integer.toString(turnos.getCodigoRefuerzo()) + " dosis.");
                        jText_CentroPT.setText("Centro Vacunacion: " + turnos.getVacunatorio().getNombre() + " - " + turnos.getVacunatorio().getDireccion());
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
}
