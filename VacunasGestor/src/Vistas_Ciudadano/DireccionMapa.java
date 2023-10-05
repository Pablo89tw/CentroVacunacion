package Vistas_Ciudadano;

import Entidades.Coordenadas;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;

public class DireccionMapa extends javax.swing.JInternalFrame {
   
    private Coordenadas data;
    
    public DireccionMapa() {
        initComponents();
        
        init();
    }

  public Coordenadas init() {
        JXMapKit mapKit = new JXMapKit();
        mapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);

        // Establece la ubicación inicial y el nivel de zoom
        GeoPosition centerPosition = new GeoPosition(-31.56546, -65.654654);
        mapKit.setCenterPosition(centerPosition);
        mapKit.setZoom(10);

        // Crea un JFrame para contener el mapKit
        JFrame frame = new JFrame("Mapa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 900);

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
                if (coordenadas1 != null){
                data = new Coordenadas();
                data.setLatitud(coordenadas1.getLatitude());
                data.setLongitud(coordenadas1.getLongitude());
                }
            
            }
        });
        frame.getContentPane().add(mapKit);
        frame.setVisible(true);
        return data;
    } 
  
    private MouseInputListener PanMouseInputListener(JFrame frame) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
