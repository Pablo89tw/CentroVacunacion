package Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Entidades.Ciudadano;
import Entidades.Turno;
import javax.swing.table.DefaultTableModel;

public class Datos_Ciudadano extends javax.swing.JInternalFrame {

    CiudadanoData cD = new CiudadanoData();
    TurnoData tD = new TurnoData();
    
    private Ciudadano c1;
   
    public Datos_Ciudadano(int dni_usuario) {
   
        initComponents();
        armadoTextos(cD.datosCiudadano(dni_usuario), tD.datosTurno(dni_usuario));
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cerrar = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Nombre_Apellido = new javax.swing.JTextField();
        Fecha_ProximoTurno = new javax.swing.JTextField();
        Dosis = new javax.swing.JTextField();
        Centro_Vacunacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPatologias = new javax.swing.JTable();

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        TablaPatologias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaPatologias);

        jDesktopPane1.setLayer(Nombre_Apellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Fecha_ProximoTurno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Dosis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Centro_Vacunacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Centro_Vacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha_ProximoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dosis, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Nombre_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Centro_Vacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Fecha_ProximoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Dosis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Centro_Vacunacion;
    private javax.swing.JButton Cerrar;
    private javax.swing.JTextField Dosis;
    private javax.swing.JTextField Fecha_ProximoTurno;
    private javax.swing.JTextField Nombre_Apellido;
    private javax.swing.JTable TablaPatologias;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void armadoTextos(Ciudadano cd1, Turno tur1) {
 
        Nombre_Apellido.setText(cd1.getApellido() + " " + cd1.getNombre());
        Centro_Vacunacion.setText(tur1.getVacunatorio().getNombre() + " " + tur1.getVacunatorio().getDireccion());
        Fecha_ProximoTurno.setText(tur1.getFecha().toString());
        Dosis.setText(Integer.toString(cd1.getDosisAplicadas()) + " Dosis");

        DefaultTableModel modelo = new DefaultTableModel();
        TablaPatologias.setModel(modelo);
        modelo.addColumn("Patologias");

        for (String patologias : cD.patologiasLista(cd1.getDNI())) {
           modelo.addRow(new Object[]{patologias});
        }
        if (modelo.getRowCount() == 0){
            modelo.addRow(new Object[]{"No hay patologias declaradas"});
        }
        
    }
}
