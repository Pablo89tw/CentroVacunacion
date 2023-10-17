package Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Entidades.Ciudadano;
import Entidades.Turno;
import Entidades.Vial;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Administrador extends javax.swing.JInternalFrame {

    private CiudadanoData cD;
    private TurnoData tD;
    private Ciudadano c1 = new Ciudadano();
    private Turno turno1 = new Turno();
    private Vial vial2;

    public Administrador(CiudadanoData cD, TurnoData tD) {
        this.cD = cD;
        this.tD = tD;
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
        jText_ingresoDNI = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jText_vacunatorio = new javax.swing.JTextField();
        jText_fecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jCheckBox_apellido = new javax.swing.JCheckBox();
        jCheckBox_nombre = new javax.swing.JCheckBox();
        jCheckBox_dosis = new javax.swing.JCheckBox();
        jCheckBox_ocupacion = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField_celular = new javax.swing.JTextField();
        jCheckBox_celular = new javax.swing.JCheckBox();
        jTextField_mail = new javax.swing.JTextField();
        jCheckBox_mail = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jCheckBox_patologias = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jText_vacunatorio1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        Marca = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        Marca3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Marca4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel13.setText("Numero Serie");

        jTextField7.setText("jTextField4");

        jTextField9.setText("jTextField4");

        Marca1.setText("Marca");

        jLabel1.setText("DNI:");

        jText_ingresoDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_ingresoDNIFocusLost(evt);
            }
        });
        jText_ingresoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_ingresoDNIActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido");

        Nombre.setText("Nombre");

        jLabel3.setText("Ocupacion");

        Edad.setText("Dosis Aplicadas");

        jLabel4.setText("Patologias");

        jList1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jList1ComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel5.setText("Control Datos Personales:");

        jText_vacunatorio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_vacunatorioFocusLost(evt);
            }
        });
        jText_vacunatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_vacunatorioActionPerformed(evt);
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

        jButton1.setText("Modificar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton5.setText("Nuevo Turno");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_vacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jText_vacunatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 91, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Continuar))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel1)
                                            .addGap(28, 28, 28)
                                            .addComponent(jText_ingresoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel9))
                                            .addGap(21, 21, 21)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox_apellido)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Nombre)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(5, 5, 5)
                                                        .addComponent(jCheckBox_celular)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Edad)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(21, 21, 21))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_ocupacion)
                                    .addComponent(jCheckBox_dosis)
                                    .addComponent(jCheckBox_nombre)
                                    .addComponent(jCheckBox_patologias)
                                    .addComponent(jCheckBox_mail)))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_ingresoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jCheckBox_apellido))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_nombre)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Nombre)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Edad)
                        .addComponent(jLabel9)
                        .addComponent(jTextField_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox_celular)
                    .addComponent(jCheckBox_dosis, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_ocupacion)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jCheckBox_mail)
                    .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox_patologias)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_vacunatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jText_vacunatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jText_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Continuar)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(147, Short.MAX_VALUE))
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
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Marca3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton2)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Proximo Turno", jPanel3);

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

    private void jText_vacunatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_vacunatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_vacunatorioActionPerformed

    private void jText_vacunatorioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_vacunatorioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_vacunatorioFocusLost

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jText_ingresoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_ingresoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_ingresoDNIActionPerformed

    private void jText_ingresoDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_ingresoDNIFocusLost
        if (!jText_ingresoDNI.getText().isEmpty()) {
            buscarTurnosPersona();
        }
    }//GEN-LAST:event_jText_ingresoDNIFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modificarDatosCiudadano();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_apellidoActionPerformed
        if (jCheckBox_apellido.isSelected()) {
            jTextField1.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_apellido.isSelected()) {
            jTextField1.setEditable(false);
            jTextField1.setText(c1.getApellido());
            if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_apellidoActionPerformed

    private void jCheckBox_dosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_dosisActionPerformed
        if (jCheckBox_dosis.isSelected()) {
            jTextField3.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_dosis.isSelected()) {
            jTextField3.setEditable(false);
            jTextField3.setText(Integer.toString(c1.getDosisAplicadas()));
             if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_dosisActionPerformed

    private void jCheckBox_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_nombreActionPerformed
        if (jCheckBox_nombre.isSelected()) {
            jTextField5.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_nombre.isSelected()) {
            jTextField5.setEditable(false);
            jTextField5.setText(c1.getNombre());
             if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_nombreActionPerformed

    private void jCheckBox_ocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ocupacionActionPerformed
        if (jCheckBox_ocupacion.isSelected()) {
            jTextField2.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_ocupacion.isSelected()) {
            jTextField2.setEditable(false);
            jTextField2.setText(c1.getAmbitoTrabajo());
             if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_ocupacionActionPerformed

    private void jCheckBox_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_celularActionPerformed
        if (jCheckBox_celular.isSelected()) {
            jTextField_celular.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_celular.isSelected()) {
            jTextField_celular.setEditable(false);
            jTextField_celular.setText(c1.getAmbitoTrabajo());
             if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()){
            jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_celularActionPerformed

    private void jCheckBox_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_mailActionPerformed
        if (jCheckBox_mail.isSelected()) {
            jTextField_mail.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_mail.isSelected()) {
            jTextField_mail.setEditable(false);
            jTextField_mail.setText(c1.getAmbitoTrabajo());
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

    private void jList1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jList1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1ComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            tomarNuevoTurno(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),turno1);
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        nuevoTurno2();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Marca1;
    private javax.swing.JLabel Marca3;
    private javax.swing.JLabel Marca4;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox_apellido;
    private javax.swing.JCheckBox jCheckBox_celular;
    private javax.swing.JCheckBox jCheckBox_dosis;
    private javax.swing.JCheckBox jCheckBox_mail;
    private javax.swing.JCheckBox jCheckBox_nombre;
    private javax.swing.JCheckBox jCheckBox_ocupacion;
    private javax.swing.JCheckBox jCheckBox_patologias;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField_celular;
    private javax.swing.JTextField jTextField_mail;
    private javax.swing.JTextField jText_fecha;
    private javax.swing.JTextField jText_ingresoDNI;
    private javax.swing.JTextField jText_vacunatorio;
    private javax.swing.JTextField jText_vacunatorio1;
    // End of variables declaration//GEN-END:variables

    private void armarComponentesVisuales() {
        jCheckBox_patologias.setVisible(false);
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField5.setEditable(false);
        jTextField_celular.setEditable(false);
        jTextField_mail.setEditable(false);
        jText_vacunatorio.setEditable(false);
        jText_fecha.setEditable(false);
        jCheckBox_apellido.setVisible(false);
        jCheckBox_dosis.setVisible(false);
        jCheckBox_nombre.setVisible(false);
        jCheckBox_ocupacion.setVisible(false);
        jCheckBox_celular.setVisible(false);
        jCheckBox_mail.setVisible(false);
        jButton4.setEnabled(false);
        jButton1.setEnabled(false);
        
       

    }

    private void buscarTurnosPersona() {
        jButton1.setEnabled(true);
        
        this.c1 = cD.buscarCiudadanos(Integer.parseInt(jText_ingresoDNI.getText()),"DNI").get(0);
        this.turno1 = tD.buscarTurno(Integer.parseInt(jText_ingresoDNI.getText())).get(0);  
        
        jTextField1.setText(c1.getApellido());
        jTextField5.setText(c1.getNombre());
        jTextField2.setText(c1.getAmbitoTrabajo());
        jTextField3.setText(Integer.toString(c1.getDosisAplicadas()));
        jTextField_celular.setText(Integer.toString(c1.getCelular()));
        jTextField_mail.setText(c1.getEmail());
        
        armarListaPatologias();
        
       
        
        
        for (Turno turno : tD.buscarTurno(Integer.parseInt(jText_ingresoDNI.getText()))) {
            if (turno.getFecha().isAfter(turno1.getFecha())) {
                this.turno1 = turno;
           }
        jText_vacunatorio1.setText(turno1.isEstado());
        jText_vacunatorio.setText(turno1.getVacunatorio().getNombre());
        jText_fecha.setText(turno1.getFecha().toString());

        if (!(LocalDateTime.now().isBefore(turno.getFecha().minusMinutes(15)) && LocalDateTime.now().isBefore(turno.getFecha().plusMinutes(45)))) {
            
        }
    }
    }
    
    public void armarListaPatologias(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (String patologias : cD.consultaPatologias(c1.getDNI())) {
            modelo.addElement(patologias);
        }
        if (modelo.getSize() == 0) {
            modelo.addElement("No hay patologias declaradas");
        }
        jList1.setModel(modelo);
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
        cD.actualizarDatosCiudadano(c1, jTextField1.getText(), jCheckBox_apellido.isSelected(),
                jTextField5.getText(), jCheckBox_nombre.isSelected(),
                jTextField_celular.getText(), jCheckBox_celular.isSelected(),
                jTextField3.getText(), jCheckBox_dosis.isSelected(),
                jTextField2.getText(), jCheckBox_ocupacion.isSelected(),
                jTextField_mail.getText(), jCheckBox_mail.isSelected());
    }
    
    private void completarDatosFinales(Vial vial){
        jTextField8.setText(vial.getAntigeno());
        jTextField6.setText(Integer.toString(vial.getNumeroSerie()));
        jTextField4.setText(vial.getMarca());
        jTextField10.setText(vial.getFechaVencimiento().toString());
    }
    
    private LocalDate nuevoTurno(){
       int turnos_libres;
       LocalDate fecha1 = LocalDate.now().plusDays(28);
            
        do {
            turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha1,turno1.getVacunatorio());
            fecha1 = fecha1.plusDays(1);
        } while (turnos_libres <= 0);
        
        jDateChooser1.setDate(java.sql.Date.valueOf(fecha1.minusDays(1)));
        return fecha1.minusDays(1);
        }
     
    private void tomarNuevoTurno(LocalDate fecha1, Turno turno_anterior){
        Turno nuevo_turno = new Turno();
         nuevo_turno.setFecha(fecha1.atStartOfDay());
         nuevo_turno.setVacunatorio(turno1.getVacunatorio());
      
        tD.updateTurnos_Libres(fecha1,nuevo_turno);
        
        c1.setTurno(nuevo_turno);
        if (!turno1.isEstado().equalsIgnoreCase("Cancelado")){
        c1.setDosisAplicadas(c1.getDosisAplicadas()+1);
        } else 
        c1.setDosisAplicadas(c1.getDosisAplicadas());
        int updates = cD.cargarTurno(c1);
        if (updates > 0){
            tD.actualizarTurnero_Hora(c1.getTurno());
        } 
    }
    
       private void nuevoTurno2(){
       int turnos_libres;
       LocalDate fecha1 = LocalDate.now().plusDays(15);
            
        do {
            turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha1,turno1.getVacunatorio());
            fecha1 = fecha1.plusDays(1);
        } while (turnos_libres <= 0);     
        tomarNuevoTurno(fecha1.minusDays(1),turno1);    
        }
}
