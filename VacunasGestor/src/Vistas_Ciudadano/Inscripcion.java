package Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.geoData;
import Entidades.Ciudadano;
import Entidades.Coordenadas;
import Entidades.Turno;
import Entidades.Vacunatorio;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;

public class Inscripcion extends javax.swing.JInternalFrame {

    geoData gD = new geoData();
    VacunatorioData vD = new VacunatorioData();
    TurnoData tD = new TurnoData();
    private CiudadanoData cD = new CiudadanoData();
    private Coordenadas dtaCorda = new Coordenadas();
    private Ciudadano c1 = new Ciudadano();
    private Turno turno1 = new Turno();
    private Vacunatorio masCercano;
    private String columnas;

    public Inscripcion() {
        initComponents();
        armarElementos();
        armadoVista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Turno = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        TextoApellido1 = new javax.swing.JLabel();
        jTextoApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextoDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTexto_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTexto_celular1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Actualizar_1 = new javax.swing.JButton();
        jTexto_ciudad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        Diabetes2 = new javax.swing.JLabel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Actualizar_2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        otras_Patologias = new javax.swing.JTextField();
        scrollPane1 = new java.awt.ScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Actualizar_3 = new javax.swing.JButton();
        nombreVacunatorio = new javax.swing.JLabel();
        nombreVacunatorio1 = new javax.swing.JLabel();

        TextoApellido1.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        TextoApellido1.setText("APELLIDO");

        jTextoApellido.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTextoApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextoApellido.setBorder(null);

        jLabel5.setBackground(new java.awt.Color(255, 51, 102));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CARGAR DATOS");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel2.setText("NOMBRE");

        TextoNombre.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        TextoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoNombre.setBorder(null);

        jLabel3.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel3.setText("DNI");

        TextoDni.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        TextoDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoDni.setBorder(null);

        jLabel6.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel6.setText("E-mail");

        jTexto_email.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTexto_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_email.setBorder(null);

        jLabel7.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel7.setText("Ámbito de trabajo");

        jLabel8.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel8.setText("Telefono celular");

        jTexto_celular1.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTexto_celular1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_celular1.setBorder(null);

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("Cerrar");

        Actualizar_1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        Actualizar_1.setText("Actualizar Datos");
        Actualizar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_1ActionPerformed(evt);
            }
        });

        jTexto_ciudad.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTexto_ciudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_ciudad.setBorder(null);
        jTexto_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTexto_ciudadKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel9.setText("Ciudad");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Buscar Domicilio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Actualizar_1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(TextoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(175, 175, 175)
                                    .addComponent(TextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(175, 175, 175)
                                    .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(175, 175, 175)
                                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(175, 175, 175)
                                    .addComponent(jTexto_email, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jTexto_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTexto_celular1)
                                        .addComponent(jComboBox1, 0, 427, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(TextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jTexto_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexto_celular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(TextoApellido1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexto_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar_1)
                    .addComponent(jButton1))
                .addGap(29, 29, 29))
        );

        Turno.addTab("Datos Personales", jPanel1);

        jRadioButton11.setText("Si");

        jRadioButton12.setText("No");

        jRadioButton13.setText("Si");

        Diabetes2.setText("Diabetes");

        jRadioButton14.setText("No");

        jLabel25.setText("Enfermedades Cardiovasculares");

        jRadioButton15.setText("Si");

        jLabel26.setText("Enfermedades Respiratorias Crónicas");

        jRadioButton16.setText("No");

        jLabel27.setText("Obesidad");

        jRadioButton17.setText("Si");

        jLabel28.setText("Enfermedades Renales Crónicas");

        jRadioButton18.setText("No");

        jLabel29.setText("Embarazo");

        jLabel30.setText("Otros");

        Actualizar_2.setText("Actualizar Datos");
        Actualizar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_2ActionPerformed(evt);
            }
        });

        jLabel31.setText("Inmunosupresion");

        jLabel32.setText("Enfermedades Hepáticas");

        jRadioButton1.setText("Si");

        jRadioButton2.setText("No");

        jRadioButton3.setText("Si");

        jRadioButton4.setText("No");

        jRadioButton5.setText("Si");

        jRadioButton6.setText("No");

        jRadioButton7.setText("Si");

        jRadioButton8.setText("No");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.setText("Si");

        jRadioButton10.setText("No");

        jLabel33.setText("Enfermedades Neurológicas");

        otras_Patologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otras_PatologiasActionPerformed(evt);
            }
        });

        scrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPane1.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jRadioButton1)
                        .addGap(15, 15, 15)
                        .addComponent(jRadioButton2)
                        .addGap(269, 269, 269)
                        .addComponent(jRadioButton12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jRadioButton3)
                        .addGap(15, 15, 15)
                        .addComponent(jRadioButton4)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jRadioButton13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton5)
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jRadioButton15))
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jRadioButton16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jRadioButton17))
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jRadioButton18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jRadioButton10)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jRadioButton9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jRadioButton7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jRadioButton8))
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(jRadioButton14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jRadioButton11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jRadioButton6))
                    .addComponent(Diabetes2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(otras_Patologias, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(677, 677, 677))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Actualizar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton12))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton13))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton5)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton15)
                                    .addComponent(jRadioButton16))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton17)
                                    .addComponent(jRadioButton18))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton10)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jRadioButton9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jRadioButton7))
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jRadioButton8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jRadioButton14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(otras_Patologias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jRadioButton6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Diabetes2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Actualizar_2)
                .addGap(184, 184, 184))
        );

        Turno.addTab("Patologias Previas", jPanel2);

        jLabel4.setText("1° Dosis");

        jLabel10.setText("Centro Vacunacion:");

        Actualizar_3.setText("Finalizar");
        Actualizar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 155, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreVacunatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Actualizar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)))
                        .addGap(32, 32, 32))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(nombreVacunatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Actualizar_3)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        Turno.addTab("Turno", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Turno)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Turno)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            dtaCorda.setNombre(jTable1.getValueAt(filaSeleccionada, 0).toString());
        }
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jTexto_ciudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexto_ciudadKeyReleased
        completarTabla(gD.buscarCiudad(jTexto_ciudad.getText()));
    }//GEN-LAST:event_jTexto_ciudadKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        armarCoodenadas(gD.buscarCiudad(dtaCorda.getNombre()).get(0));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Actualizar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_1ActionPerformed
        vacunatorioCercano();
        armarCiudadano();
        proximoTurnoLibre();
    }//GEN-LAST:event_Actualizar_1ActionPerformed

    private void Actualizar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_2ActionPerformed
        cD.cargaCiudadano(c1);
        patologiaUpdate();
    }//GEN-LAST:event_Actualizar_2ActionPerformed

    private void Actualizar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_3ActionPerformed
        armarDataTurno();
        cD.cargarTurno(c1, turno1, 0);
    }//GEN-LAST:event_Actualizar_3ActionPerformed

    private void otras_PatologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otras_PatologiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otras_PatologiasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_1;
    private javax.swing.JButton Actualizar_2;
    private javax.swing.JButton Actualizar_3;
    private javax.swing.JLabel Diabetes2;
    private javax.swing.JLabel TextoApellido1;
    private javax.swing.JTextField TextoDni;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTabbedPane Turno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextoApellido;
    private javax.swing.JTextField jTexto_celular1;
    private javax.swing.JTextField jTexto_ciudad;
    private javax.swing.JTextField jTexto_email;
    private javax.swing.JLabel nombreVacunatorio;
    private javax.swing.JLabel nombreVacunatorio1;
    private javax.swing.JTextField otras_Patologias;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void armarElementos() {
        String[] trabajos = {"Sanidad y Medicina", "Educación", "Servicios Financieros", "Gobierno y Administración Pública", "Arte y Entretenimiento",
            "Agricultura y Agroindustria", "Construcción y Arquitectura", "Monotributista", "Trabajo Informal", "Privado", "Estudiante Java","Otro"};
        DefaultComboBoxModel ambitos = new DefaultComboBoxModel(trabajos);
        jComboBox1.setModel(ambitos);

        modelo.setColumnCount(0);
        modelo.addColumn("Ciudad");
        jTable1.setModel(modelo);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jDateChooser1.setEnabled(false);
        jButton2.setEnabled(false);
       
    }

    private void armadoVista() {
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

    }

    private void completarTabla(ArrayList<Coordenadas> ArrayCord) {
        int filas = jTable1.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }

        for (Coordenadas coor : ArrayCord) {
            modelo.addRow(new Object[]{coor.getNombre()});
        }
    }

    public void armarCoodenadas(Coordenadas coord) {
        JXMapKit mapKit = new JXMapKit();
        mapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);

        // Establece la ubicación inicial y el nivel de zoom
        GeoPosition centerPosition = new GeoPosition(coord.getLatitud(), coord.getLongitud());
        mapKit.setCenterPosition(centerPosition);
        mapKit.setZoom(100);

        // Crea un JFrame para contener el mapKit
        JFrame frame = new JFrame("Mapa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Crea un WaypointPainter para gestionar las marcas
        WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<Waypoint>();
        mapKit.getMainMap().setOverlayPainter(waypointPainter);

        // Agregar un escuchador de eventos de clic en el mapa
        mapKit.getMainMap().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point point = e.getPoint();
                GeoPosition coordenadas1 = mapKit.getMainMap().convertPointToGeoPosition(point);
                Waypoint waypoint = new DefaultWaypoint(coordenadas1);
                waypointPainter.setWaypoints(Collections.singleton(waypoint));

                JOptionPane.showMessageDialog(frame, "Coordenadas: Latitud " + coordenadas1.getLatitude() + ", Longitud " + coordenadas1.getLongitude());
                dtaCorda.setLatitud(coordenadas1.getLatitude());
                dtaCorda.setLongitud(coordenadas1.getLongitude());
                frame.setVisible(false);
            }
        });
        frame.getContentPane().add(mapKit);
        frame.setVisible(true);
        c1.setCordenadas(dtaCorda);
    }

    private void armarCiudadano() {
        c1.setDNI(Integer.parseInt(TextoDni.getText()));
        c1.setNombre(TextoNombre.getText());
        c1.setApellido(jTextoApellido.getText());
        c1.setEmail(jTexto_email.getText());
        c1.setCelular(Integer.parseInt(jTexto_celular1.getText()));
        c1.setAmbitoTrabajo(jComboBox1.getSelectedItem().toString());
    }

    private void patologiaUpdate() {
        cD.patologias(c1,
                jRadioButton1.isSelected(),
                jRadioButton3.isSelected(),
                jRadioButton5.isSelected(),
                jRadioButton7.isSelected(),
                jRadioButton9.isSelected(),
                jRadioButton11.isSelected(),
                jRadioButton13.isSelected(),
                jRadioButton15.isSelected(),
                jRadioButton17.isSelected(),
                otras_Patologias.getText());

        JOptionPane.showMessageDialog(null, "En caso de error, comunicarse con el Astronauta Daniel Vidaurre.");
    }

    private void armarDataTurno() {
        LocalDate fecha = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDateTime fechaTime = fecha.atStartOfDay();
        LocalTime horaEspecifica;
        switch (jComboBox2.getSelectedItem().toString()) {
            case "8 a 9":
                horaEspecifica = LocalTime.of(8, 00, 0);
                columnas = "8_9";
                break;
            case "9 a 10":
                horaEspecifica = LocalTime.of(9, 00, 0);
                columnas = "9_10";
                break;
            case "10 a 11":
               horaEspecifica = LocalTime.of(10, 00, 0);
                columnas = "10_11";
                break;
            case "11 a 12":
                horaEspecifica = LocalTime.of(11, 00, 0);
               columnas = "11_12";
                break;
            case "12 a 13":
              horaEspecifica = LocalTime.of(12, 00, 0);
               columnas = "12_13";
                break;
            case "13 a 14":
              horaEspecifica = LocalTime.of(13, 00, 0);
                columnas = "13_14";
                break;
            case "14 a 15":
             horaEspecifica = LocalTime.of(14, 00, 0);
                columnas = "14_15";
                break;
            case "15 a 16":
            horaEspecifica = LocalTime.of(15, 00, 0);
                columnas = "15_16";
                break;
            default :
              horaEspecifica = LocalTime.of(16, 00, 0);
                columnas = "16_17";
                break;
        }
        fechaTime = fecha.atTime(horaEspecifica);
        turno1.setFecha(fechaTime);
        turno1.setVacunatorio(masCercano);
        c1.setTurno(turno1);
    }

    private void proximoTurnoLibre() {
        ArrayList<String> turnos;
        LocalDate fecha = LocalDate.now();
        do {
            turnos = tD.turnosLibres(fecha, masCercano);
            fecha = fecha.plusDays(1);
        } while (turnos.isEmpty());
        jDateChooser1.setDate(java.sql.Date.valueOf(fecha.minusDays(1)));
        buscarHorariosLibres(fecha.minusDays(1));
    }

    private void buscarHorariosLibres(LocalDate date) {
        ArrayList<String> turnos = tD.turnosLibres(date, masCercano);
        DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>(turnos.toArray(new String[0]));
        jComboBox2.setModel(cbModel);
    }

    private void vacunatorioCercano() {
        double distancia;
        double min;

        Vacunatorio vac1 = vD.listarVacunatorio().get(0);
        min = Math.sqrt(((vac1.getUbicacion().getLatitud() - dtaCorda.getLatitud()) * (vac1.getUbicacion().getLatitud() - dtaCorda.getLatitud())) + ((vac1.getUbicacion().getLongitud() - dtaCorda.getLongitud()) * (vac1.getUbicacion().getLongitud() - dtaCorda.getLongitud())));

        for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud())));
            if (min > distancia) {
                min = distancia;
            }
        }
        for (Vacunatorio vacunatorio : vD.listarVacunatorio()) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud())));
            if (distancia == min) {
                masCercano = vacunatorio;
                nombreVacunatorio.setText(masCercano.getNombre());
                nombreVacunatorio1.setText(masCercano.getDireccion());
                proximoTurnoLibre();
            }
        }
    }

   
}
