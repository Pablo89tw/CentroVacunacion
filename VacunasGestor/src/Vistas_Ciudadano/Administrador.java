package Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Conexion.VialData;
import Entidades.Ciudadano;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Administrador extends javax.swing.JInternalFrame {

    private CiudadanoData cD;
    private TurnoData tD;
    private Ciudadano c1;
    private Turno turno1; Turno turno_nuevo;
    private ArrayList<Turno> listaTurnos;
    private Vial vial2;
    private Vacunatorio vac;
    DefaultTableModel modelo_tabla2 = new DefaultTableModel();
    VialData sD = new VialData();
    
    
    public Administrador(CiudadanoData cD, TurnoData tD, Vacunatorio vac) {
        this.cD = cD;
        this.tD = tD;
        this.vac = vac;
        initComponents();
        armarComponentesVisuales();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        Marca1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jText_DNI = new javax.swing.JTextField();
        jText_Apellido = new javax.swing.JTextField();
        jText_Ocupacion = new javax.swing.JTextField();
        jText_Dosis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_Nombre = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_patologias = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jText_centroTur = new javax.swing.JTextField();
        jText_fechaTur = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        jButton_ModificarDatos = new javax.swing.JButton();
        jCheckBox_apellido = new javax.swing.JCheckBox();
        jCheckBox_nombre = new javax.swing.JCheckBox();
        jCheckBox_dosis = new javax.swing.JCheckBox();
        jCheckBox_ocupacion = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jText_Celular = new javax.swing.JTextField();
        jCheckBox_celular = new javax.swing.JCheckBox();
        jText_email = new javax.swing.JTextField();
        jCheckBox_mail = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jCheckBox_patologias = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jText_estadoTur = new javax.swing.JTextField();
        jButton_nuevoTur_cancelado = new javax.swing.JButton();
        Edad1 = new javax.swing.JLabel();
        jCheckBox_fechaNac = new javax.swing.JCheckBox();
        jDC_fechaNac = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jText_MarcaVial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jText_numeroVial = new javax.swing.JTextField();
        jText_antigenoVial = new javax.swing.JTextField();
        Marca = new javax.swing.JLabel();
        jText_fechaVencVial = new javax.swing.JTextField();
        Marca3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Marca4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDC_proximoTur = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jLabel13.setText("Numero Serie");

        jTextField7.setText("jTextField4");

        jTextField9.setText("jTextField4");

        Marca1.setText("Marca");

        jLabel1.setText("DNI:");

        jText_DNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_DNIFocusLost(evt);
            }
        });
        jText_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_DNIActionPerformed(evt);
            }
        });

        jText_Dosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_DosisActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido");

        Nombre.setText("Nombre");

        jLabel3.setText("Ocupacion");

        Edad.setText("Dosis Aplicadas");

        jLabel4.setText("Patologias");

        jList_patologias.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jList_patologiasComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jList_patologias);

        jLabel5.setText("Control Datos Personales:");

        jText_centroTur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_centroTurFocusLost(evt);
            }
        });
        jText_centroTur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_centroTurActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha");

        jLabel6.setText("Lugar");

        jLabel8.setText("Control Datos Turno:");

        Continuar.setText("Continuar");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        jButton_ModificarDatos.setText("Modificar Datos");
        jButton_ModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarDatosActionPerformed(evt);
            }
        });

        jCheckBox_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_apellidoActionPerformed(evt);
            }
        });

        jCheckBox_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_nombreActionPerformed(evt);
            }
        });

        jCheckBox_dosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_dosisActionPerformed(evt);
            }
        });

        jCheckBox_ocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ocupacionActionPerformed(evt);
            }
        });

        jLabel9.setText("Celular");

        jCheckBox_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_celularActionPerformed(evt);
            }
        });

        jCheckBox_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_mailActionPerformed(evt);
            }
        });

        jLabel10.setText("E-mail");

        jButton4.setText("Actualizar Datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox_patologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_patologiasActionPerformed(evt);
            }
        });

        jLabel14.setText("Estado");

        jButton_nuevoTur_cancelado.setText("Nuevo Turno");
        jButton_nuevoTur_cancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoTur_canceladoActionPerformed(evt);
            }
        });

        Edad1.setText("Fecha Nac.");

        jCheckBox_fechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_fechaNacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(21, 21, 21))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jText_Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_ocupacion)
                                    .addComponent(jCheckBox_patologias)
                                    .addComponent(jCheckBox_mail)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jText_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox_apellido)
                                        .addGap(23, 23, 23)
                                        .addComponent(Nombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jText_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Edad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jText_Dosis, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_dosis)
                                    .addComponent(jCheckBox_nombre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jText_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jCheckBox_celular)
                                .addGap(18, 18, 18)
                                .addComponent(Edad1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDC_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox_fechaNac)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_centroTur, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_fechaTur, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jText_estadoTur, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_nuevoTur_cancelado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jButton_ModificarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Continuar)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edad1)
                            .addComponent(jCheckBox_fechaNac))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jText_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Edad)
                                    .addComponent(jText_Dosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jText_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jCheckBox_apellido))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox_nombre)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Nombre)
                                                .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(3, 3, 3))))
                            .addComponent(jCheckBox_dosis))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jText_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCheckBox_celular)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jDC_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_ocupacion)
                    .addComponent(jText_Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jCheckBox_mail)
                    .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_patologias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_estadoTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jButton_nuevoTur_cancelado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jText_centroTur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jText_fechaTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Continuar)
                    .addComponent(jButton_ModificarDatos)
                    .addComponent(jButton4))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Control Datos", jPanel1);

        jButton3.setText("Confirmar Turno");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Marca:");

        jLabel12.setText("Numero Serie");

        Marca.setText("Antigeno");

        Marca3.setText("Fecha Vencimento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_antigenoVial, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_numeroVial, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_MarcaVial, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Marca3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_fechaVencVial, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_MarcaVial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_numeroVial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_antigenoVial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_fechaVencVial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marca3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Confirmacion Turno", jPanel2);

        Marca4.setText("Nueva Fecha");

        jButton2.setText("Programar Nuevo Turno");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Marca4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jDC_proximoTur, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Marca4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDC_proximoTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton2)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Proximo Turno", jPanel3);

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

        jButton6.setText("Pedir Stock");

        jButton7.setText("Reprogramar Turnos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(391, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Generales", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_centroTurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_centroTurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_centroTurActionPerformed

    private void jText_centroTurFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_centroTurFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_centroTurFocusLost

    private void jText_DosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_DosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_DosisActionPerformed

    private void jText_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_DNIActionPerformed

    private void jText_DNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_DNIFocusLost
        if (!jText_DNI.getText().isEmpty()) {
            buscarTurnosPersona();
        }
    }//GEN-LAST:event_jText_DNIFocusLost

    private void jButton_ModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarDatosActionPerformed
        modificarDatosCiudadano();
    }//GEN-LAST:event_jButton_ModificarDatosActionPerformed

    private void jCheckBox_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_apellidoActionPerformed
        if (jCheckBox_apellido.isSelected()) {
            jText_Apellido.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_apellido.isSelected()) {
            jText_Apellido.setEditable(false);
            jText_Apellido.setText(c1.getApellido());
            if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_apellidoActionPerformed

    private void jCheckBox_dosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_dosisActionPerformed
        if (jCheckBox_dosis.isSelected()) {
            jText_Dosis.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_dosis.isSelected()) {
            jText_Dosis.setEditable(false);
            jText_Dosis.setText(Integer.toString(c1.getDosisAplicadas()));
             if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_dosisActionPerformed

    private void jCheckBox_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_nombreActionPerformed
        if (jCheckBox_nombre.isSelected()) {
            jText_Nombre.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_nombre.isSelected()) {
            jText_Nombre.setEditable(false);
            jText_Nombre.setText(c1.getNombre());
             if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_nombreActionPerformed

    private void jCheckBox_ocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ocupacionActionPerformed
        if (jCheckBox_ocupacion.isSelected()) {
            jText_Ocupacion.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_ocupacion.isSelected()) {
            jText_Ocupacion.setEditable(false);
            jText_Ocupacion.setText(c1.getAmbitoTrabajo());
             if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_ocupacionActionPerformed

    private void jCheckBox_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_celularActionPerformed
        if (jCheckBox_celular.isSelected()) {
            jText_Celular.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_celular.isSelected()) {
            jText_Celular.setEditable(false);
            jText_Celular.setText(c1.getAmbitoTrabajo());
             if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_celularActionPerformed

    private void jCheckBox_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_mailActionPerformed
        if (jCheckBox_mail.isSelected()) {
            jText_email.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_mail.isSelected()) {
            jText_email.setEditable(false);
            jText_email.setText(c1.getAmbitoTrabajo());
             if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_mailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nuevoTurno();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        actualizarDatos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox_patologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_patologiasActionPerformed
         if (jCheckBox_patologias.isSelected()) {
             Patologias_ADM pAD = new Patologias_ADM(c1.getDNI(),cD);
             pAD.setVisible(true);
             jPanel1.add(pAD);
             pAD.moveToFront();     
        }
    }//GEN-LAST:event_jCheckBox_patologiasActionPerformed

    private void jList_patologiasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jList_patologiasComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jList_patologiasComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            tomarNuevoTurno(jDC_proximoTur.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
         if (turno1.isEstado().equalsIgnoreCase("Cancelado")){
            JOptionPane.showMessageDialog(null, "Turno Cancelado");
         } else if (turno1.isEstado().equalsIgnoreCase("Pendiente")){
            this.vial2 = tD.buscar_VialParaAsignar(c1).get(0);
            completarDatosFinales(vial2);
            tD.actualizar_VialFecha_TurnoData(vial2, turno1, c1);
         }
    }//GEN-LAST:event_ContinuarActionPerformed

    private void jButton_nuevoTur_canceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoTur_canceladoActionPerformed
        nuevoTurno_turno1Cancelado();
    }//GEN-LAST:event_jButton_nuevoTur_canceladoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jCheckBox_fechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_fechaNacActionPerformed
         if (jCheckBox_patologias.isSelected()) {
             jDC_fechaNac.setEnabled(true);
            } else if (!jCheckBox_patologias.isSelected()){
             jDC_fechaNac.setEnabled(false);
            jDC_fechaNac.setDate(Date.valueOf(c1.getFechaNacimiento()));
            }
    }//GEN-LAST:event_jCheckBox_fechaNacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Edad1;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Marca1;
    private javax.swing.JLabel Marca3;
    private javax.swing.JLabel Marca4;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton_ModificarDatos;
    private javax.swing.JButton jButton_nuevoTur_cancelado;
    private javax.swing.JCheckBox jCheckBox_apellido;
    private javax.swing.JCheckBox jCheckBox_celular;
    private javax.swing.JCheckBox jCheckBox_dosis;
    private javax.swing.JCheckBox jCheckBox_fechaNac;
    private javax.swing.JCheckBox jCheckBox_mail;
    private javax.swing.JCheckBox jCheckBox_nombre;
    private javax.swing.JCheckBox jCheckBox_ocupacion;
    private javax.swing.JCheckBox jCheckBox_patologias;
    private com.toedter.calendar.JDateChooser jDC_fechaNac;
    private com.toedter.calendar.JDateChooser jDC_proximoTur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList_patologias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jText_Apellido;
    private javax.swing.JTextField jText_Celular;
    private javax.swing.JTextField jText_DNI;
    private javax.swing.JTextField jText_Dosis;
    private javax.swing.JTextField jText_MarcaVial;
    private javax.swing.JTextField jText_Nombre;
    private javax.swing.JTextField jText_Ocupacion;
    private javax.swing.JTextField jText_antigenoVial;
    private javax.swing.JTextField jText_centroTur;
    private javax.swing.JTextField jText_email;
    private javax.swing.JTextField jText_estadoTur;
    private javax.swing.JTextField jText_fechaTur;
    private javax.swing.JTextField jText_fechaVencVial;
    private javax.swing.JTextField jText_numeroVial;
    // End of variables declaration//GEN-END:variables

    private void armarComponentesVisuales() {
        jCheckBox_patologias.setVisible(false);
        jText_Apellido.setEditable(false);
        jText_Ocupacion.setEditable(false);
        jText_Dosis.setEditable(false);
        jText_Nombre.setEditable(false);
        jText_Celular.setEditable(false);
        jText_email.setEditable(false);
        jText_centroTur.setEditable(false);
        jText_fechaTur.setEditable(false);
        jCheckBox_apellido.setVisible(false);
        jCheckBox_dosis.setVisible(false);
        jCheckBox_nombre.setVisible(false);
        jCheckBox_ocupacion.setVisible(false);
        jCheckBox_celular.setVisible(false);
        jCheckBox_mail.setVisible(false);
        jButton4.setEnabled(false);
        jButton_ModificarDatos.setEnabled(false);
        jDC_fechaNac.setEnabled(false);
        
          
        String[] lista_viales = {"Centro","Total","Pfizer", "Johnson_Johnson", "AstraZeneca", "Sinopharm y Sinovac", "Sputnik V"};
        for (String lista_viale : lista_viales) {
           modelo_tabla2.addColumn(lista_viale);
        }
        jTable2.setModel(modelo_tabla2);
        calcularStocks();
    }

    private void buscarTurnosPersona() {
        jButton_ModificarDatos.setEnabled(true);
        
        c1 = cD.buscarCiudadanos(Integer.parseInt(jText_DNI.getText()),"DNI").get(0);
        listaTurnos =tD.buscarTurno(Integer.parseInt(jText_DNI.getText()));
        
        //se muestra en pantalla los datos del ciudadano
        jText_Apellido.setText(c1.getApellido());
        jText_Nombre.setText(c1.getNombre());
        jText_Ocupacion.setText(c1.getAmbitoTrabajo());
        jText_Dosis.setText(Integer.toString(c1.getDosisAplicadas()));
        jText_Celular.setText(Integer.toString(c1.getCelular()));
        jText_email.setText(c1.getEmail());
        jDC_fechaNac.setDate(Date.valueOf(c1.getFechaNacimiento()));
        
        
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (String patologias : cD.consultaPatologias(c1.getDNI())) {
            modelo.addElement(patologias);
        }
        if (modelo.getSize() == 0) {
            modelo.addElement("No hay patologias declaradas");
        }
        jList_patologias.setModel(modelo);
        
        turno1 = listaTurnos.get(0);
        for (Turno turno : tD.buscarTurno(Integer.parseInt(jText_DNI.getText()))) {
            if (turno.getFecha().isAfter(turno1.getFecha())) {
                turno1 = turno;
           }
        }
        jText_estadoTur.setText(turno1.isEstado());
        jText_centroTur.setText(turno1.getVacunatorio().getNombre());
        jText_fechaTur.setText(turno1.getFecha().toString());
    }
    
    private void modificarDatosCiudadano() {
        jCheckBox_patologias.setVisible(true);
        jCheckBox_apellido.setVisible(true);
        jCheckBox_dosis.setVisible(true);
        jCheckBox_nombre.setVisible(true);
        jCheckBox_ocupacion.setVisible(true);
        jCheckBox_celular.setVisible(true);
        jCheckBox_mail.setVisible(true);
        }

    private void actualizarDatos(){
        cD.actualizarDatosCiudadano(c1, jText_Apellido.getText(), jCheckBox_apellido.isSelected(),
                jText_Nombre.getText(), jCheckBox_nombre.isSelected(),
                jText_Celular.getText(), jCheckBox_celular.isSelected(),
                jText_Dosis.getText(), jCheckBox_dosis.isSelected(),
                jText_Ocupacion.getText(), jCheckBox_ocupacion.isSelected(),
                jText_email.getText(), jCheckBox_mail.isSelected(),
                jDC_fechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),jCheckBox_fechaNac.isSelected());
    }
    
    private void completarDatosFinales(Vial vial){
        jText_antigenoVial.setText(vial.getAntigeno());
        jText_numeroVial.setText(Integer.toString(vial.getNumeroSerie()));
        jText_MarcaVial.setText(vial.getMarca());
        jText_fechaVencVial.setText(vial.getFechaVencimiento().toString());
    }
    
    private LocalDate nuevoTurno(){
       int turnos_libres;
       LocalDate fecha1 = LocalDate.now().plusDays(28);
       
        do {
            turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha1,turno1.getVacunatorio());
            fecha1 = fecha1.plusDays(1);
        } while (turnos_libres <= 0);
        
        jDC_proximoTur.setDate(java.sql.Date.valueOf(fecha1.minusDays(1)));
        return fecha1.minusDays(1);
        }
     
    private void tomarNuevoTurno(LocalDate fecha1){
        turno_nuevo.setFecha(fecha1.atStartOfDay());
        turno_nuevo.setVacunatorio(turno1.getVacunatorio());
      
        tD.updateTurnos_Libres(fecha1,turno_nuevo);
        
        c1.setTurno(turno_nuevo);
        if (!turno1.isEstado().equalsIgnoreCase("Cancelado")){
        c1.setDosisAplicadas(c1.getDosisAplicadas()+1);
        } else 
        c1.setDosisAplicadas(c1.getDosisAplicadas());
        int updates = cD.cargarTurno(c1);
        if (updates > 0){
            tD.actualizarTurnero_Hora(c1.getTurno());
        } 
    }
    
    private void nuevoTurno_turno1Cancelado(){
       int turnos_libres;
       LocalDate fecha1 = LocalDate.now().plusDays(15);
            
        do {
            turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha1,turno1.getVacunatorio());
            fecha1 = fecha1.plusDays(1);
        } while (turnos_libres <= 0);     
        
        tomarNuevoTurno(fecha1.minusDays(1));    
        }
       
    private void calcularStocks() {
        modelo_tabla2.setRowCount(0);
        modelo_tabla2.addRow(new Object[]{"Stock:"});
           int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0, total = 0;
            for (Vial viales : sD.listarViales(0, vac.getIdVacunatorio())) {
                switch (viales.getMarca()) {
                    case "Sputnik V":Sputnik++;total++;break;
                    case "Pfizer": Pfizer++;total++; break;
                    case "Sinopharm y Sinovac":Sinopharm++;total++;break;
                    case "Johnson_Johnson":Johnson++;total++;break;
                    case "AstraZeneca": AstraZeneca++; total++;break;
                }
            }
            modelo_tabla2.addRow(new Object[]{vac.getNombre(), total, Sputnik, Pfizer, Sinopharm, Johnson, AstraZeneca});
            ArrayList<Integer> turnos_pendientes = new ArrayList<>();
            LocalDate fecha = LocalDate.now();
            
            int totalTur = 0;
            while (fecha.isBefore(LocalDate.now().plusDays(7))){
                int turnos = 0;
                ArrayList<Turno> turnosPordia = tD.listar_Turnos(fecha, vac,"porDia_pendiente" );      
                    for (Turno turno : turnosPordia) {
                            turnos++;
                            totalTur++;
                        } turnos_pendientes.add(turnos);
                     fecha = fecha.plusDays(1);
                }
            modelo_tabla2.addRow(new Object[]{});
            modelo_tabla2.addRow(new Object[]{"TURNOS:",});
            modelo_tabla2.addRow(new Object[]{"Total:", totalTur});
            fecha = LocalDate.now();
            modelo_tabla2.addRow(new Object[]{"Pendientes:"});       
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d-MMM", Locale.ENGLISH);
            modelo_tabla2.addRow(new Object[]{
                fecha.format(dateFormatter),
                fecha.plusDays(1).format(dateFormatter),
                fecha.plusDays(2).format(dateFormatter),
                fecha.plusDays(3).format(dateFormatter),
                fecha.plusDays(4).format(dateFormatter),
                fecha.plusDays(5).format(dateFormatter),
                fecha.plusDays(6).format(dateFormatter)
            });
            modelo_tabla2.addRow(new Object[]{turnos_pendientes.get(0),turnos_pendientes.get(1),turnos_pendientes.get(2),turnos_pendientes.get(3),turnos_pendientes.get(4),turnos_pendientes.get(5),turnos_pendientes.get(6)});
            }
    }
        

