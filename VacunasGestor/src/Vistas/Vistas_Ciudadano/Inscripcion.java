package Vistas.Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.LoginData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.geoData;
import Entidades.Ciudadano;
import Entidades.Coordenadas;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.CustomWaypoint;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;

public class Inscripcion extends javax.swing.JInternalFrame {

    private geoData gD;
    private VacunatorioData vD;
    private TurnoData tD;
    private LoginData lD;
    private CiudadanoData cD;
    private Coordenadas dtaCorda = new Coordenadas();
    private Ciudadano c1 = new Ciudadano();
    private Turno turno1 = new Turno();
    private Vacunatorio masCercano;
    private Point localizacion;
    private Dimension tamanio;
    

    public Inscripcion(geoData gD, VacunatorioData vD, TurnoData tD, LoginData lD, CiudadanoData cD, int usuario,Point localizacion, Dimension tamanio) {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.c1 = cD.buscarCiudadanos(usuario, "DNI").get(0);
        this.gD = gD;
        this.vD = vD;
        this.cD = cD;
        this.tD = tD;
        this.lD = lD;
        initComponents();
        armarElementos();
        this.localizacion = localizacion;
        this.tamanio = tamanio;
        jSolapasTurno.setBorder(null);
        jSolapasTurno.setLocation(localizacion);
        jSolapasTurno.setSize(tamanio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSolapasTurno = new javax.swing.JTabbedPane();
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
        jLabel8 = new javax.swing.JLabel();
        jCB_ambitoTrabajo = new javax.swing.JComboBox<>();
        jTexto_celular = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton_Siguiente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton_Siguiente1 = new javax.swing.JButton();
        jButton_Siguiente2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jDC_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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
        jButton_siguiente2 = new javax.swing.JButton();
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
        Anterior = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDC_dosis = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Actualizar_3 = new javax.swing.JButton();
        jText_nombreVacunatorio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadio_si = new javax.swing.JRadioButton();
        jRadio_no = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jDC_covid = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadio_altaMedicaSi = new javax.swing.JRadioButton();
        jRadio_altaMedicaNo = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jText_direccionVac = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(551, 600));

        TextoApellido1.setFont(new java.awt.Font("ArianLT-Bold", 1, 14)); // NOI18N
        TextoApellido1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TextoApellido1.setText("APELLIDO");

        jTextoApellido.setFont(new java.awt.Font("ArianLT-Demi", 0, 18)); // NOI18N
        jTextoApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextoApellido.setBorder(null);
        jTextoApellido.setOpaque(false);
        jTextoApellido.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(0, 153, 204));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" COMPLETAR:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE");

        TextoNombre.setFont(new java.awt.Font("ArianLT-Demi", 0, 18)); // NOI18N
        TextoNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoNombre.setBorder(null);
        TextoNombre.setOpaque(false);
        TextoNombre.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("ArianLT-Bold", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DNI");

        TextoDni.setFont(new java.awt.Font("ArianLT-Demi", 0, 18)); // NOI18N
        TextoDni.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoDni.setBorder(null);
        TextoDni.setOpaque(false);
        TextoDni.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("ArianLT-Bold", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("E-mail");

        jTexto_email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTexto_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_email.setBorder(null);
        jTexto_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTexto_emailFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("ArianLT-Bold", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Telefono celular");

        jCB_ambitoTrabajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCB_ambitoTrabajoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCB_ambitoTrabajoFocusLost(evt);
            }
        });

        jTexto_celular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTexto_celular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_celular.setBorder(null);
        jTexto_celular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTexto_celularFocusLost(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 1, 12)); // NOI18N
        jButton1.setText("Cerrar");

        jButton_Siguiente.setFont(new java.awt.Font("ArianLT-Bold", 1, 12)); // NOI18N
        jButton_Siguiente.setText("Siguiente");
        jButton_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SiguienteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("ArianLT-Bold", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Ciudad");

        jButton2.setText("Buscar Domicilio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton_Siguiente1.setFont(new java.awt.Font("ArianLT-Bold", 1, 12)); // NOI18N
        jButton_Siguiente1.setText("Actualizar Datos");
        jButton_Siguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Siguiente1ActionPerformed(evt);
            }
        });

        jButton_Siguiente2.setFont(new java.awt.Font("ArianLT-Bold", 1, 12)); // NOI18N
        jButton_Siguiente2.setText("Actualizar Clave");
        jButton_Siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Siguiente2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("ArianLT-Bold", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Fecha Nacimiento");

        jDC_fechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDC_fechaNacimientoPropertyChange(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("ArianLT-Bold", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Ambito Trabajo");

        jLabel18.setBackground(new java.awt.Color(0, 204, 51));
        jLabel18.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" DATOS:");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel18.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoApellido1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextoApellido)
                    .addComponent(TextoNombre)
                    .addComponent(TextoDni)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCB_ambitoTrabajo, javax.swing.GroupLayout.Alignment.LEADING, 0, 322, Short.MAX_VALUE)
                            .addComponent(jTexto_celular, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTexto_email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDC_fechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Siguiente2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Siguiente1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Siguiente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoApellido1))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jTexto_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(jDC_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jTexto_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(jButton2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_ambitoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton_Siguiente2)
                    .addComponent(jButton_Siguiente1)
                    .addComponent(jButton_Siguiente))
                .addContainerGap())
        );

        jSolapasTurno.addTab("Datos Personales", jPanel1);

        jRadioButton11.setText("Si");

        jRadioButton12.setText("No");

        jRadioButton13.setText("Si");

        Diabetes2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Diabetes2.setText("Diabetes");

        jRadioButton14.setText("No");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setText("Enfermedades Cardiovasculares");

        jRadioButton15.setText("Si");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setText("Enfermedades Respiratorias Crónicas");

        jRadioButton16.setText("No");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setText("Obesidad");

        jRadioButton17.setText("Si");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setText("Enfermedades Renales Crónicas");

        jRadioButton18.setText("No");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setText("Embarazo");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setText("Otros");

        jButton_siguiente2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_siguiente2.setText("SIGUIENTE");
        jButton_siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_siguiente2ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setText("Inmunosupresion");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setText("Enfermedades Hepáticas");

        jRadioButton1.setText("Si");

        jRadioButton2.setText("No");

        jRadioButton3.setText("Si");

        jRadioButton4.setText("No");

        jRadioButton5.setText("Si");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

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

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setText("Enfermedades Neurológicas");

        otras_Patologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otras_PatologiasActionPerformed(evt);
            }
        });

        scrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPane1.setVisible(false);

        Anterior.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Anterior.setText("ANTERIOR");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("El suscripto declara bajo juramento que la información precedentemente suministrada \nes auténtica y toma conocimiento de que cualquier falsedad, omisión o inexactitud en \nla misma, deliberada o no,  invalidará la asignacion del cronograma de vacunacion e \nincurrira a la aplicas sanciones administrativas y/o acciones judiciales. ");
        jScrollPane2.setViewportView(jTextArea1);

        jCheckBox1.setText("Acepto");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("No Acepto");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(0, 204, 51));
        jLabel19.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" Declaracion jurada de patologias preexistentes:");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel19.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(otras_Patologias))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(jRadioButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jRadioButton18)))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Diabetes2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton1))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton6)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(112, 112, 112)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton10)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton12)
                                    .addComponent(jRadioButton14)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jRadioButton15)
                                .addGap(29, 29, 29)
                                .addComponent(jRadioButton16)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(677, 677, 677))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Anterior)
                                .addGap(275, 275, 275)
                                .addComponent(jButton_siguiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(183, 183, 183))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Diabetes2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jRadioButton18)
                        .addComponent(jRadioButton17))
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otras_Patologias, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_siguiente2)
                    .addComponent(Anterior))
                .addContainerGap())
        );

        jSolapasTurno.addTab("Patologias Previas", jPanel2);

        jLabel21.setBackground(new java.awt.Color(0, 204, 51));
        jLabel21.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Declaracion sintomas COVID-19:");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("1° Dosis");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Direccion:");

        Actualizar_3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Actualizar_3.setText("Tomar Turno");
        Actualizar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("¿Fuiste diagnosticado con COVID-19 en los últimos 30 días? ");

        jRadio_si.setText("Si");
        jRadio_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_siActionPerformed(evt);
            }
        });

        jRadio_no.setText("No");
        jRadio_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_noActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("¿Recibiste el alta medica?");

        jDC_covid.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDC_covidPropertyChange(evt);
            }
        });

        jLabel13.setText("Fecha");

        jRadio_altaMedicaSi.setText("Si");
        jRadio_altaMedicaSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_altaMedicaSiActionPerformed(evt);
            }
        });

        jRadio_altaMedicaNo.setText("No");
        jRadio_altaMedicaNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_altaMedicaNoActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("*En caso de tener alta medica, colocar la fecha del a misma.\n*En caso de tener no tener alta medica, colocar la fecha en la que comenzaste con \nlos sintomas");
        jScrollPane3.setViewportView(jTextArea2);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("¿Cuando?");

        jLabel22.setBackground(new java.awt.Color(0, 153, 204));
        jLabel22.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Asignacion turno vacunacion COVID-19:");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setOpaque(true);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("Centro Vacunacion:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadio_si)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadio_no))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jRadio_altaMedicaSi)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadio_altaMedicaNo))
                                            .addComponent(jLabel11))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jDC_covid, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDC_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Actualizar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_direccionVac, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_nombreVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(2, 2, 2))
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadio_si)
                    .addComponent(jRadio_no))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadio_altaMedicaSi)
                            .addComponent(jRadio_altaMedicaNo)
                            .addComponent(jLabel13)))
                    .addComponent(jDC_covid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jText_nombreVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_direccionVac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDC_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Actualizar_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(50, 50, 50))
        );

        jSolapasTurno.addTab("Turno", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSolapasTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSolapasTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        armarCoodenadas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SiguienteActionPerformed
        jSolapasTurno.setEnabledAt(1, true);
        armarCiudadano();
        jSolapasTurno.setSelectedIndex(1);
    }//GEN-LAST:event_jButton_SiguienteActionPerformed

    private void jTexto_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTexto_emailFocusLost

    }//GEN-LAST:event_jTexto_emailFocusLost

    private void jTexto_celularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTexto_celularFocusLost

    }//GEN-LAST:event_jTexto_celularFocusLost

    private void jCB_ambitoTrabajoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCB_ambitoTrabajoFocusLost

    }//GEN-LAST:event_jCB_ambitoTrabajoFocusLost

    private void jButton_Siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Siguiente1ActionPerformed
        controlFlujoInfo();
    }//GEN-LAST:event_jButton_Siguiente1ActionPerformed

    private void jButton_Siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Siguiente2ActionPerformed
        ModificlarClaveIF mC = new ModificlarClaveIF(c1.getDNI());
        mC.setVisible(true);
    }//GEN-LAST:event_jButton_Siguiente2ActionPerformed

    private void jDC_fechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDC_fechaNacimientoPropertyChange
          if (jDC_fechaNacimiento.getDate()!=null){
            jCB_ambitoTrabajo.setEnabled(true);
            armarjDC_ATr(jDC_fechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
    }//GEN-LAST:event_jDC_fechaNacimientoPropertyChange

    private void jCB_ambitoTrabajoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCB_ambitoTrabajoFocusGained
    }//GEN-LAST:event_jCB_ambitoTrabajoFocusGained

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jButton_siguiente2.setEnabled(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jButton_siguiente2.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        jSolapasTurno.setSelectedIndex(0);
    }//GEN-LAST:event_AnteriorActionPerformed

    private void otras_PatologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otras_PatologiasActionPerformed

    }//GEN-LAST:event_otras_PatologiasActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jButton_siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_siguiente2ActionPerformed
        jSolapasTurno.setEnabledAt(2, true);
        armarCiudadano();
        jSolapasTurno.setSelectedIndex(2);
    }//GEN-LAST:event_jButton_siguiente2ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadio_altaMedicaNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_altaMedicaNoActionPerformed
        jDC_covid.setEnabled(true);
    }//GEN-LAST:event_jRadio_altaMedicaNoActionPerformed

    private void jRadio_altaMedicaSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_altaMedicaSiActionPerformed
        jDC_covid.setEnabled(true);
    }//GEN-LAST:event_jRadio_altaMedicaSiActionPerformed

    private void jDC_covidPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDC_covidPropertyChange
        if (jDC_covid.getDate() != null){
            proximo_Turnoslibres(jDC_covid.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
    }//GEN-LAST:event_jDC_covidPropertyChange

    private void jRadio_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_noActionPerformed
        proximo_Turnoslibres(LocalDate.now());
        jDC_covid.setEnabled(false);
    }//GEN-LAST:event_jRadio_noActionPerformed

    private void jRadio_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_siActionPerformed
        jRadio_altaMedicaNo.setEnabled(true);
        jRadio_altaMedicaSi.setEnabled(true);
    }//GEN-LAST:event_jRadio_siActionPerformed

    private void Actualizar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_3ActionPerformed
        cD.cargaNuevosDatosCiudadano(c1);
        patologiaUpdate();
        turno1.setFecha(tD.colocarHora_aFecha(jDC_dosis.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jComboBox2.getSelectedItem().toString()));
        turno1.setVacunatorio(masCercano);
        c1.setTurno(turno1);
        int updates = cD.cargarTurno(c1);
        if (updates > 0) {
            tD.actualizarTurnero_Hora(c1.getTurno());
            lD.actualizarFaseIngreso(c1);
        }
        int opcion = JOptionPane.showConfirmDialog(null, "Inscripcion Finalizada. Desea visiar su perfil", "Abrir", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            if (getParent() instanceof LoginTes) {
                LoginTes loginFrame = (LoginTes) getParent();
                loginFrame.inicioSesion();
            }
            this.dispose();
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_Actualizar_3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_3;
    private javax.swing.JButton Anterior;
    private javax.swing.JLabel Diabetes2;
    private javax.swing.JLabel TextoApellido1;
    private javax.swing.JTextField TextoDni;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Siguiente;
    private javax.swing.JButton jButton_Siguiente1;
    private javax.swing.JButton jButton_Siguiente2;
    private javax.swing.JButton jButton_siguiente2;
    private javax.swing.JComboBox<String> jCB_ambitoTrabajo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDC_covid;
    private com.toedter.calendar.JDateChooser jDC_dosis;
    private com.toedter.calendar.JDateChooser jDC_fechaNacimiento;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JRadioButton jRadio_altaMedicaNo;
    private javax.swing.JRadioButton jRadio_altaMedicaSi;
    private javax.swing.JRadioButton jRadio_no;
    private javax.swing.JRadioButton jRadio_si;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jSolapasTurno;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel jText_direccionVac;
    private javax.swing.JLabel jText_nombreVacunatorio;
    private javax.swing.JTextField jTextoApellido;
    private javax.swing.JTextField jTexto_celular;
    private javax.swing.JTextField jTexto_email;
    private javax.swing.JTextField otras_Patologias;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void armarElementos() {
        jSolapasTurno.setEnabledAt(1, false);
        jSolapasTurno.setEnabledAt(2, false);
        jButton_Siguiente.setEnabled(false);
        jCB_ambitoTrabajo.setEnabled(false);
        
        modelo.setColumnCount(0);
        modelo.addColumn("Ciudad");
        jDC_dosis.setEnabled(false);
        
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
        ButtonGroup buttonGroup10 = new ButtonGroup();
        buttonGroup10.add(jRadio_si);
        buttonGroup10.add(jRadio_no);
        ButtonGroup buttonGroup11 = new ButtonGroup();
        buttonGroup11.add(jCheckBox1);
        buttonGroup11.add(jCheckBox2);
        
        ButtonGroup buttonGroup12 = new ButtonGroup();
        buttonGroup12.add(jRadio_altaMedicaNo);
        buttonGroup12.add(jRadio_altaMedicaSi);
        
        jCheckBox2.setSelected(true);
        jRadioButton2.setSelected(true);
        jRadioButton4.setSelected(true);
        jRadioButton6.setSelected(true);
        jRadioButton8.setSelected(true);
        jRadioButton10.setSelected(true);
        jRadioButton12.setSelected(true);
        jRadioButton14.setSelected(true);
        jRadioButton16.setSelected(true);
        jRadioButton18.setSelected(true);

        jDC_covid.setEnabled(false);

        jTextoApellido.setText(c1.getApellido());
        jTextoApellido.setEditable(false);
        TextoNombre.setText(c1.getNombre());
        TextoNombre.setEditable(false);
        TextoDni.setText(Integer.toString(c1.getDNI()));
        TextoDni.setEditable(false);
        jPanel2.setEnabled(false);
        jPanel3.setEnabled(false);
        jButton_siguiente2.setEnabled(false);
        jRadio_altaMedicaNo.setEnabled(false);
        jRadio_altaMedicaSi.setEnabled(false);
        
        jDC_fechaNacimiento.setMaxSelectableDate(Date.from((LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant())));
        jDC_fechaNacimiento.setMinSelectableDate(Date.from((LocalDate.now().minusYears(100).atStartOfDay(ZoneId.systemDefault()).toInstant())));
       
    }

    public void armarCoodenadas() {
        JXMapKit mapKit = new JXMapKit();
        
        JPanel panel_busqueda = new JPanel(); 
        panel_busqueda.setLayout(new FlowLayout());
        JTextField texto_busqueda = new JTextField(20);
        JButton buscar = new JButton("Buscar");
       
        buscar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        Coordenadas cord = gD.buscarCiudad(texto_busqueda.getText()).get(0);
        GeoPosition posicion_inicioMapa = new GeoPosition(cord.getLatitud(), cord.getLongitud());
        mapKit.setCenterPosition(posicion_inicioMapa);
        mapKit.setZoom(50);
        }
        });
        panel_busqueda.add(texto_busqueda);
        panel_busqueda.add(buscar);
               
        mapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);

        GeoPosition posicion_inicioMapa = new GeoPosition(-33.300653, -66.3209224);
        mapKit.setCenterPosition(posicion_inicioMapa);
        mapKit.setZoom(50);

        JFrame frame = new JFrame("Mapa");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      
        frame.setSize(tamanio);
        frame.add(panel_busqueda, BorderLayout.NORTH);
        frame.setLocation(localizacion);
        
        // Crea un WaypointPainter para gestionar las marcas
        WaypointPainter<Waypoint> punto_referencia = new WaypointPainter<Waypoint>();
        mapKit.getMainMap().setOverlayPainter(punto_referencia);
        
         CustomWaypoint waypoint;
         ArrayList<CustomWaypoint> lista_waypoints = new ArrayList<>();

        for (Vacunatorio centro : vD.listarVacunatorio()) {
        waypoint = new CustomWaypoint(centro.getUbicacion().getLatitud(), centro.getUbicacion().getLongitud(), null);
        lista_waypoints.add(waypoint);
        }
        WaypointPainter<CustomWaypoint> waypointPainter = new WaypointPainter<>();

        waypointPainter.setWaypoints(new HashSet<>(lista_waypoints));
        mapKit.getMainMap().setOverlayPainter(waypointPainter);

        

         // Agregar un escuchador de eventos de clic en el mapa
        mapKit.getMainMap().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point point = e.getPoint();
                GeoPosition coordenadas1 = mapKit.getMainMap().convertPointToGeoPosition(point);
                Waypoint waypoint = new DefaultWaypoint(coordenadas1);
                punto_referencia.setWaypoints(Collections.singleton(waypoint));

                mapKit.getMainMap().setOverlayPainter(punto_referencia);

                JDialog dialog = new JDialog();
                dialog.setTitle("Confirmar ubicación");
                dialog.setSize(300, 100);
                dialog.setLocation(jSolapasTurno.getLocationOnScreen());
                                
                JPanel panel = new JPanel();

                panel.setLayout(new FlowLayout(FlowLayout.CENTER));
                panel.add(new JLabel("¿El marcador coincide con su domicilio?"));
                JPanel buttonPanel = new JPanel();
                JButton aceptar = new JButton("SI");
                JButton rechazar = new JButton("NO");
                buttonPanel.add(aceptar);
                buttonPanel.add(rechazar);
                panel.add(buttonPanel);
                           

                aceptar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dtaCorda.setLatitud(coordenadas1.getLatitude());
                        dtaCorda.setLongitud(coordenadas1.getLongitude());
                        vacunatorioCercano();
                        dialog.dispose();
                        frame.setVisible(false);
                    }
                });
                    
                rechazar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        punto_referencia.setWaypoints(Collections.emptySet());
                        dialog.dispose();
                    }
                });
                panel.add(aceptar);
                panel.add(rechazar);
                dialog.add(panel);
                dialog.setVisible(true  );
            }
        });
        frame.getContentPane().add(mapKit);
        frame.setVisible(true);
        c1.setCordenadas(dtaCorda);

    }

    private void armarCiudadano() {
        c1.setEmail(jTexto_email.getText());
        c1.setCelular(Integer.parseInt(jTexto_celular.getText()));
        c1.setAmbitoTrabajo(jCB_ambitoTrabajo.getSelectedItem().toString());
        c1.setDosisAplicadas(0);
        c1.setFechaNacimiento(jDC_fechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }

    private void patologiaUpdate() {
        cD.cargarPatologia(c1,
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
    }

    private void proximo_Turnoslibres(LocalDate fecha) {
        LocalDate fecha1 = null;
        if(jRadio_no.isSelected()){
            fecha1 = fecha;
        } else if (jRadio_altaMedicaSi.isSelected() && ChronoUnit.DAYS.between(fecha, LocalDate.now()) >= 14){
            fecha1 = LocalDate.now();
        } else if (jRadio_altaMedicaSi.isSelected() && ChronoUnit.DAYS.between(fecha, LocalDate.now()) < 14){
            fecha1 = fecha.plusDays(14);
        } else if (jRadio_altaMedicaNo.isSelected() && ChronoUnit.DAYS.between(fecha, LocalDate.now()) >= 28){
            fecha1 = LocalDate.now();
        } else if (jRadio_altaMedicaNo.isSelected() && ChronoUnit.DAYS.between(fecha, LocalDate.now()) < 28){
            fecha1 = fecha.plusDays(28);
        }
        if (fecha1.isEqual(LocalDate.now())){
            fecha1 = fecha1.plusDays(1);
        }

        if (c1.getAmbitoTrabajo().equals("Educación") || c1.getAmbitoTrabajo().equals("Sanidad y Medicina")) {
            jDC_dosis.setDate(java.sql.Date.valueOf(fecha1));
            buscarHorariosLibres(jDC_dosis.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else if (!c1.getAmbitoTrabajo().equals("Educación") && !c1.getAmbitoTrabajo().equals("Sanidad y Medicina")) {
            int turnos_libres;
            do {
                turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha1, masCercano);
                fecha1 = fecha1.plusDays(1);
            } while (turnos_libres <= 0);
            jDC_dosis.setDate(java.sql.Date.valueOf(fecha1.minusDays(1)));
            buscarHorariosLibres(jDC_dosis.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
         }
    }

    private void buscarHorariosLibres(LocalDate date) {
        if (c1.getAmbitoTrabajo().equals("Educación") || c1.getAmbitoTrabajo().equals("Sanidad y Medicina")) {
            String[] horarios = {"8 a 9", "9 a 10", "10 a 11", "11 a 12", "12 a 13", "13 a 14", "14 a 15", "15 a 16", "16 a 17"};
            DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>(horarios);
            jComboBox2.setModel(cbModel);
        } else if (!c1.getAmbitoTrabajo().equals("Educación") && !c1.getAmbitoTrabajo().equals("Sanidad y Medicina")) {
            ArrayList<String> turnos = tD.armarArrayHorariosLibres(date, masCercano);
            DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>(turnos.toArray(new String[0]));
            jComboBox2.setModel(cbModel);
        }
    }

    public void vacunatorioCercano() {
        double distancia;
        double min;
        ArrayList<Vacunatorio> listaCentros = vD.listarVacunatorio();

        Vacunatorio vac1 = listaCentros.get(0);
        min = Math.sqrt(((vac1.getUbicacion().getLatitud() - dtaCorda.getLatitud()) * (vac1.getUbicacion().getLatitud() - dtaCorda.getLatitud())) + ((vac1.getUbicacion().getLongitud() - dtaCorda.getLongitud()) * (vac1.getUbicacion().getLongitud() - dtaCorda.getLongitud())));

        for (Vacunatorio vacunatorio : listaCentros) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud())));
            if (min > distancia) {
                min = distancia;
            }
        }
        for (Vacunatorio vacunatorio : listaCentros) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud())));
            if (distancia == min) {
                masCercano = vacunatorio;
                jText_nombreVacunatorio.setText(masCercano.getNombre());
                jText_direccionVac.setText(masCercano.getDireccion());
            }
        }
    }

    private void controlFlujoInfo(){
        if (jDC_fechaNacimiento.getDate() == null){
            JOptionPane.showMessageDialog(null, "Formato de fecha nacimiento incorrecto");
        } else {
            try {
            if (!jTexto_email.getText().contains("@") || !jTexto_email.getText().contains(".com")) {
                JOptionPane.showMessageDialog(null, "Formato de E-mail incorrecto");
            } else {
                Integer.parseInt(jTexto_celular.getText());
                if (!jTexto_email.getText().isEmpty() && !jTexto_celular.getText().isEmpty() && jCB_ambitoTrabajo.getSelectedItem() != null && masCercano != null) {
                    JOptionPane.showMessageDialog(null, "Actualizacion de datos correcta");
                    jButton_Siguiente.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Complete todos los datos");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de telefono incorrecto");
        }
    }
}
    
    private void armarjDC_ATr(LocalDate fechaNacmiento){
        DefaultComboBoxModel ambitos;
       String[] trabajos;
        if (ChronoUnit.YEARS.between(fechaNacmiento, LocalDate.now()) > 17 ){
            trabajos = new String[] {"Sanidad y Medicina", "Educación", "Estudiante", "Servicios Financieros", "Gobierno y Administración Pública", "Arte y Entretenimiento","Agricultura y Agroindustria", "Construcción y Arquitectura", "Monotributista", "Trabajo Informal", "Privado", "Estudiante Java", "Desempleado","Otro"}; ;
            jLabel17.setText("Ámbito de Trabajo");
            ambitos = new DefaultComboBoxModel(trabajos);
          } else {
        jLabel17.setText("Ciclo educacion");
         trabajos = new String[] {"Estudiante Inicial","Estudiante Primaria","Educacion Secundaria","Otro","Abandono"};
         ambitos = new DefaultComboBoxModel(trabajos);
        }        
        jCB_ambitoTrabajo.setModel(ambitos);
    }
}
