package Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.PatologiaData;
import Conexion.geoData;
import Entidades.Ciudadano;
import Entidades.Coordenadas;
import Entidades.Patologias;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inscripcion extends javax.swing.JInternalFrame {

    geoData gD = new geoData();
    Direccion dR = new Direccion();
    PatologiaData pD = new PatologiaData();
    
    private Ciudadano c1;
    private CiudadanoData cD;
    private Coordenadas dataCord;
    private String ciudad;

    public Inscripcion(CiudadanoData cD) {
        this.cD = cD;
        initComponents();
        armarElementos();
        armadoVista();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        Diabetes = new javax.swing.JLabel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel_dataCiudadano = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        Diabetes1 = new javax.swing.JLabel();
        jRadioButton22 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton23 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton26 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel_dataCiudadano1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        TextoApellido = new javax.swing.JLabel();
        AgregarAlumno = new javax.swing.JButton();
        jTextoApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextoDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTexto_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTexto_ciudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTexto_celular1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        Diabetes2 = new javax.swing.JLabel();
        jRadioButton40 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton41 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton42 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton43 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton44 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        scrollPane1 = new java.awt.ScrollPane();

        jRadioButton11.setText("Si");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jRadioButton12.setText("No");

        jRadioButton13.setText("Si");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        Diabetes.setText("Diabetes");

        jRadioButton14.setText("No");

        jLabel4.setText("Enfermedades Cardiovasculares");

        jRadioButton15.setText("Si");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        jLabel10.setText("Enfermedades Respiratorias Crónicas");

        jRadioButton16.setText("No");

        jLabel11.setText("Obesidad");

        jRadioButton17.setText("Si");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });

        jLabel12.setText("Enfermedades Renales Crónicas");

        jRadioButton18.setText("No");

        jLabel13.setText("Embarazo");

        jLabel14.setText("Enfermedades Neurológicas");

        jButton2.setText("ACEPTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Inmunosupresion");

        jLabel16.setText("Enfermedades Hepáticas");

        jRadioButton1.setText("Si");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("No");

        jRadioButton3.setText("Si");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("No");

        jRadioButton5.setText("Si");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("No");

        jRadioButton7.setText("Si");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("No");

        jRadioButton9.setText("Si");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setText("No");

        jRadioButton19.setText("Si");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        jRadioButton20.setText("No");

        jRadioButton21.setText("Si");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });

        Diabetes1.setText("Diabetes");

        jRadioButton22.setText("No");

        jLabel17.setText("Enfermedades Cardiovasculares");

        jRadioButton23.setText("Si");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });

        jLabel18.setText("Enfermedades Respiratorias Crónicas");

        jRadioButton24.setText("No");

        jLabel19.setText("Obesidad");

        jRadioButton25.setText("Si");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });

        jLabel20.setText("Enfermedades Renales Crónicas");

        jRadioButton26.setText("No");

        jLabel21.setText("Embarazo");

        jLabel22.setText("Enfermedades Neurológicas");

        jButton3.setText("ACEPTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel23.setText("Inmunosupresion");

        jLabel24.setText("Enfermedades Hepáticas");

        jRadioButton27.setText("Si");
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });

        jRadioButton28.setText("No");

        jRadioButton29.setText("Si");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });

        jRadioButton30.setText("No");

        jRadioButton31.setText("Si");
        jRadioButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton31ActionPerformed(evt);
            }
        });

        jRadioButton32.setText("No");

        jRadioButton33.setText("Si");
        jRadioButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton33ActionPerformed(evt);
            }
        });

        jRadioButton34.setText("No");

        jRadioButton35.setText("Si");
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton35ActionPerformed(evt);
            }
        });

        jRadioButton36.setText("No");

        setAutoscrolls(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 414, -1, -1));

        TextoApellido.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        TextoApellido.setText("APELLIDO");
        getContentPane().add(TextoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, 116, -1));

        AgregarAlumno.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        AgregarAlumno.setText("Siguiente");
        AgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 414, -1, -1));

        jTextoApellido.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTextoApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextoApellido.setBorder(null);
        jTextoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 59, 426, -1));

        jLabel5.setBackground(new java.awt.Color(255, 51, 102));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CARGAR DATOS");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 188, 23));

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, 110, -1));

        TextoNombre.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        TextoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoNombre.setBorder(null);
        getContentPane().add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 90, 426, -1));

        jLabel3.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 115, 108, -1));

        TextoDni.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        TextoDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoDni.setBorder(null);
        getContentPane().add(TextoDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 121, 426, -1));

        jLabel6.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel6.setText("E-mail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 149, 108, -1));

        jTexto_email.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTexto_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_email.setBorder(null);
        getContentPane().add(jTexto_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 152, 426, -1));

        jLabel7.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel7.setText("Ámbito de trabajo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 231, 161, -1));

        jTexto_ciudad.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTexto_ciudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_ciudad.setBorder(null);
        jTexto_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTexto_ciudadKeyReleased(evt);
            }
        });
        getContentPane().add(jTexto_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 271, 432, -1));

        jLabel8.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel8.setText("Telefono celular");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 180, 161, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 234, 260, -1));

        jLabel9.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel9.setText("Ciudad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 271, 161, -1));

        jTexto_celular1.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTexto_celular1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_celular1.setBorder(null);
        getContentPane().add(jTexto_celular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 192, 426, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 302, 349, 94));

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 338, -1, -1));

        jRadioButton37.setText("Si");
        jRadioButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton37ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, -1, -1));

        jRadioButton38.setText("No");
        getContentPane().add(jRadioButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        jRadioButton39.setText("Si");
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, -1, -1));

        Diabetes2.setText("Diabetes");
        getContentPane().add(Diabetes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 137, 28));

        jRadioButton40.setText("No");
        getContentPane().add(jRadioButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, -1));

        jLabel25.setText("Enfermedades Cardiovasculares");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 198, 28));

        jRadioButton41.setText("Si");
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, -1, -1));

        jLabel26.setText("Enfermedades Respiratorias Crónicas");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 208, 31));

        jRadioButton42.setText("No");
        getContentPane().add(jRadioButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, -1, -1));

        jLabel27.setText("Obesidad");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 137, 31));

        jRadioButton43.setText("Si");
        jRadioButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton43ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, -1, -1));

        jLabel28.setText("Enfermedades Renales Crónicas");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 208, 40));

        jRadioButton44.setText("No");
        getContentPane().add(jRadioButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, -1, -1));

        jLabel29.setText("Embarazo");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 137, 40));

        jLabel30.setText("Otros");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 70, 40));

        jButton4.setText("ACEPTO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 720, 610, -1));

        jLabel31.setText("Inmunosupresion");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 137, 40));

        jLabel32.setText("Enfermedades Hepáticas");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 208, 40));

        jRadioButton45.setText("Si");
        jRadioButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton45ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jRadioButton46.setText("No");
        getContentPane().add(jRadioButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        jRadioButton47.setText("Si");
        jRadioButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton47ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        jRadioButton48.setText("No");
        getContentPane().add(jRadioButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));

        jRadioButton49.setText("Si");
        jRadioButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton49ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        jRadioButton50.setText("No");
        getContentPane().add(jRadioButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        jRadioButton51.setText("Si");
        jRadioButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton51ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, -1, -1));

        jRadioButton52.setText("No");
        getContentPane().add(jRadioButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, -1, -1));

        jRadioButton53.setText("Si");
        jRadioButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton53ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, -1, -1));

        jRadioButton54.setText("No");
        getContentPane().add(jRadioButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, -1, -1));

        jLabel33.setText("Enfermedades Neurológicas");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 208, 40));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, 240, -1));

        scrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPane1.setVisible(false);
        getContentPane().add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 660, 1310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAlumnoActionPerformed
        cargarDatosMariaDB();
    }//GEN-LAST:event_AgregarAlumnoActionPerformed

    private void jTextoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoApellidoActionPerformed

    private void jTexto_ciudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexto_ciudadKeyReleased
        completarTabla(gD.buscarCiudad(jTexto_ciudad.getText()));
    }//GEN-LAST:event_jTexto_ciudadKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            ciudad = jTable1.getValueAt(filaSeleccionada, 0).toString();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        dataCord = dR.init(gD.buscarCiudad(ciudad).get(0));
    }//GEN-LAST:event_BuscarActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton35ActionPerformed

    private void jRadioButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton33ActionPerformed

    private void jRadioButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton31ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed

    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        patologiaUpdate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        patologiaUpdate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton37ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void jRadioButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton43ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        patologiaUpdate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton45ActionPerformed

    }//GEN-LAST:event_jRadioButton45ActionPerformed

    private void jRadioButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton47ActionPerformed

    private void jRadioButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton49ActionPerformed

    private void jRadioButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton51ActionPerformed

    private void jRadioButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton53ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAlumno;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Diabetes;
    private javax.swing.JLabel Diabetes1;
    private javax.swing.JLabel Diabetes2;
    private javax.swing.JLabel TextoApellido;
    private javax.swing.JTextField TextoDni;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel jLabel_dataCiudadano;
    private javax.swing.JLabel jLabel_dataCiudadano1;
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
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextoApellido;
    private javax.swing.JTextField jTexto_celular1;
    private javax.swing.JTextField jTexto_ciudad;
    private javax.swing.JTextField jTexto_email;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void armarElementos() {
        String[] trabajos = {"Sanidad y Medicina", "Educación", "Servicios Financieros", "Gobierno y Administración Pública", "Arte y Entretenimiento",
            "Agricultura y Agroindustria", "Construcción y Arquitectura", "Monotributista", "Trabajo Informal", "Privado"};
        DefaultComboBoxModel ambitos = new DefaultComboBoxModel(trabajos);
        jComboBox1.setModel(ambitos);

        modelo.setColumnCount(0);
        modelo.addColumn("Ciudad");
        jTable1.setModel(modelo);
        jTable1.getTableHeader().setReorderingAllowed(false);
    }

    private void cargarDatosMariaDB() {
        int update;
        ArrayList<Patologias> patol = new ArrayList<>();
        
        Ciudadano c1 = new Ciudadano(Integer.parseInt(TextoDni.getText()),
                TextoNombre.getText(),
                jTextoApellido.getText(),
                jTexto_email.getText(),
                Integer.parseInt(jTexto_ciudad.getText()),
                jComboBox1.getSelectedItem().toString(),
                null,
                0,
                dataCord,
                null);

        update = cD.cargaCiudadano(c1);

        this.dispose();
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
                jRadioButton17.isSelected());

        JOptionPane.showMessageDialog(null, "En caso de error, comunicarse con el Astronauta Daniel Vidaurre.");
        this.dispose();
    }
}

