package Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Entidades.Ciudadano;
import javax.swing.DefaultComboBoxModel;

public class Inscripcion extends javax.swing.JInternalFrame {
    
    private CiudadanoData cD;
    
    public Inscripcion(CiudadanoData cD) {
        initComponents();
        armarComboBox();
        this.cD = cD;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jTexto_celular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextoApellido.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        TextoApellido.setText("APELLIDO");

        AgregarAlumno.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        AgregarAlumno.setText("Agregar");
        AgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlumnoActionPerformed(evt);
            }
        });

        jTextoApellido.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTextoApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextoApellido.setBorder(null);
        jTextoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoApellidoActionPerformed(evt);
            }
        });

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

        jTexto_celular.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTexto_celular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_celular.setBorder(null);

        jLabel8.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel8.setText("Telefono celular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexto_email, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                                .addComponent(TextoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextoDni, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AgregarAlumno)
                                    .addGap(26, 26, 26)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexto_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoApellido)
                .addGap(0, 0, 0)
                .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(TextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTexto_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTexto_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(AgregarAlumno))
                .addContainerGap(31, Short.MAX_VALUE))
        );

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAlumno;
    private javax.swing.JLabel TextoApellido;
    private javax.swing.JTextField TextoDni;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextoApellido;
    private javax.swing.JTextField jTexto_celular;
    private javax.swing.JTextField jTexto_email;
    // End of variables declaration//GEN-END:variables

private void armarComboBox(){
    String[] trabajos = {"Sanidad y Medicina", "Educación", "Servicios Financieros", "Gobierno y Administración Pública","Arte y Entretenimiento",
    "Agricultura y Agroindustria", "Construcción y Arquitectura","Monotributista","Trabajo Informal","Privado"};
    DefaultComboBoxModel ambitos = new DefaultComboBoxModel(trabajos);  
    jComboBox1.setModel(ambitos);
}
    
private void cargarDatosMariaDB(){
    int update;
    Ciudadano c1 = new Ciudadano(Integer.parseInt(TextoDni.getText()), 
            TextoNombre.getText(), 
            jTextoApellido.getText(), 
            jTexto_email.getText(),
            Integer.parseInt(jTexto_celular.getText()),
            null,
            jComboBox1.getSelectedItem().toString());         
    
    update = cD.cargaCiudadano(c1);
    this.dispose();
    if (update >0){
        Test ts = new Test();
        ts.cargarPatologiasPane(c1);
    }
    }
        
}



